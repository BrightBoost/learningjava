package com.pluralsight.week5.staticexercises;

public class CatApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Leo");
        System.out.println(Cat.catCount);
        Cat cat2 = new Cat("Mimi");
        System.out.println(Cat.catCount);
        Cat cat3 = new Cat("Roxy");
        System.out.println(Cat.catCount);


    }
}
