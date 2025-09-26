package com.pluralsight.week1;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        // create a scanner
        Scanner scanner = new Scanner(System.in);
        // prompt the user for size
        System.out.println("Do you what a regular(1) or a large(2) sandwich?");
        int sandwichSizeChoice = scanner.nextInt();
        scanner.nextLine();
        // prompt for loaded sandwich
        System.out.println("Would you want that loaded? Yes/No");
        String loadedAnswer = scanner.nextLine();
        // prompt the user for age
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        // calculate sandwich price
        // set baseprice
        double totalSandwichPrice = 0;
        if(sandwichSizeChoice == 1) {
            totalSandwichPrice = 5.45;
        } else if(sandwichSizeChoice == 2) {
            totalSandwichPrice = 8.95;
        } else {
            System.out.println("That is not an option.");
            System.out.println("Bye.");
            System.exit(0);
        }

        // calculate loaded
        if(sandwichSizeChoice == 1 && loadedAnswer.equalsIgnoreCase("yes")) {
            totalSandwichPrice += 1;
        } else if(sandwichSizeChoice ==2 && loadedAnswer.equalsIgnoreCase("yes")) {
            totalSandwichPrice += 1.75;
        }

        // same thing but nested if statement
//        if(loadedAnswer.equalsIgnoreCase("yes")) {
//            if(sandwichSizeChoice == 1) {
//                totalSandwichPrice += 1;
//            } else {
//                totalSandwichPrice += 1.75;
//            }
//        }

        // calculate discount
        if(age <= 17) {
            totalSandwichPrice *= 0.9;
        } else if(age >= 65) {
            totalSandwichPrice *= 0.8;
        }

        System.out.printf("The total is %.2f", totalSandwichPrice);
    }
}
