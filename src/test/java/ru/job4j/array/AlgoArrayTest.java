package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AlgoArrayTest {

    @Test
    public void when016491than014916() {
        int[] inArray =  new int[] {0, 16, 4, 9, 1};
        int[] result = AlgoArray.sortArr(inArray);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }
}