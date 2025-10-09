package com.pluralsight.week3.workshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    // load products from file
    public static List<Product> loadProductsFromFile(String fileName) {
        List<Product> products = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            bufferedReader.readLine();

            String productString;
            while((productString = bufferedReader.readLine()) != null) {
                String[] productArr = productString.split("\\|");
                Product product = new Product(productArr[0], productArr[1], Double.parseDouble( productArr[2]), productArr[3], LocalDate.parse(productArr[4], dtf));
                products.add(product);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    // display products
    public static void displayProducts(List<Product> products) {
        for(Product product : products) {
            System.out.println(product);
        }
    }

    // get products by name
    public static List<Product> getProductsByName(List<Product> products, String name) {
        List<Product> filteredProducts = new ArrayList<>();
        for(Product product : products) {
            if(product.getProductName().toLowerCase().contains(name.toLowerCase())) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    // get products by price range
    public static List<Product> getProductsByPrice(List<Product> products, double minPrice, double maxPrice) {
        List<Product> filteredProducts = new ArrayList<>();
        for(Product product : products) {
            if(product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    // get products by department
    public static List<Product> getProductsByDepartment(List<Product> products, String department) {
        List<Product> filteredProducts = new ArrayList<>();
        for(Product product : products) {
            if(product.getDepartment().toLowerCase().contains(department.toLowerCase())) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public static Product getProductBySku(List<Product> products, String sku) {
        for(Product product : products) {
            if(product.getSku().equalsIgnoreCase(sku)) {
                return product;
            }
        }
        return null;
    }

}
