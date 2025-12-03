package com.pluralsight.week10.datamanagerexample;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NorthwindDataManager {
    private DataSource dataSource;

    public NorthwindDataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        // query
        String query = "SELECT * FROM Products";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()
        ) {

            while(resultSet.next()) {
                int id = resultSet.getInt("ProductId");
                String name = resultSet.getString("ProductName");
                double price = resultSet.getFloat("UnitPrice");

                products.add(new Product(id, name, price));
            }


        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public List<Product> getProductsByName(String productToSearchFor) {
        List<Product> products = new ArrayList<>();
        // query
        String query = "SELECT * FROM Products WHERE ProductName LIKE ?";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setString(1, "%" + productToSearchFor + "%");

            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                // process
                while(resultSet.next()) {
                    int id = resultSet.getInt("ProductId");
                    String name = resultSet.getString("ProductName");
                    double price = resultSet.getFloat("UnitPrice");

                    products.add(new Product(id, name, price));
                }
            }

        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
