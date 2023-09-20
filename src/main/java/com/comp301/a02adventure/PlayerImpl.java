package com.comp301.a02adventure;

public class PlayerImpl implements Player {
  public String name;
  Position location;
  Inventory inv;

  public PlayerImpl(String Name, int startX, int startY) {
    name = Name;
    if (name == null) {
      throw new IllegalArgumentException("Error: Parameter cannot be null");
    }
    location = new PositionImpl(startX, startY);
  }

  @Override
  public Position getPosition() {
    return location;
  }

  @Override
  public Inventory getInventory() {
    return inv;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void move(Direction direction) {
    location = location.getNeighbor(direction);
  }
}
