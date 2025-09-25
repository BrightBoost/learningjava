package com.pluralsight.week1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // get two numbers
        System.out.println("Please enter a number:");
        double nr1 = scanner.nextDouble();

        System.out.println("Please enter another number:");
        double nr2 = scanner.nextDouble();
        scanner.nextLine();

        // get an operation
        String prettyPrint = """
                Possible calculations:
                  (A)dd
                  (S)ubtract
                  (M)ultiply
                  (D)ivide
                Please select an option:
                """;
        System.out.println(prettyPrint);
        String operation = scanner.nextLine();

        // do a multiplication
        double result = nr1 * nr2;

        // print the calculation and result
        System.out.printf("%f * %f = %f", nr1, nr2, result);
    }
}
