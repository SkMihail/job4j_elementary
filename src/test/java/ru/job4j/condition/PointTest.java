package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenXY11XY11then0() {
        double expected = 0;
        double actual = new Point(1, 1).distance(new Point(1, 1));
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenXY00XY11then1dot41() {
        Point one = new Point(0, 0);
        Point two = new Point(1, 1);
        double expected = 1.41;
        double actual = one.distance(two);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenXY90XY11then8dot06() {
        Point one = new Point(9, 0);
        double expected = 8.06;
        double actual = one.distance(new Point(1, 1));
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenXY00IntXYmaxIntThen3dot03E9() {
        Point one = new Point(0, 0);
        Point two = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
        double expected = 3.03E9;
        double actual = one.distance(two);
        assertEquals(expected, actual, 0.01E9);
    }

    @Test
    public void whenXYZ000XYZ111then1dot73() {
        Point one = new Point(0, 0, 0);
        Point two = new Point(1, 1, 1);
        double expected = 1.73;
        double actual = one.distance3d(two);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenXYZ000XYZ777then12dot12() {
        Point one = new Point(0, 0, 0);
        Point two = new Point(7, 7, 7);
        double expected = 12.12;
        double actual = one.distance3d(two);
        assertEquals(expected, actual, 0.01);
    }
}