package com.pluralsight.week6.shapes;

public class Circle extends Shape {
    private double r;


    @Override
    public double calcArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calcCircumference() {
        return 2 * Math.PI * r;
    }
}
