package com.pluralsight.week1;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        String name = scanner.nextLine();
        System.out.printf("Hi %s\n", name);
        System.out.println("What's your favorite color?");
        String favColor = scanner.nextLine();
        System.out.printf("Wow, %s is a great color!", favColor);
    }
}
