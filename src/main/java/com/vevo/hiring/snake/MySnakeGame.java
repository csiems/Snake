package com.vevo.hiring.snake;

public class MySnakeGame implements SnakeGame {

    Board myBoard;

    public MySnakeGame(int numberOfRows, int numberOfColumns) {
        myBoard = new Board(numberOfRows, numberOfColumns);
    }

    public String getGameBoard() {

        StringBuilder sb = new StringBuilder();
        for (char[] row : myBoard.getRows()) {
            sb.append(row);
            sb.append('\n');
        }
        return sb.toString();
    }

    public void move(Direction direction, boolean grow) {

    }
}
