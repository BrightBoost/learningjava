package com.pluralsight.week7.exampletestscanner;

import java.io.PrintStream;
import java.util.Scanner;

public class ScannerExample {
    public static int readIntBetween(Scanner in, PrintStream out, int min, int max) {
        while (true) {
            out.print("Enter a number between " + min + " and " + max + ": ");
            if (!in.hasNextLine()) {
                throw new IllegalStateException("No input available");
            }
            String line = in.nextLine().trim();
            try {
                int value = Integer.parseInt(line);
                if (value < min || value > max) {
                    out.println("Out of range.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                out.println("Not a number.");
            }
        }
    }

    // Typical usage in a CLI entry point:
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // OK to create at top-level
            int n = readIntBetween(sc, System.out, 1, 10);
            System.out.println("You chose: " + n);
        }
        // NOTE: don't close System.out; the try-with-resources only closes the Scanner.
    }
}
