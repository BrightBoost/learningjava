package com.pluralsight.week10.shipperexercise;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static ShipperDao shipperDao;

    public static void main(String[] args) {
        init(args[0], args[1]);
        runHomeScreen();
    }

    private static void init(String username, String password) {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        shipperDao = new ShipperDao(basicDataSource);
    }

    public static void runHomeScreen() {
        String options = """
                What do you want to do?
                1) See all shippers
                2) Add a shipper
                3) Update the phone number of a shipper
                4) Delete a shipper
                0) End program
                """;

        boolean programRunning = true;
        while(programRunning) {
            System.out.println(options);
            int chosenOption = Integer.parseInt(scanner.nextLine());
            programRunning = handleUserChoice(chosenOption);
        }
    }

    public static boolean handleUserChoice(int choice) {
        switch(choice) {
            case 1:
                displayShipper(shipperDao.getAllShippers());
                break;
            case 2:
                shipperDao.addNewShippers(createShipper());
                break;
            case 3:
                System.out.println("What's the id of the shipper you want to change?");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("What's the new phone number?");
                String phone = scanner.nextLine();
                shipperDao.updatePhoneNumber(id, phone);
                break;
            case 4:
                System.out.println("What's the id of the shipper you want to delete?");
                shipperDao.deleteShipperById(Integer.parseInt(scanner.nextLine()));
                break;
            case 0:
                return false;
            default:
                System.out.println("Sorry I don't know that option. Please try again.");
        }
        return true;
    }

    public static void displayShipper(List<Shipper> shippers) {
        for(Shipper shipper : shippers) {
            System.out.println(shipper);
        }
    }

    public static Shipper createShipper() {
        System.out.println("What is the name of the new shipper?");
        String name = scanner.nextLine();
        System.out.println("What's the phone nr of the new shipper?");
        String phone = scanner.nextLine();
        return new Shipper(0, name, phone);
    }
}
