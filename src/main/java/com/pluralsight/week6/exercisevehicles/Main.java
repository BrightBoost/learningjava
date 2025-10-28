package com.pluralsight.week6.exercisevehicles;

public class Main {
    public static void main(String[] args) {
        Moped moped = new Moped();
        moped.setColor("pink");
        moped.setFuelCapacity(5);
        moped.meepMeep();

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("black");
        semiTruck.setFuelCapacity(100);
        semiTruck.braaaaauhhhh();

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("optimusBlue");
        hovercraft.setFuelCapacity(500);
        hovercraft.fromLandToWater();

    }
}
