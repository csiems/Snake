package com.vevo.hiring.snake;

import java.util.Arrays;

public class Board {

    private final int numberOfRows;
    private final int numberOfColumns;
    private final Snake snake;

    public Board(int numberOfRows, int numberOfColumns, Snake snake) {

        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        this.snake = snake;
    }

    public char[][] getBoardArray() {
        return createBoardArray(snake);
    }

    public int getNumberOfRows() {

        return numberOfRows;
    }

    public int getNumberOfColumns() {

        return numberOfColumns;
    }

    private char[][] createBoardArray(Snake snake) {

        // create an empty board
        char[][] charArray = new char[getNumberOfRows()][getNumberOfColumns()];
        for (char[] row : charArray) {
            Arrays.fill(row, '.');
        }

        // replace snake coordinates with x's
        for (Coordinate c : snake.getCoordinates()) {
            charArray[c.getRow()][c.getColumn()] = 'X';
        }
        return charArray;
    }
}
