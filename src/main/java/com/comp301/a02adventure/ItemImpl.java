package com.comp301.a02adventure;

import java.util.Objects;

public class ItemImpl implements Item {
  private final String Name;

  public ItemImpl(String name) {
    if (name == null) {
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
    if (other == null) {
      return false;
    }
    Item Other = (Item) other;
    return Objects.equals(Other.getName(), Name);
  }

  @Override
  public String toString() {
    return getName();
  }
}
