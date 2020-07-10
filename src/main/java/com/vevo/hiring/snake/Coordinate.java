package com.vevo.hiring.snake;

/**
 * A simple container holding indexes of a single row and column
 * on the game board. The snake's position is represented as a
 * List of Coordinates.
 */
public class Coordinate {

    int row;
    int column;

    public Coordinate(int row, int column) {

        this.row = row;
        this.column = column;
    }

    public int getRow() {

        return row;
    }

    public int getColumn() {

        return column;
    }
}
