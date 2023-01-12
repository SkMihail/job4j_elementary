package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] yValue = new int[5];
        for (int i = 0; i < yValue.length; i++) {
            yValue[i] = i * 2 + 3;
        }
        int count = 0;
        for (int y: yValue) {
            System.out.printf("yValue[%d] = %d%s", count, y, System.lineSeparator());
            count++;
        }
    }
}
