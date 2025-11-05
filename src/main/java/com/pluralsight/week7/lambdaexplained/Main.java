package com.pluralsight.week7.lambdaexplained;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter();
        textPrinter.print("Goodmorning!");

        printSomething(textPrinter, "Good afternoon");

        LabelPrinter labelPrinter = new LabelPrinter();
        labelPrinter.print("jonas");

        // anonymous interface implementation
        Printer printer = new Printer() {
            @Override
            public void print(String s) {
                System.out.println("anonymous class: " + s);
            }
        };

        printer.print("blabla");

        printSomething(printer, "use case");

        // another anonymous interface implementation
        Printer printer2 = new Printer() {
            @Override
            public void print(String s) {
                System.out.println("Nicolas asked for this one: " + s);
            }
        };

        printer.print("jaja");
        printer2.print("jajaja");

        // lambda expressions
        String prefix = "lambda printer: ";
        Printer lambdaPrinter1 = s -> System.out.println(prefix + s);
        lambdaPrinter1.print("taaadaaa");

        // test for length bigger than 10
        Tester tester1 = text -> text.length() > 10;
        System.out.println(tester1.test("a very long word"));
        System.out.println(tester1.test("short"));

        // test for starts with w
        Tester tester2 = text -> text.toLowerCase().startsWith("w");
        System.out.println(tester2.test("Willem"));
        System.out.println(tester2.test("Ahmed"));

        Giver give1 = () -> "apple";
        Giver give2 = () -> Math.random() * 100;

        System.out.println(give1.give());
        System.out.println(give2.give());

        Combiner combiner1 = (nr1, nr2) -> nr1 + nr2;
        Combiner combiner2 = (nr1, nr2) -> nr1 * nr2;

        // some rules for lambda expressions
        // one line statement, no { } needed
        // one line statement, no return needed
        // one argument, no () needed

        printSomething(s -> System.out.println(s), "text");
        printSomething(s -> System.out.println("blbla" + s), "text");

    }

    public static void printSomething(Printer p, String s) {
        p.print(s);
    }
}
