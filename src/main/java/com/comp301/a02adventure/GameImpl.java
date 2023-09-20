package com.comp301.a02adventure;

import java.util.List;

public class GameImpl implements Game{
    Map map;
    Player player;
    public GameImpl(Map map1, Player player1) {
        if (map1 == null || player1 == null){
            throw new IllegalArgumentException("Error: String cannot be null");
        }
        map = map1;
        player = player1;
    }
    @Override
    public Position getPlayerPosition() {
        return player.getPosition();
    }

    @Override
    public String getPlayerName() {
        return player.getName();
    }

    @Override
    public List<Item> getPlayerItems() {
        return player.getInventory().getItems();
    }

    @Override
    public boolean getIsWinner() {
        return player.getInventory().getNumItems() == map.getNumItems();
    }

    @Override
    public void printCellInfo() {
        System.out.println("Location: " + map.getCell(getPlayerPosition()).getName());
        System.out.println(map.getCell(getPlayerPosition()).getDescription());
        if (map.getCell(getPlayerPosition()).getIsVisited()){
            System.out.println("You have already visited this location.");
        }
        if (map.getCell(getPlayerPosition()).hasChest()){
            System.out.println("You found a chest! Type 'open' to see what's inside, or keep moving.");
        }
        map.getCell(getPlayerPosition()).visit();
    }

    @Override
    public void openChest() {
        if (map.getCell(getPlayerPosition()).hasChest()){
            if (!map.getCell(getPlayerPosition()).getChest().isEmpty()){
                System.out.println("You collected these items: " + map.getCell(getPlayerPosition()).getChest().getItems());
                player.getInventory().transferFrom(map.getCell(getPlayerPosition()).getChest());
            }
            else{
                System.out.println("The chest is empty.");
            }
        }
        else{
            System.out.println("No chest to open, sorry!");
        }
    }

    @Override
    public boolean canMove(Direction direction) {
        Cell neighbor;
        try{
            neighbor = map.getCell(player.getPosition().getNeighbor(direction));
        }
        catch(Exception e){
            return false;
        }
        return neighbor != null;
    }

    @Override
    public void move(Direction direction) {
        if (canMove(direction)){
            player.move(direction);
            printCellInfo();
        }
        else{
            System.out.println("You can't go that way! Try another direction.");
        }
    }
}
