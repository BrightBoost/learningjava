package com.pluralsight.week7.lambdaexplained;

public class LabelPrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println("Printing label with the text: " + s);
    }
}
