package com.pluralsight.week10.workbookexercise;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class NorthwindProductsWithDataSource {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("We need two program variables");
            System.exit(1);
        }
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(args[0]);
        dataSource.setPassword(args[1]);

        displayHomescreen();
        int choice = Integer.parseInt(getUserInput("Select an option:"));
        switch(choice) {
            case 2:
                displayAllCustomers(dataSource);
                break;
            case 3:
                displayAllCategories(dataSource);
                diisplayProductsByCategoryId(dataSource);
                break;
            default:
                System.out.println("Not available now.");
        }
    }

    public static void displayHomescreen() {
        String options = """
                What do you want to do?
                1) Display all products
                2) Display all customers
                3) Display all categories
                0) Exit
                """;
        System.out.println(options);
    }

    public static String getUserInput(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }

    public static void displayAllCustomers(DataSource dataSource) {
        try( Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM customers");
             ResultSet resultSet = statement.executeQuery();
        ) {

            while(resultSet.next()) {
                System.out.printf("Customer name: %s | Company name: %s | City: %s | Country: %s | Phone number: %s\n", resultSet.getString("ContactName"), resultSet.getString("CompanyName"), resultSet.getString("City"), resultSet.getString("Country"), resultSet.getString("Phone"));
            }
        ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void displayAllCategories(DataSource dataSource) {
        try( Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM categories ORDER BY CategoryID");
             ResultSet resultSet = statement.executeQuery();
        ) {

            while(resultSet.next()) {
                System.out.printf("Category ID: %s | Category name: %s\n", resultSet.getString("CategoryID"), resultSet.getString("CategoryName"));
            }
            ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void diisplayProductsByCategoryId(DataSource dataSource) {
        int catId = Integer.parseInt(getUserInput("Which category do you want to see? Please enter the ID:"));
        try( Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM Products WHERE CategoryID = ?");
        ) {

            statement.setInt(1, catId);
            try(ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.printf("Product ID: %s | Product name: %s | Unit Price: %.2f | Units in stock: %d\n", resultSet.getString("ProductId"), resultSet.getString("ProductName"), resultSet.getFloat("UnitPrice"), resultSet.getInt("UnitsInStock"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
