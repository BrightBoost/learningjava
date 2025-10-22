package com.pluralsight.week5.testexample;

public class Calculator {
    public double add(double nr1, double nr2) {
        return nr1 + nr2;
    }

    public double subtract(double nr1, double nr2) {
        return nr1 - nr2;
    }

    public double multiply(double nr1, double nr2) {
        return nr1 * nr2;
    }

    public double divide(double nr1, double nr2) {
        if(nr2 == 0) {
            throw new ArithmeticException("Sorry, can't divide by 0.");
        }
        return nr1 / nr2;
    }
}
