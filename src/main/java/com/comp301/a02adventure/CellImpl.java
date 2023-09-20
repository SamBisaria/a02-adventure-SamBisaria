package com.comp301.a02adventure;

import sun.security.krb5.internal.crypto.Des;

public class CellImpl implements Cell {
  private final Position location;
  public String name;
  public String description;
  Inventory chest;
  public boolean visited = false;

  public CellImpl(int x, int y) {
    location = new PositionImpl(x, y);
    name = "";
    description = "";
  }

  public CellImpl(int x, int y, String Name, String Description) {
    this(x, y);
    name = Name;
    description = Description;
    if (name == null || description == null) {
      throw new IllegalArgumentException("Error: String cannot be null");
    }
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Position getPosition() {
    return location;
  }

  @Override
  public Inventory getChest() {
    return chest;
  }

  @Override
  public boolean getIsVisited() {
    return visited;
  }

  @Override
  public boolean hasChest() {
    return chest != null;
  }

  @Override
  public void setName(String Name) {
    if (name == null) {
      throw new IllegalArgumentException("Error: Parameter cannot be null");
    }
    name = Name;
  }

  @Override
  public void setDescription(String Description) {
    if (description == null) {
      throw new IllegalArgumentException("Error: Parameter cannot be null");
    }
    description = Description;
  }

  @Override
  public void setChest(Inventory Chest) {
    chest = Chest;
    if (chest == null) {
      throw new IllegalArgumentException("Error: Parameter cannot be null");
    }
  }

  @Override
  public void visit() {
    visited = true;
  }
}
