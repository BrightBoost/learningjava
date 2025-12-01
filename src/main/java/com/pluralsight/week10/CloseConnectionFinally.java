package com.pluralsight.week10;

import java.sql.*;

public class CloseConnectionFinally {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // Step 1: open the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "root");

            // Step 2: create a statement (query holder)
            statement = connection.createStatement();

            // Step 3a: execute the query
            String query = "SELECT * FROM products;";
            resultSet = statement.executeQuery(query);

            // Step 3b: process the results
            while(resultSet.next()) {
                System.out.println(resultSet.getString("ProductName"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(connection != null) {
                // Step 4: we close the connection
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
