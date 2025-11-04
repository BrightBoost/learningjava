package com.pluralsight.week7.genericsexplained;

import java.util.List;

public class ChihuahuaBag {
    private double volume;
    private List<Chihuahua> dogs;

    public ChihuahuaBag(double volume, List<Chihuahua> dogs) {
        this.volume = volume;
        this.dogs = dogs;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void addContent(Chihuahua chihuahua) {
        dogs.add(chihuahua);
    }

    public Chihuahua getContent() {
        return dogs.getFirst();
    }
}
