package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] x : array) {
            for (int y : x) {
                rsl += y;
            }
        }
        return rsl;
    }
}
