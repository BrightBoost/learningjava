package com.pluralsight.week10.shipperexercise;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShipperDao {
    private DataSource dataSource;

    public ShipperDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // add a shipper
    public int addNewShippers(Shipper shipper) {
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO shippers(CompanyName, Phone) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS))
            {
                preparedStatement.setString(1, shipper.getName());
                preparedStatement.setString(2, shipper.getPhone());

                preparedStatement.executeUpdate();

                try(ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                    if(resultSet.next()) {
                        return resultSet.getInt(1);
                    }
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

    // get all shippers
    public List<Shipper> getAllShippers() {
        List<Shipper> shippers = new ArrayList<>();
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM shippers");
            ResultSet resultSet = preparedStatement.executeQuery()) {

            while(resultSet.next()) {
                int id = resultSet.getInt("ShipperID");
                String name = resultSet.getString("CompanyName");
                String phone = resultSet.getString("Phone");
                Shipper shipper = new Shipper(id, name, phone);
                shippers.add(shipper);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return shippers;
    }

    // update phone number shiper
    public void updatePhoneNumber(int id, String newPhoneNr) {
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE shippers SET Phone = ? WHERE ShipperId = ?"))
        {
            preparedStatement.setString(1, newPhoneNr);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // delete shipper
    public void deleteShipperById(int id) {
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM shippers WHERE ShipperId = ?"))
        {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
