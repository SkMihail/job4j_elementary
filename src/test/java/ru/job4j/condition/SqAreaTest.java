package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP10K10then2dot06() {
        double expected = 2.06;
        double p = 10;
        double k = 10;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP0K0then0() {
        double expected = 0;
        double p = 0;
        double k = 0;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP10K0then0() {
        double expected = 0;
        double p = 10;
        double k = 0;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP0K10then0() {
        double expected = 0;
        double p = 0;
        double k = 10;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, 0.01);
    }
}