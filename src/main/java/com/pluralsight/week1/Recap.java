package com.pluralsight.week1;

import java.util.Scanner;

public class Recap {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        methodWithParams("Ermiyas", 9);
    }

    public static void recapPrimitives() {
        // 8 primitives
        // simple types
        // whole numbers
        int i = 0;
        long j = 7L;
        byte b = 127;
        short s = 1000;
        char c = 'a';
        // floating point numbers
        float f = 4.5f;
        double d = 3.5;
        // true or false
        boolean bool = true;
    }

    public static void recapNonPrimitives() {
        // text values
        String text = "Almost weekend!";
        // helper class for getting input
        Scanner scanner = new Scanner(System.in);

    }

    public static void recapStringConcat() {
        String text = "hello " + "world!";
        System.out.println(text);
    }

    public static void mathOperators() {
        // + - / *
        double nr1 = 3.4;
        double nr2 = 5.8;
        double result = nr1 * nr2;

        // % remainder
        int i = 10;
        int j = 4;
        int remainder = i % j; // 2

        // divisions with int is special
        // double divisions are what you expect, int divisions cut off everything after floating point
        int x = 7;
        int y = 2;
        int resultDivision = x / y; // 3
    }

    public static void postAndPreIncrement() {
        int x = 5;
        System.out.println(x++); // prints 5
        System.out.println(++x); // prints 7
    }

    public static void assignmentOperators() {
        int x = 5;
        x += 4; // x = x + 4
        // also available for other operators: *= -= %= /=
    }

    public static void wideningNarrowingCasting() {
        long longValue = 56L;
        int intValue = (int) longValue; // narrowing, cast needed (storing a bigger type in smaller type)
        long x = intValue; // widening, small type to big type, no cast needed, always fits

    }

    public static void mathClass() {
        // Math class is for common math operations
        int maxValue = Math.max(10, 100);
        double result = Math.pow(3.4, 2);
        // and a lot more
    }

    public static void outputFormatting() {
        String weekend = "weekend";
        System.out.println("It is almost " + weekend); // without formatting
        System.out.printf("It is %s", weekend);
    }

    public static void scannerExample() {
        System.out.println("What is your name, fav nr and fav color?");
        String name = scanner.nextLine();
        int favNr = scanner.nextInt();
        scanner.nextLine();
        String favColor = scanner.nextLine();
        System.out.printf("hi %s, your fav nr is %d and fav color is %s", name, favNr, favColor);

    }

    public static void ifStatements() {
        String name = scanner.nextLine();
        if(name.equals("Maaike")) {
            System.out.println("You again?!");
        } else {
            System.out.println("Nice to meet you!");
        }
    }

    public static void methodWithParams(String name, int nr) {
        System.out.println("Hi " + name);
        if(nr % 2 == 0) {
            System.out.println(nr + " is an even nr!");
        } else {
            System.out.println(nr + " is an odd nr!");
        }
    }

    public static int methodWithReturnType() {
        return 3;
    }

    public static int methodWithReturnTypeAndParams(int x, int y) {
        return 3;
    }
}
