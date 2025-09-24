package com.pluralsight.week1;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        //(5, 10) and (85, 50)
        double distance = Math.sqrt(Math.pow(5 - 85, 2) + Math.pow(10 - 50, 2));
        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println("Blabla");
        System.out.print("test");

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        System.out.println(totalDue);
        float pay = 5239.77f;
        System.out.printf("Total due is: %.2f\n", totalDue);
        System.out.printf("Total due is: %.2f and subtotal is %.2f\n", totalDue, subtotal);

        int id = 10135;
        String name = "Brandon Plyers";
        System.out.printf("%s (id: %d) $%.3f", name, id, pay);
    }
}
