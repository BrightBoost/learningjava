package com.pluralsight.week10;

import java.sql.*;
import java.util.Scanner;

public class RecapDemoJDBC {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What product do you want to search for?");
        String productToSearchFor = scanner.nextLine();
        try {
            // connect
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "root");

            // query
            String query = "SELECT * FROM Products WHERE ProductName LIKE ?";

            // execute
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + productToSearchFor + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            // process
            while(resultSet.next()) {
                System.out.println(resultSet.getString("ProductName"));
            }

        } catch(SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
