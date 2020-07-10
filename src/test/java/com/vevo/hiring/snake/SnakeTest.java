package com.vevo.hiring.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeTest {

    Snake subject;

    @BeforeEach
    void setUp() {

        subject = new Snake(5, 5);
    }


    @Test
    void moveNorth_DecrementsRowOfHead() {

        subject.moveNorth(false);
        Coordinate head = subject.getHead();
        assertEquals(4, head.getRow());
    }

    @Test
    void moveNorth_AddsNewCoordinateIfSnakeGrows() {

        subject.moveNorth(true);
        subject.moveNorth(true);
        List<Coordinate> coordinates = subject.getCoordinates();

        assertEquals(3, coordinates.size());
    }

    @Test
    void moveSouth_IncrementsRowOfHead() {

        subject.moveSouth(false);
        Coordinate head = subject.getHead();
        assertEquals(6, head.getRow());
    }

    @Test
    void moveEast_IncrementsColumnOfHead() {

        subject.moveEast(false);
        Coordinate head = subject.getHead();
        assertEquals(6, head.getColumn());
    }

    @Test
    void moveWest_DecrementsColumnOfHead() {

        subject.moveWest(false);
        Coordinate head = subject.getHead();
        assertEquals(4, head.getColumn());
    }

    @Test
    void getCoordinates_ReturnsAllCoordinates() {

        subject.moveEast(true);
        subject.moveEast(true);
        subject.moveSouth(true);
        subject.moveWest(true);
        List<Coordinate> coordinates = subject.getCoordinates();

        assertEquals(5, coordinates.size());
    }
}