package com.comp301.a02adventure;

public class MapImpl implements Map {
  Cell[][] map;
  public int items;
  public int width;
  public int height;

  public MapImpl(int Width, int Height, int numItems) {
    width = Width;
    height = Height;
    if (width < 1 || height < 1 || numItems < 0) {
      throw new IllegalArgumentException("Error: Invalid parameter value");
    }
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
      throw new IllegalArgumentException("Error: Invalid parameter value");
    }
    return map[x][y];
  }

  @Override
  public Cell getCell(Position position) {
    if (position.getX() < 0
        || position.getY() < 0
        || position.getX() > width
        || position.getY() > height) {
      throw new IllegalArgumentException("Error: Invalid parameter value");
    }
    return map[position.getX()][position.getY()];
  }

  @Override
  public void initCell(int x, int y) {
    if (x < 0 || y < 0 || x > width || y > height) {
      throw new IllegalArgumentException("Error: Invalid parameter value");
    }
    Cell a = new CellImpl(x, y);
  }

  @Override
  public int getNumItems() {
    return items;
  }
}
