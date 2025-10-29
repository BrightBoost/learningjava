package com.pluralsight.week6.shapes;

public class Square extends Shape {
    private double side;

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcCircumference() {
        return side * 4;
    }
}
