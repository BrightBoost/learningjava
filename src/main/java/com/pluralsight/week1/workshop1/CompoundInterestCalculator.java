package com.pluralsight.week1.workshop1;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        double principal = 1000;
        double annualInterestRate = 1.75 / 100;
        int years = 5;
        int compoundingFrequency = 365;

        // formula
        double futureValue = principal * Math.pow(1 + (annualInterestRate / compoundingFrequency), compoundingFrequency * years);
        double interestEarned = futureValue - principal;

        System.out.printf("Future Value: $%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f%n", interestEarned);


    }
}
