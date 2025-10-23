package com.pluralsight.week5.staticexercises;

public class Cat {
    private String name;
    public static int catCount;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }
}
