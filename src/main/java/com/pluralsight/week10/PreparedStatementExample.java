package com.pluralsight.week10;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementExample {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //String name = getUserInput("What blabla do you want to see?");
        try {
            // Step 1: open the connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "root");

            // Step 2: create a prepared statement (query holder)
            String query = "SELECT * FROM Blabla " +
                    "WHERE name = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, "blabla");

            // Step 3a: execute the query
            ResultSet resultSet = statement.executeQuery(); // for prepared statement, don't pass in string

            // Step 3b: process the results
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name") + " - " + resultSet.getString("Quantity"));
            }

            // Step 4: we close the connection
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getUserInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
