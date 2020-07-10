package com.vevo.hiring.snake;

import java.util.logging.Logger;

public class MySnakeGame implements SnakeGame {

    private static final Logger log = Logger.getLogger(MySnakeGame.class.getName());
    private final Snake mySnake;
    private final Board myBoard;

    public MySnakeGame(int numberOfRows, int numberOfColumns) {

        mySnake = new Snake(0, 0);
        myBoard = new Board(numberOfRows, numberOfColumns, mySnake);
    }

    @Override
    public String getGameBoard() {

        StringBuilder sb = new StringBuilder();
        for (char[] row : myBoard.getBoardArray()) {
            sb.append(row);
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override
    public void move(Direction direction, boolean grow) {

        switch (direction) {
            case NORTH:
                mySnake.moveNorth(grow);
                break;
            case SOUTH:
                mySnake.moveSouth(grow);
                break;
            case EAST:
                mySnake.moveEast(grow);
                break;
            case WEST:
                mySnake.moveWest(grow);
                break;
            default:
                log.warning("Illegal snake move detected");
        }
    }

    public Snake getMySnake() {

        return mySnake;
    }

}
