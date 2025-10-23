package com.pluralsight.week5.staticexercises;

public class CounterApp {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increment();
        Counter.printTotal();

        c2.increment();
        Counter.printTotal();
    }
}
