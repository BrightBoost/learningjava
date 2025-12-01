package com.pluralsight.week10;

import java.sql.*;
import java.util.Scanner;

public class ProblemWithStatement {
    private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            String name = getUserInput("What blabla do you want to see?");
            try {
                // Step 1: open the connection
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "root");

                // Step 2: create a statement (query holder)
                Statement statement = connection.createStatement();

                // Step 3a: execute the query
                String query = "SELECT * FROM Blabla WHERE name = '" + name + "';";
                System.out.println(query);
                ResultSet resultSet = statement.executeQuery(query);

                // Step 3b: process the results
                while(resultSet.next()) {
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
