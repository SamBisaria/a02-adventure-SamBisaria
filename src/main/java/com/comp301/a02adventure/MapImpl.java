package com.comp301.a02adventure;

public class MapImpl implements Map {
  private Cell[][] map;
  private final int items;
  private final int width;
  private final int height;

  public MapImpl(int Width, int Height, int numItems) {
    if (Width < 1 || Height < 1) {
      throw new IllegalArgumentException("Error: Invalid parameter value");
    }
    width = Width;
    height = Height;
    map = new Cell[width][height];
    items = numItems;
  }

  @Override
  public int getWidth() {
    return width;
  }

  @Override
  public int getHeight() {
    return height;
  }

  @Override
  public Cell getCell(int x, int y) {
    if (x < 0 || y < 0 || x > width || y > height) {
      throw new IndexOutOfBoundsException("Error: Invalid parameter value");
    }
    return map[x][y];
  }

  @Override
  public Cell getCell(Position position) {
    if (position == null
        || position.getX() < 0
        || position.getY() < 0
        || position.getX() > width
        || position.getY() > height) {
      throw new IndexOutOfBoundsException("Error: Invalid parameter value");
    }
    return map[position.getX()][position.getY()];
  }

  @Override
  public void initCell(int x, int y) {
    if (x < 0 || y < 0 || x > width || y > height) {
      throw new IndexOutOfBoundsException("Error: Invalid parameter value - " + x + ", " + y);
    }
    Cell a = new CellImpl(x, y);
  }

  @Override
  public int getNumItems() {
    return items;
  }
}
