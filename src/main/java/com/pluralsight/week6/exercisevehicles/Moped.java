package com.pluralsight.week6.exercisevehicles;

public class Moped extends Vehicle {
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void meepMeep() {
        System.out.println("meep meep");
    }
}
