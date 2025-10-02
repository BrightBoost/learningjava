package com.pluralsight.week1.workshop1;

public class PresentValueAnnuityCalculator {

    public static void main(String[] args) {
        double monthlyPayout = 3000;
        double annualInterestRate = 2.5 / 100;
        int years = 20;
        int totalPayments = years * 12;

        double monthlyInterestRate = annualInterestRate / 12;

        double presentValue = monthlyPayout * (1 - (1 / Math.pow(1 + monthlyInterestRate, totalPayments))) / monthlyInterestRate;

        System.out.printf("The present value of the annuity is: $%.2f%n", presentValue);
    }
}
