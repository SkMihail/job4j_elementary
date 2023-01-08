package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenXY11XY11then0() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 1;
        int y2 = 1;
        double expected = 0;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenXY00XY11then1dot41() {
        int x1 = 0;
        int x2 = 1;
        int y1 = 0;
        int y2 = 1;
        double expected = 1.41;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenXY90XY11then8dot06() {
        int x1 = 9;
        int x2 = 1;
        int y1 = 0;
        int y2 = 1;
        double expected = 8.06;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenXYminIntXYmaxIntThen6dot07E9() {
        int x1 = Integer.MIN_VALUE;
        int x2 = Integer.MAX_VALUE;
        int y1 = Integer.MIN_VALUE;
        int y2 = Integer.MAX_VALUE;
        double expected = 6.07E9;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, actual, 0.01E9);
    }
}