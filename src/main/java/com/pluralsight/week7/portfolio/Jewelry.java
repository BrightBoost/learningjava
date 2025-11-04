package com.pluralsight.week7.portfolio;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }
}
