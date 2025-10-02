package com.pluralsight.week2.oop;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog() {

    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void bark() {
        System.out.println(name + " says WOOF!");
    }
}
