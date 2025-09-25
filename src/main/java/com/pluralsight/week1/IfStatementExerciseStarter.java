package com.pluralsight.week1;


public class IfStatementExerciseStarter {
    public static void main(String[] args) {
        // Exercise 1: Is it positive?
        int number = 7;
        // TODO: print "Positive number" if number > 0, otherwise "Not positive"

        // Exercise 2: Even or odd
        int x = 10;
        // TODO: print "Even" if x is divisible by 2, otherwise "Odd"
        if(x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // Exercise 3: Temperature check
        int temperature = 30; // celcius
        // TODO: print "Hot" if temperature > 25, otherwise "Not hot"

        // Exercise 4: Teenager check
        int age = 15;
        // TODO: print "Teenager" if age is between 13 and 19, otherwise "Not a teenager"

        // Exercise 5: Can vote?
        int age2 = 17;
        // TODO: print "Can vote" if age2 >= 18, otherwise "Too young to vote"

        // Exercise 6: Multiple of both
        int y = 30;
        // TODO: print "Divisible by 3 and 5" if divisible by both, otherwise "Not divisible by 3 and 5"

        // Exercise 7: Outside safe range
        int speed = 120;
        // TODO: print "Unsafe speed" if speed < 30 or speed > 100, otherwise "Safe speed"
        if(speed < 30 || speed > 100) {
            System.out.println("unsafe speed");
        } else {
            System.out.println("safe speed");
        }

        // Exercise 8: Leap year check (simplified)
        int year = 2025;
        // TODO: print "Leap year" if year divisible by 4 and not divisible by 100, otherwise "Not leap year"
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        // Exercise 9: Bigger number
        int a = 8;
        int b = 12;
        // TODO: print which one is bigger (a or b)

        // Exercise 10: Grade check
        int score = 55;
        // TODO: print "Pass" if score >= 50, otherwise "Fail"
    }
}
