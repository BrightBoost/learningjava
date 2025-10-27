package com.pluralsight.week5.workshop;

import java.util.Objects;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicletype;
    private String color;
    private int odometer;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicletype, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicletype = vehicletype;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vin == vehicle.vin && year == vehicle.year && odometer == vehicle.odometer && Double.compare(price, vehicle.price) == 0 && Objects.equals(make, vehicle.make) && Objects.equals(model, vehicle.model) && Objects.equals(vehicletype, vehicle.vehicletype) && Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, year, make, model, vehicletype, color, odometer, price);
    }

    public String getVehicleCsvLine() {
        return vin + "|" + year + "|" + make + "|" + model + "|" + vehicletype + "|" + color + "|" + odometer + "|" + price;
    }
}
