package com.pluralsight.week2.exercisecalcwithmethods;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isPositive(6));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }
}
