package org.example;

import java.util.List;

public class CartActionsImpl implements CartActions {
    private List<Item> cart;
    private Storage storage;

    @Override
    public boolean discount() {
        return false;
    }

    @Override
    public void add(Storage storage) {
        if (Item)
        storage.getList().get()
        cart.add(item);
    }

    @Override
    public void remove() {

    }

    @Override
    public void print() {
        System.out.println(cart);
    }

    public CartActionsImpl(List<Item> cart) {
        this.cart = cart;
    }
}
