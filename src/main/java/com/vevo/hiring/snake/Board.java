package com.vevo.hiring.snake;

import java.util.Arrays;

public class Board {

    private final int numberOfRows;
    private int numberOfColumns;
    private Snake snake;
    private char[][] rows;

    public Board(int numberOfRows, int numberOfColumns, Snake snake) {

        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        this.snake = snake;

        // set up empty board based on passed in rows and columns
        rows = new char[numberOfRows][numberOfColumns];
        for (char[] row : rows) {
            Arrays.fill(row, '.');
        }

        // add snake to board
        for (Coordinate c : snake.getCoordinates()) {
            rows[c.getRow()][c.getColumn()] = 'X';
        }

    }

    public char[][] getRows() {
        return rows;
    }
}
