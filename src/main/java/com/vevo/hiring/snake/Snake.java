package com.vevo.hiring.snake;

import java.util.LinkedList;

public class Snake {

    Coordinate head;
    LinkedList<Coordinate> coordinates = new LinkedList<>();

    public Snake(int row, int column) {
        head = new Coordinate(row, column);
        coordinates.add(head);
    }

    public Coordinate getHead() {
        return head;
    }

    public LinkedList<Coordinate> getCoordinates() {
        return coordinates;
    }

}
