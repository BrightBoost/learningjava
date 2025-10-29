package com.pluralsight.week6.magicrecap;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Harry", "Gryffindor", 100, "wood");
        Wand wand = new Wand("i should know the type of wood", 30);

        wizard.setWand(wand);

        System.out.println(wizard.getWand().getLength());
    }
}
