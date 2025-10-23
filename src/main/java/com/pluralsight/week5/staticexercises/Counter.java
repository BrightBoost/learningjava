package com.pluralsight.week5.staticexercises;

public class Counter {
    private int value;
    private static int total;

    public void increment() {
        value++;
        total++;
    }

    public static void printTotal() {
        // System.out.println(value); // in a static context, we cant access non static context
        System.out.println(total);
    }
}
