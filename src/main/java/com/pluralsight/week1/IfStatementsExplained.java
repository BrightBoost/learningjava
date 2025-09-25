package com.pluralsight.week1;

import java.util.Scanner;

public class IfStatementsExplained {
    public static void main(String[] args) {
        int age = 17;
        double price;
        if (age < 18) {
            price = 18.00;
            if(true) {
                System.out.println("blabla");
            }
        } else if (age < 65) {
            price = 25.00;
        } else {
            price = 18.00;
        }
        System.out.println("Price of admission: " + price);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it?");
        int hour = scanner.nextInt();

        // and in python &&
        // or in python ||
        if(hour > 19 || hour < 7) {
            System.out.println("It's bedtime for kids!");
        }

        double temp = 63;
        if(temp <= 62) {
            System.out.println("It is cold");
        } else {
            System.out.println("It isn't cold.");
        }

        boolean tryToSleep = false;
        boolean lightOn = true;

        if(tryToSleep && lightOn) {
            System.out.println("Turn light off");
        }
    }
}
