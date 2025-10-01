package com.pluralsight.week2.oop;

public class Program {
    public static void main(String[] args) {
        Table diningTable = new Table();
        diningTable.color = "dark brown";
        diningTable.shape = "round";
        diningTable.tableTopSurface = 1;
        diningTable.nrOfLegs = 1;

        Table desk = new Table();
        desk.nrOfLegs = 1;
        desk.shape = "rectangle";
        desk.color = "lightgrey";
        desk.tableTopSurface = 2;

        Table sideTable = new Table();
        sideTable.tableTopSurface = 0.2;
        sideTable.color = "gold";
        sideTable.nrOfLegs = 4;
        sideTable.shape = "square";

        System.out.printf("Dining table is %s and %s and has %d legs and the surface is %f", diningTable.shape, diningTable.color, diningTable.nrOfLegs, diningTable.tableTopSurface);

    }
}
