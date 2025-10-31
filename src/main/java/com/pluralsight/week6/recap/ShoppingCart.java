package com.pluralsight.week6.recap;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private String username;

    public ShoppingCart(String username) {
        this.username = username;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return this.items;
    }

    public double calcTotal() {
        double sum = 0;
        for(Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
}
