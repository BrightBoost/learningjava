package com.pluralsight.week3.workshop;

import java.time.LocalDate;

public class Product {
    private String sku;
    private String productName;
    private double price;
    private String department;
    private LocalDate releaseDate;

    public Product(String sku, String productName, double price, String department, LocalDate releaseDate) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", department='" + department + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
