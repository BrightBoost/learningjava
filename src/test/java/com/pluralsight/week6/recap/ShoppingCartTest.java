package com.pluralsight.week6.recap;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void addItem() {
        // arrange
        ShoppingCart shoppingCart = new ShoppingCart("thomas");
        Item item = new Item("keyboard", 50);

        // act
        shoppingCart.addItem(item);

        // assert
        assertEquals("keyboard", shoppingCart.getItems().get(0).getName());
    }

    @Test
    void getItems() {
        // arrange
        ShoppingCart shoppingCart = new ShoppingCart("thomas");
        Item item = new Item("keyboard", 50);
        shoppingCart.addItem(item);

        // act
        List<Item> itemList = shoppingCart.getItems();

        // assert
        assertEquals(1, itemList.size());
    }

    @Test
    void calcTotal() {
    }
}