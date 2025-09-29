package com.pluralsight.week2;

import java.util.Scanner;

public class TernaryExplained {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        boolean isEven;
        if(nr % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }
        System.out.println(isEven);
        // ternary condition is a simplified if else statement
        // condition ? valueForTrue : valueForFalse
        boolean isOdd = nr % 2 != 0 ? true : false; // ternary statement
        System.out.println(isOdd);

        int value = isOdd ? 100 : 66;
        System.out.println(value);
    }

}
