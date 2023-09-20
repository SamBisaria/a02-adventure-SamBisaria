package com.comp301.a02adventure;

public class PositionImpl implements Position {
  private final int x;
  private final int y;

  public PositionImpl(int X, int Y) {
    x = X;
    y = Y;
  }

  @Override
  public int getX() {
    return x;
  }

  @Override
  public int getY() {
    return y;
  }

  @Override
  public Position getNeighbor(Direction direction) {
    if (direction == Direction.NORTH) {
      return new PositionImpl(x, y + 1);
    } else if (direction == Direction.SOUTH) {
      return new PositionImpl(x, y - 1);
    } else if (direction == Direction.EAST) {
      return new PositionImpl(x + 1, y);
    } else if (direction == Direction.WEST) {
      return new PositionImpl(x - 1, y);
    }
    return null;
  }
}
