package com.pluralsight.week6.exercisevehicles;

public class Car extends Vehicle {

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void zroomZroom() {
        System.out.println("zroom zroom");
    }
}
