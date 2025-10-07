package com.pluralsight.week3;

import java.util.Scanner;

public class MoreExceptions {
    public static void main(String[] args) {
        boolean done = false;
        Scanner scanner = new Scanner(System.in);

        while(!done) {
            try {
                System.out.println("Please enter 1 int:");
                int nr1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please enter a 2nd int:");
                int nr2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Integer dividing these numbers has the following result: " + (nr1 / nr2));
                done = true;
            } catch (Exception e) {
                System.out.println("There was a problem: " + e.getMessage());
                System.out.println("Please try again. (Possibly press enter to continue)");
                scanner.nextLine();
            }
        }
    }
}
