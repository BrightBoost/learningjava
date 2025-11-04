package com.pluralsight.week7.portfolio;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight) {
        super("gold", weight * 1000);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getValue() {
        return weight * 1000;
    }
}
