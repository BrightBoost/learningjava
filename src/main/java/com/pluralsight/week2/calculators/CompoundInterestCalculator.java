package com.pluralsight.week2.calculators;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        double principal = 1000;
        double interestRate = 1.75/100;
        int nrOfYears = 5;

        double futureValue = principal * Math.pow(1 + interestRate / 365, 365 * nrOfYears);

        System.out.println(futureValue);
        // FV = P × (1 + (r / 365) )^(365 × t)
    }
}
