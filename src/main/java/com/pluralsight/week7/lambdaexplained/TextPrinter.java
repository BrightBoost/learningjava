package com.pluralsight.week7.lambdaexplained;

public class TextPrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println("Text printer: " + s);
    }
}
