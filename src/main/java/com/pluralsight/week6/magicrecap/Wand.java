package com.pluralsight.week6.magicrecap;

public class Wand {
    private String wood;
    private double length;

    public String getWood() { return wood; }
    public void setWood(String wood) { this.wood = wood; }

    public Wand(String wood, double length) {
        this.wood = wood;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void castSpell() {
        System.out.println("A spell is cast with a " + wood + " wand!");
    }
}
