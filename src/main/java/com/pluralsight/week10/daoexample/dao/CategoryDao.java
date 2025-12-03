package com.pluralsight.week10.daoexample.dao;

import com.pluralsight.week10.daoexample.models.Category;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
    private DataSource dataSource;

    public CategoryDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Categories");
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while(resultSet.next()) {
                categories.add(new Category(resultSet.getInt("CategoryId"), resultSet.getString("CategoryName")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categories;
    }

    public int addCategoryRowsAffected(Category category) {
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Categories (CategoryName) VALUES(?)");
        ) {
            preparedStatement.setString(1, category.getName());
            int nrOfRowsAffected = preparedStatement.executeUpdate();
            System.out.println(nrOfRowsAffected + " rows were affected.");
            return nrOfRowsAffected;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int addCategoryReturnNewId(Category category) {
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Categories (CategoryName) VALUES(?)", Statement.RETURN_GENERATED_KEYS);
        ) {
            preparedStatement.setString(1, category.getName());
            int nrOfRowsAffected = preparedStatement.executeUpdate();
            System.out.println(nrOfRowsAffected + " rows were affected.");

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
}
