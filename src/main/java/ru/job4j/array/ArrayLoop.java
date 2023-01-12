package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] matrix = new int[5];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = i * 2 + 3;
        }
        int count = 0;
        for (int y : matrix) {
            System.out.printf("yValue[%d] = %d%s", count, y, System.lineSeparator());
            count++;
        }
    }
}
