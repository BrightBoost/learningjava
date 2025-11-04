package com.pluralsight.week7.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private int maxSize;
    private List<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public boolean add(T item) {
        if(items.size() < maxSize) {
            items.add(item);
            return true;
        }
        return false;
    }

    public List<T> getItems() {
        return this.items;
    }
}
