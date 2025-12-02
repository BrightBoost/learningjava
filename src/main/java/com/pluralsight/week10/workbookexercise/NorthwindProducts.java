package com.pluralsight.week10.workbookexercise;

import java.sql.*;
import java.util.Scanner;

public class NorthwindProducts {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayHomescreen();
        int choice = Integer.parseInt(getUserInput("Select an option:"));
        switch(choice) {
            case 2:
                displayAllCustomers(args);
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
                0) Exit
                """;
        System.out.println(options);
    }

    public static String getUserInput(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }

    public static void displayAllCustomers(String[] args) {
        try( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
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
}
