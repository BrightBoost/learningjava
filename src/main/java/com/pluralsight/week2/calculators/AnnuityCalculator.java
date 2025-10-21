package com.pluralsight.week2.calculators;

public class AnnuityCalculator {
    public static void main(String[] args) {
        // arrange
        double monthlyPayment = 3000;
        int nrOfYears = 20;
        int nrOfMonths = nrOfYears * 12;
        double monthlyInterest = 2.5 / 100 /12;

        // act
        double presentValue = monthlyPayment * (1 - (1/Math.pow(1+ monthlyInterest, nrOfMonths))) / monthlyInterest;
        // assert
        System.out.println(presentValue);

        // act
        double presentValue2 = monthlyPayment * (1 - Math.pow(1+ monthlyInterest, -nrOfMonths)) / monthlyInterest;
        // assert
        System.out.println(presentValue2);
    }
}
