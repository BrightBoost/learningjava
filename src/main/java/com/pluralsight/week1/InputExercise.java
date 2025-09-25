package com.pluralsight.week1;

/*
1. Create a new class called InputExercise
2. You are going to ask the user for the following details and store it in 3 variables:
   - Favorite animal
   - First tool that comes to mind
   - Number of day of birth day
2. You are going to print this in a silly sentence like:
    - Your favorite animal is elephant, first tool that comes to mind is a saw and the 24 is the day you were born.
 */

import java.util.Scanner;

public class InputExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite animal?");
        String animal = scanner.nextLine();
        System.out.println("What is the first tool that comes to mind?");
        String tool = scanner.nextLine();
        System.out.println("What is the number of your day of birth?");
        int dayOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your fav animal is " + animal + ", first tool that comes to mind is a " + tool + " and the " + dayOfBirth + " is the day you were born.");
        System.out.printf("Your fav animal is %s, first tool that comes to mind is a %s and the %d is the day you were born.", animal, tool, dayOfBirth);
    }
}
