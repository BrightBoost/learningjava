package com.pluralsight.week2.exercisecalcwithmethods;

public class Format {
    public static void main(String[] args) {
        System.out.println(formatName("Bob", "Smith"));
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}
