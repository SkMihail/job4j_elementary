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

    @Test
    void whenMax0or0or0then0() {
        int first = 0;
        int second = 0;
        int third = 0;
        int expected = 0;
        int actual = Max.max(first, second, third);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax0or10or1then10() {
        int first = 0;
        int second = 10;
        int third = 1;
        int expected = 10;
        int actual = Max.max(first, second, third);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax0or10or1or100500then100500() {
        int first = 0;
        int second = 10;
        int third = 1;
        int fourth = 100500;
        int expected = 100500;
        int actual = Max.max(first, second, third, fourth);
        assertThat(actual).isEqualTo(expected);
    }
}