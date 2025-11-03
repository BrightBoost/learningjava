package com.pluralsight.week7;

public class Computer implements Electronic {
    public void doSomethingElectric() {
        System.out.println("computing things");
    }

    public int useElectricity() {
        return 5;
    }
}
