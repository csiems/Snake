package com.vevo.hiring.snake;

import java.util.LinkedList;
import java.util.List;

public class Snake {

    Coordinate head;
    LinkedList<Coordinate> coordinates = new LinkedList<>();

    public Snake(int row, int column) {

        head = new Coordinate(row, column);
        coordinates.add(head);
    }

    public List<Coordinate> getCoordinates() {

        return coordinates;
    }

    public void move(int row, int column, boolean isGrowing) {

        Coordinate newHead = new Coordinate(row, column);
        coordinates.addFirst(newHead);

        if (!isGrowing) {
            coordinates.removeLast();
        }

        head = newHead;
    }

    public void moveNorth(boolean isGrowing) {

        move(head.getRow() - 1 , head.getColumn(), isGrowing);
    }

    public void moveSouth(boolean isGrowing) {
        move(head.getRow() + 1 , head.getColumn(), isGrowing);
    }

    public void moveEast(boolean isGrowing) {
        move(head.getRow(), head.getColumn() + 1, isGrowing);
    }

    public void moveWest(boolean isGrowing) {
        move(head.getRow(), head.getColumn() - 1, isGrowing);
    }

}
