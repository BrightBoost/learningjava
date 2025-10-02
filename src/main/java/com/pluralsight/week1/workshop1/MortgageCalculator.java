package com.pluralsight.week1.workshop1;

public class MortgageCalculator {

    public static void main(String[] args) {
        double principal = 53000;
        double annualInterestRate = 7.625 / 100;
        int loanTermYears = 15;

        // Calculate monthly interest rate and total number of payments
        double monthlyInterestRate = annualInterestRate / 12;
        int totalPayments = loanTermYears * 12;

        // formula
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        System.out.println(monthlyPayment);


        double principalLoan = 53000;
        double monthlyInterest = 7.625 / 100 / 12;
        int years = 15;
        double nrOfMonthlyPayments = years * 12;

        double monthlyPay = principalLoan * (monthlyInterest * Math.pow(1 + monthlyInterest, totalPayments))/
                (Math.pow(1 + monthlyInterest, totalPayments)-1);

        System.out.println(monthlyPay);
    }
}

