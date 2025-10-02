package com.pluralsight.week2.calculators;

public class MortgageCalculator {
    public static void main(String[] args) {
        double principal = 53000; // P
        double interestRate = 7.625; // r
        double monthlyInterestRate = interestRate / 100 / 12;
        int loanLength = 15;
        int loanLengthInMonths = loanLength * 12;

        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanLengthInMonths ))/ (( Math.pow(1 + monthlyInterestRate, loanLengthInMonths)) - 1);

        double totalInterestPaid = monthlyPayment * loanLengthInMonths - principal;
        System.out.println("Monthly payment: " + monthlyPayment);
        System.out.println("Total interest paid: " + totalInterestPaid);

    }
}
