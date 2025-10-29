package com.pluralsight.week6.shapes;

public class Rectangle extends Shape {
    private double side1;
    private double side2;

    @Override
    public double calcArea() {
        return side1 * side2;
    }

    @Override
    public double calcCircumference() {
        return side1 * 2 + side2 * 2;
    }
}
