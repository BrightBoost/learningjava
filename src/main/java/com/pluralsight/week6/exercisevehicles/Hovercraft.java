package com.pluralsight.week6.exercisevehicles;

public class Hovercraft extends Vehicle {

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void fromLandToWater() {
        System.out.println("magic + splash");
    }

    public void fromWaterToLand() {
        System.out.println("magic");
    }
}
