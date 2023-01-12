package ru.job4j.array;

import java.util.Arrays;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] arr = calculate(5);
        System.out.println(Arrays.toString(arr));
    }
}
