package com.pluralsight.week10.daoexample;

import com.pluralsight.week10.daoexample.dao.CategoryDao;
import com.pluralsight.week10.daoexample.dao.ProductDao;
import com.pluralsight.week10.daoexample.models.Category;
import com.pluralsight.week10.daoexample.models.Product;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class NorthwindApplication {
    static Scanner scanner = new Scanner(System.in);
    static ProductDao productDao = null;
    static CategoryDao categoryDao = null;
    public static void main(String[] args) {
        init(args);
        runProgram();
    }

    public static void runProgram() {
        System.out.println("What do you want to do? 1) See all products or 2) search product by name?");
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                displayProduct(productDao.getAllProducts());
                break;
            case 2:
                System.out.println("What product are you search for?");
                displayProduct(productDao.getProductsByName(scanner.nextLine()));
                break;
            case 3:
                System.out.println("What category do you want to add?");
                int newKey = categoryDao.addCategoryReturnNewId(new Category(0, scanner.nextLine()));
                System.out.println(newKey);
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

        productDao = new ProductDao(basicDataSource);
        categoryDao = new CategoryDao(basicDataSource);
    }

    public static void displayProduct(List<Product> products) {
        products.forEach(s -> System.out.println(s));
    }


}
