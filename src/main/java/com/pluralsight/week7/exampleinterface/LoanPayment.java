package com.pluralsight.week7.exampleinterface;

public class LoanPayment implements Calculatable {
    @Override
    public double calculate(double... values) {
        if(values.length == 0) {
            System.out.println("no values! it's an empty array");
        }
        // do some real calcs
        return 100;
    }
}
