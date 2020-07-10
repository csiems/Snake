package com.vevo.hiring.snake;

public class MySnakeGame implements SnakeGame {

    Snake mySnake;
    Board myBoard;

    public MySnakeGame(int numberOfRows, int numberOfColumns) {

        mySnake = new Snake(0, 0);
        myBoard = new Board(numberOfRows, numberOfColumns, mySnake);
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
