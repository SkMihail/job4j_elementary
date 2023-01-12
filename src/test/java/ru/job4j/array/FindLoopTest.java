package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot777ThenMinus1() {
        int[] data = new int[] {5, 10, 3, 7, 8, 9};
        int el = 777;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas777Then7() {
        int[] data = new int[] {5, 10, 3, 7, 8, 9, 555, 777};
        int el = 777;
        int result = FindLoop.indexOf(data, el);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}