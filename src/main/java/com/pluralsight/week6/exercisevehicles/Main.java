package com.pluralsight.week6.exercisevehicles;

public class Main {
    public static void main(String[] args) {
        Moped moped = new Moped("pink", 2, 10, 5);
        moped.meepMeep();

        SemiTruck semiTruck = new SemiTruck("white", 3, 100000, 500);
        semiTruck.braaaaauhhhh();

        Hovercraft hovercraft = new Hovercraft("optimus blue", 20, 1000, 500);
        hovercraft.fromLandToWater();

    }
}
