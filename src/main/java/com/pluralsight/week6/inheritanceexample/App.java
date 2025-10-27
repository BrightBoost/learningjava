package com.pluralsight.week6.inheritanceexample;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Action");
        dog.bark();

        Dog dog1 = new Dog();
        dog1.setName("Woody");
        dog1.bark();

        Cat cat = new Cat();
        cat.setName("Leo");
        cat.meow();

        Animal animal = new Animal();
        animal.setName("Axel");

        Axolotl axolotl = new Axolotl();
        axolotl.setName("Axo");
        axolotl.blub();
    }
}
