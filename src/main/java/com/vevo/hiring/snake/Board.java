package com.vevo.hiring.snake;

import java.util.Arrays;

public class Board {

    private char[][] rows;

    public Board(int numberOfRows, int numberOfColumns) {

        // set up empty board based on passed in rows and columns
        rows = new char[numberOfRows][numberOfColumns];
        for (char[] row : rows) {
            Arrays.fill(row, '.');
        }

        // add snake to middle of board


    }

    public char[][] getRows() {
        return rows;
    }
}
