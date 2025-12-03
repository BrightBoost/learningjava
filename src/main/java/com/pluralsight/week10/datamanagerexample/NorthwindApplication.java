package com.pluralsight.week10.datamanagerexample;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class NorthwindApplication {
    static Scanner scanner = new Scanner(System.in);
    static NorthwindDataManager dataManager = null;
    public static void main(String[] args) {
        init(args);
        runProgram();
    }

    public static void runProgram() {
        System.out.println("What do you want to do? 1) See all products or 2) search product by name?");
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                displayProduct(dataManager.getAllProducts());
                break;
            case 2:
                System.out.println("What product are you search for?");
                displayProduct(dataManager.getProductsByName(scanner.nextLine()));
                break;
            default:
                System.out.println("Don't know that option");
                break;
        }
    }

    private static void init(String[] args) {
        if(args.length < 2) {
            System.out.println("Need 2 args");
            System.exit(1);
        }

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        basicDataSource.setUsername(args[0]);
        basicDataSource.setPassword(args[1]);

        dataManager = new NorthwindDataManager(basicDataSource);
    }

    public static void displayProduct(List<Product> products) {
        products.forEach(s -> System.out.println(s));
    }


}
