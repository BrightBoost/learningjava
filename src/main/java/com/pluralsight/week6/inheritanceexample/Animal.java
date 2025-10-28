package com.pluralsight.week6.inheritanceexample;

public class Animal {
    private String name;
    private int age;
    private String color;
    private double weight;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // constructor calls super() first
    // if no super() call is defined, it calls super() without arguments
    // if the super (parent) class does not have a constructor without params, that's a problem
    // super() can then not be called and has to be replaced with super(and, then, the, args)

    public Animal(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        System.out.println("In animal constructor with params");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
