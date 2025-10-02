package com.pluralsight.week2.oop;

public class App {
    public static void main(String[] args) {
        Dog judysDog = new Dog("Action", 5, "beige");
        judysDog.bark();

        Dog gaiasDog = new Dog("Cliff", 1, "red");
        gaiasDog.bark();

        Dog d = new Dog();
        d.bark();

        System.out.println(8);
        System.out.println("nlanla");
        System.out.println(judysDog);
    }
}
