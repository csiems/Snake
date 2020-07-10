package com.vevo.hiring.snake;

import java.util.LinkedList;
import java.util.List;

/**
 * Manages the state of the snake used in the game. This class
 * keeps track of the head of the snake and the coordinates
 * representing it's position on the game board.
 */
public class Snake {

    Coordinate head;
    LinkedList<Coordinate> coordinates = new LinkedList<>();

    public Snake(int row, int column) {

        head = new Coordinate(row, column);
        coordinates.add(head);
    }

    /**
     * Returns a list of Coordinates representing the position
     * of the snake on the game board.
     */
    public List<Coordinate> getCoordinates() {

        return coordinates;
    }

    /**
     * Returns the Coordinates of the snake's head (the front
     * of the snake from which movement will originate).
     */
    public Coordinate getHead() {
        return head;
    }

    /**
     * Moves the snake north (up) on the game board
     *
     * @param isGrowing A boolean representing whether the snake
     *                  should grow on this move.
     */
    public void moveNorth(boolean isGrowing) {

        move(head.getRow() - 1 , head.getColumn(), isGrowing);
    }

    /**
     * Moves the snake south (down) on the game board
     *
     * @param isGrowing A boolean representing whether the snake
     *                  should grow on this move.
     */
    public void moveSouth(boolean isGrowing) {
        move(head.getRow() + 1 , head.getColumn(), isGrowing);
    }

    /**
     * Moves the snake east (right) on the game board
     *
     * @param isGrowing A boolean representing whether the snake
     *                  should grow on this move.
     */
    public void moveEast(boolean isGrowing) {
        move(head.getRow(), head.getColumn() + 1, isGrowing);
    }

    /**
     * Moves the snake west (left) on the game board
     *
     * @param isGrowing A boolean representing whether the snake
     *                  should grow on this move.
     */
    public void moveWest(boolean isGrowing) {
        move(head.getRow(), head.getColumn() - 1, isGrowing);
    }

    /**
     * Moves the snake to the given row and column. The resulting
     * Coordinate from the given row and column will become the snake's
     * new head. If the snake is growing with this move, the tail (i.e. the
     * oldest Coordinate) will remain on the coordinate list. Otherwise,
     * the tail will be dropped from the list.
     *
     * @param row The row of the game board to which the snake will move.
     * @param column The column of the game board to which the snake will move.
     * @param isGrowing A boolean indicating whether the snake should grow
     *                  on this move.
     */
    private void move(int row, int column, boolean isGrowing) {

        Coordinate newHead = new Coordinate(row, column);
        coordinates.addFirst(newHead);

        if (!isGrowing) {
            coordinates.removeLast();
        }

        head = newHead;
    }
}
