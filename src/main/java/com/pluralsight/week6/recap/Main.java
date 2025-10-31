package com.pluralsight.week6.recap;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setHp(150);
        Car car = new Car();
        car.setEngine(engine);

        System.out.println(car.getEngine().getHp());

        Person p = new Student("Judy", 3.9, List.of("computer science 101", "computer science 201"));
        p = randomThing();
        p.printSummary();

    }

    public static Person randomThing() {
        if(Math.random() > 0.5) {
            return new Person("Hana");
        } else {
            return new Student("Richie", 3.9, List.of("computer science 101", "computer science 201"));
        }
    }
}
