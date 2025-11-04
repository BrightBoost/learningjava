package com.pluralsight.week7.genericsexplained;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Bag<Laptop> laptopBag = new Bag<>(40, List.of(new Laptop("macbook")));
        Bag<Chihuahua> chihuahuaBag = new Bag<>(40, List.of(new Chihuahua("rocky"), new Chihuahua("daisy")));

        Chihuahua dog1 = chihuahuaBag.getContent();
        Laptop laptop = laptopBag.getContent();
    }
}
