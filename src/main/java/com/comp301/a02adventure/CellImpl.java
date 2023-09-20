package com.comp301.a02adventure;

public class CellImpl implements Cell {
  private final Position location;
  private String name;
  private String description;
  private Inventory chest;
  private boolean visited = false;

  public CellImpl(int x, int y) {
    location = new PositionImpl(x, y);
    name = "";
    description = "";
  }

  public CellImpl(int x, int y, String Name, String Description) {
    this(x, y);
    if (Name == null || Description == null) {
      throw new IllegalArgumentException("Error: String cannot be null");
    }
    name = Name;
    description = Description;
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
    if (Name == null) {
      throw new IllegalArgumentException("Error: Parameter cannot be null");
    }
    name = Name;
  }

  @Override
  public void setDescription(String Description) {
    if (Description == null) {
      throw new IllegalArgumentException("Error: Parameter cannot be null");
    }
    description = Description;
  }

  @Override
  public void setChest(Inventory Chest) {
    if (Chest == null) {
      throw new IllegalArgumentException("Error: Parameter cannot be null");
    }
    chest = Chest;
  }

  @Override
  public void visit() {
    visited = true;
  }
}
