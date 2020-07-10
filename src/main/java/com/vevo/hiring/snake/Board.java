package com.vevo.hiring.snake;

import java.util.Arrays;

/**
 * Manages the state of the Snake game board and returns a char[][]
 * that represents the current game board.  Empty spaces appear as
 * a '.', and spaces containing the snake appear as an 'X'.
 */
public class Board {

    private final int numberOfRows;
    private final int numberOfColumns;
    private final Snake snake;

    public Board(int numberOfRows, int numberOfColumns, Snake snake) {

        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        this.snake = snake;
    }

    /**
     * Returns a char[][] that represents the current game board with
     * the coordinates of the board's snake represented as X's
     */
    public char[][] getBoardArray() {
        return createBoardArray(snake);
    }

    /**
     * Returns the number of rows on the game board
     */
    public int getNumberOfRows() {

        return numberOfRows;
    }

    /**
     * Returns the number of columns on the game board
     */
    public int getNumberOfColumns() {

        return numberOfColumns;
    }

    /**
     * Uses the snake assigned to the board to create a
     * char[][] representation of the board and the location
     * of the snake
     *
     * @param snake The snake assigned to the board
     * @return A char[][] representation of the board and the snake
     * assigned to it
     */
    private char[][] createBoardArray(Snake snake) {

        // create an empty board of .'s
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
