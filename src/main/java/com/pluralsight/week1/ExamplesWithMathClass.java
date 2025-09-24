package com.pluralsight.week1;

import java.util.Random;

public class ExamplesWithMathClass {
    public static void main(String[] args) {
        int i = 9;
        int j = 7;

        int minValue = Math.min(i, j);
        System.out.println(minValue);

        int maxValue = Math.max(i, j);
        System.out.println(maxValue);

        double d = 7.6; // -7.6;
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.round(d));


        double randomValue = Math.random(); // value between 0 and 1
        System.out.println(randomValue);

        // i want a number between 0 and 100
        int randomNr = (int) Math.round((Math.random() * 100));
        System.out.println(randomNr);

        // alternatives
        Random random = new Random();
        int randomNr3 = random.nextInt(100);



    }
}
