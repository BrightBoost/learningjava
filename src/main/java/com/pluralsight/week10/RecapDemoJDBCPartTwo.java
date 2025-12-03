package com.pluralsight.week10;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class RecapDemoJDBCPartTwo {
    private static Scanner scanner = new Scanner(System.in);
    private static BasicDataSource basicDataSource = new BasicDataSource();

    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("We need to have program args for username and password for the database");
            System.exit(1);
        }

        init(args[0], args[1]);
        displayProductsByName(basicDataSource);

    }

    public static void init(String username, String password) {
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
    }

    public static void displayProductsByName(DataSource dataSource) {
        System.out.println("What product do you want to search for?");
        String productToSearchFor = scanner.nextLine();

        // query
        String query = "SELECT * FROM Products WHERE ProductName LIKE ?";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setString(1, "%" + productToSearchFor + "%");

            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                // process
                while(resultSet.next()) {
                    System.out.println(resultSet.getString("ProductName"));
                }
            }

        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
