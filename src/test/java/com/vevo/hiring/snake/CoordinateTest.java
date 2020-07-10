package com.vevo.hiring.snake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    Coordinate subject;

    @Test
    void getRow_ReturnsPassedInRow() {

        subject = new Coordinate(1, 5);
        assertEquals(1, subject.getRow());
    }

    @Test
    void getColumn_ReturnsPassedInColumn() {

        subject = new Coordinate(5, 1);
        assertEquals(1, subject.getColumn());
    }
}