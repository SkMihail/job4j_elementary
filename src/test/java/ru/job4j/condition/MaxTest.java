package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1to0thenLeft() {
        int left = 1;
        int right = 0;
        int expected = 1;
        int actual = Max.max(left, right);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax0to0thenLeft() {
        int left = 0;
        int right = 0;
        int expected = 0;
        int actual = Max.max(left, right);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax0to10thenLeft() {
        int left = 0;
        int right = 1;
        int expected = 1;
        int actual = Max.max(left, right);
        assertThat(actual).isEqualTo(expected);
    }
}