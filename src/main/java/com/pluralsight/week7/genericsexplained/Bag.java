package com.pluralsight.week7.genericsexplained;

import java.util.List;

public class Bag<T> {
    private double volume;
    private List<T> contents;

    public Bag(double volume, List<T> items) {
        this.volume = volume;
        this.contents = items;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void addContent(T item) {
        contents.add(item);
    }

    public T getContent() {
        return contents.getFirst();
    }
}
