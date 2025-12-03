package com.pluralsight.week10.daoexample.dao;

import com.pluralsight.week10.daoexample.models.Category;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
