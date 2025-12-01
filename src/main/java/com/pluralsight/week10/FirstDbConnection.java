package com.pluralsight.week10;

import java.sql.*;

public class FirstDbConnection {
    public static void main(String[] args) {
        try {
            // Step 1: open the connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");

            // Step 2: create a statement (query holder)
            Statement statement = connection.createStatement();

            // Step 3a: execute the query
            String query = "SELECT * FROM city;";
            ResultSet resultSet = statement.executeQuery(query);

            // Step 3b: process the results
            while(resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }

            // Step 4: we close the connection
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
