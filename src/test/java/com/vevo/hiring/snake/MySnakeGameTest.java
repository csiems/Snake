package com.vevo.hiring.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySnakeGameTest {

    MySnakeGame subject;

    @BeforeEach
    void setUp() {

        subject = new MySnakeGame(10, 10);
    }

    @Test
    void getGameBoard_SetsUpCorrectNumberOfRows() {

        String boardString = subject.getGameBoard();
        long newLineCount = boardString.chars().filter(ch -> ch == '\n').count();
        assertEquals(10, newLineCount);
    }

    @Test
    void getGameBoard_SetsUpCorrectNumberOfColumns() {

        String boardString = subject.getGameBoard();
        String firstColumn = boardString.substring(0, boardString.indexOf('\n'));
        assertEquals(10, firstColumn.length());

    }

    @Test
    void getGameBoard_SetsUpSnakeInZeroZero() {

        String boardString = subject.getGameBoard();
        String firstCharAsString = boardString.substring(0, 1);
        assertEquals("X", firstCharAsString);
    }

    @Test
    void move_MovesSnakeHeadToExpectedLocation() {

        subject.move(SnakeGame.Direction.SOUTH, false);
        int snakeHeadRow = subject.getMySnake().getHead().getRow();
        assertEquals(1, snakeHeadRow);
    }
}