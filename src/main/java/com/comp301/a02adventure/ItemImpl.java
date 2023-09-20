package com.comp301.a02adventure;

public class ItemImpl implements Item{
    private final String Name;
    public ItemImpl(String name) {
        if (name == null){
            throw new IllegalArgumentException("Error: Name cannot be null");
        }
        Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
    @Override
    public boolean equals(Object other) {
        Item Other = (Item) other;
        return Other.getName() == Name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
