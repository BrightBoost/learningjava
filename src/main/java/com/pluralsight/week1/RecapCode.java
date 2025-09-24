package com.pluralsight.week1;

public class RecapCode {
    public static void main(String[] args) {
        /*
        🔹 Challenge A2: Half & Half
            Create a double with any value you like.
            Divide it by 2.
            Print both the original and the halved value.
         */
        double d = 7.8;
        double newD = d / 2;
        System.out.println("Original: " + d);
        System.out.println("Halved: " + newD);

        /*
        🔹 Challenge B2: Pet + Age
            Make a String with the name of a pet (real or imaginary).
            Make an int with its age.
            Print them in one sentence using concatenation.
         */
        String cat = "Zia";
        int age = 1;
        System.out.println("My lovely cat " + cat + " is " + age + " years old.");

        /*
        🔹 Challenge C2: Random Twist
            Generate a random number between 1 and 100.
            Print it.
            Subtract 10 from it and print the new value.
         */
        long randomNr = Math.round(Math.random() * 100);
        System.out.println(randomNr);
        randomNr = randomNr - 10;
        System.out.println(randomNr);

        //🔹 Bonus 1: Clock Math ⏰
        int hours = 29;
        int hoursOn24Clock = 29 % 24;
        System.out.println(hoursOn24Clock);
    }
}
