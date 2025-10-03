package com.pluralsight.week2;

public class LoopsExplained {
    public static void main(String[] args) {
        exampleWithoutBreak();
    }

    public static void exampleWithoutBreak() {
        int sum = 0;
        boolean notFound = true;
        for(int i = 1; i <= 10 && notFound; i++) {
            if (i % 3 == 0) {
                notFound = false;
            } else {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }

    public static void doWhileAndWhile() {
        int x = 10;
        while(x < 10) {
            System.out.println("value of x in while loop: " + x);
            x++;
        }

        do {
            System.out.println("value of x in do while loop: " + x);
            x++;
        } while(x < 10);
    }
    public static void averageWithArraysAndLoops() {
        int[] grades= {60, 67, 89, 78, 54, 56, 78, 89, 90};

        double sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = sum / grades.length;
        System.out.println("The average is: " + average);
    }

    public static void averageWithoutArraysAndLoops() {
        int grade1 = 60;
        int grade2 = 67;
        int grade3 = 89;

        double sum = grade1 + grade2 + grade3;
        double average = sum / 3;

        System.out.println("Average grade is: " + average);
    }
}
