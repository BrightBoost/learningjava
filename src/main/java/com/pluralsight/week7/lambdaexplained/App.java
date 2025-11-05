package com.pluralsight.week7.lambdaexplained;

public class App {
    public static void main(String[] args) {
        // exercise 6
        RandomPrinter randomPrinter = () -> System.out.println(Math.round(Math.random() * 10));
        randomPrinter.printRandom();

        // exercise 5
        SquareCalculator squareCalculator = x -> {
            System.out.println("calculating square....");
            return x * x;
        };

        int result = squareCalculator.square(5);
        System.out.println(result);

        // exercise 15
        String[] names = {"name1", "name2", "name2"};
        NamePrinter namePrinter = s -> System.out.println("name: " + s);
        for(String name : names) {
            namePrinter.print(name);
        }
    }
}
