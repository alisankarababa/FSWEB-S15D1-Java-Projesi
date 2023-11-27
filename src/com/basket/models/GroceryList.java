package com.basket.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroceryList {

    private List<String> cart;

    public GroceryList() {
        this.cart = new ArrayList<>();
    }

    public boolean isItemInCart(String item) {
        return cart.contains(item);
    }

    public boolean addItem(String item) {

        if(null == item || cart.contains(item))
            return false;
        cart.add(item);

        Collections.sort(cart);
        return true;
    }

    public boolean removeItem(String item) {

        return cart.remove(item);
    }

    @Override
    public String toString() {
        return cart.toString();
    }
}
