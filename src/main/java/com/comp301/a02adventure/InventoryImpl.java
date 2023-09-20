package com.comp301.a02adventure;

import java.util.List;
import java.util.ArrayList;

public class InventoryImpl implements Inventory{
    private final List<Item> inventory = new ArrayList<Item>();
    @Override
    public boolean isEmpty() {
        return inventory.isEmpty();
    }

    @Override
    public int getNumItems() {
        return inventory.size();
    }

    @Override
    public List<Item> getItems() {
        return new ArrayList<>(inventory);
    }

    @Override
    public void addItem(Item item) {
        inventory.add(item);
    }

    @Override
    public void removeItem(Item item) {
        inventory.remove(item);
    }

    @Override
    public void clear() {
        inventory.clear();
    }

    @Override
    public void transferFrom(Inventory other) {
        inventory.addAll(other.getItems());
        other.clear();
    }
}
