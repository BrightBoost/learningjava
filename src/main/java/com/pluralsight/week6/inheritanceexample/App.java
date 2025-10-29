package com.pluralsight.week6.inheritanceexample;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Action", 2, "blue", 50);
        dog.bark();

        Dog dog1 = new Dog("Woody", 2, "blue", 50);
        dog1.bark();

        Cat cat = new Cat("Leo", 2, "blue", 50);
        cat.meow();

        //Animal animal = new Animal("Axel", 2, "blue", 50);

        Axolotl axolotl = new Axolotl("Axel", 2, "pink", 50);
        axolotl.blub();

        // polymorphism
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(dog1);
        animals.add(cat);
       // animals.add(animal);
        animals.add(axolotl);

        System.out.println(dog.getClass());

        System.out.println("*****");
        for(Animal a : animals) {
            if(a instanceof Cat c) {
                c.meow();
            } else if(a instanceof Dog d) {
                d.bark();
            } else if(a instanceof Axolotl ax) {
                ax.blub();
            }
        }

        System.out.println(dog);


    }
}
