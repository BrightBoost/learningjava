package com.pluralsight.week7.genericsexplained;

import java.util.List;

public class LaptopBag {
    private double volume;
    private List<Laptop> laptops;

    public LaptopBag(double volume, List<Laptop> laptops) {
        this.volume = volume;
        this.laptops = laptops;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void addContent(Laptop laptop) {
        laptops.add(laptop);
    }

    public Laptop getContent() {
        return laptops.getFirst();
    }
}
