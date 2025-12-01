package com.pluralsight.week10;

import java.sql.*;
import java.util.InputMismatchException;

public class CloseWithTryWithResources {
    public static void main(String[] args) {
        String query = "SELECT * FROM products;";

        if(args.length < 2) {
            System.out.println("Can't run the application without two arguments");
            System.exit(1);
        }

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
        ) {

            while(resultSet.next()) {
                System.out.println(resultSet.getString("ProductName"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
