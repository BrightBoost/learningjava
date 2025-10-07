package com.pluralsight.week3;

import java.util.Scanner;

public class ExceptionExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correctValue = false;
        while (!correctValue) {
            try {
                String[] names = {
                        "Ezra", "Elisha", "Ian",
                        "Siddalee", "Pursalane", "Zephaniah"
                };
                System.out.print("Pick a kid (select #1 - #6): ");
                int index = scanner.nextInt();
                index--;
                System.out.println(names[index]);
                correctValue = true;
            } catch (Exception e) {
                System.out.println("Your number was out of range!");
                //  e.printStackTrace();
            }
        }
        scanner.close();
    }
}
