package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.printf("Размер массива ages = %d,%s", ages.length, System.lineSeparator());
        String[] surnames = new String[100500];
        System.out.printf("Размер массива surnames = %d,%s", surnames.length, System.lineSeparator());
        float[] prices = new float[40];
        System.out.printf("Размер массива prices = %d,%s", prices.length, System.lineSeparator());
    }
}
