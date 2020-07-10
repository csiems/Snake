package com.vevo.hiring.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BoardTest {

    private Board subject;

    @BeforeEach
    void setUp() {

        Coordinate mockCoordinate1 = mock(Coordinate.class);
        when(mockCoordinate1.getRow()).thenReturn(2);
        when(mockCoordinate1.getColumn()).thenReturn(2);

        Coordinate mockCoordinate2 = mock(Coordinate.class);
        when(mockCoordinate1.getRow()).thenReturn(2);
        when(mockCoordinate1.getColumn()).thenReturn(1);

        Snake mockSnake = mock(Snake.class);
        when(mockSnake.getCoordinates()).thenReturn(
                new LinkedList<>(Arrays.asList(mockCoordinate1, mockCoordinate2)));

        subject = new Board(10, 10, mockSnake);
    }

    @Test
    void getBoardArray_SnakeCoordinateHasX() {

        char snakeCoordinate = subject.getBoardArray()[2][1];
        assertEquals('X', snakeCoordinate);
    }

    @Test
    void getBoardArray_EmptyCoordinateHasDot() {

        char emptyCoordinate = subject.getBoardArray()[9][9];
        assertEquals('.', emptyCoordinate);
    }

    @Test
    void getNumberOfRows_ReturnsPassedInRows() {

        assertEquals(10, subject.getNumberOfRows());
    }

    @Test
    void getNumberOfColumns_ReturnsPassedInColumns() {

        assertEquals(10, subject.getNumberOfColumns());
    }
}