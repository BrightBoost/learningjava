package com.pluralsight.week1;

import java.util.Scanner;

public class ReadingMixedInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "! What's your age?");
//        int age = Integer.parseInt(scanner.nextLine()); // workaround to not have to "eat" the CRLF
        int age = scanner.nextInt();
        // remove the end of line char that nextInt left (to avoid issues on line 17)
        scanner.nextLine();
        System.out.println("That's crazy, I once was " + age + " too! What's your favorite color?");
        String favColor = scanner.nextLine();
        System.out.println(favColor + "!");
    }
}
