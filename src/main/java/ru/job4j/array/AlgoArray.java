package ru.job4j.array;

import java.util.Arrays;

public class AlgoArray {
    public static int[] sortArr(int[] arr) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {10, 8, 9, 6, 4, 7, 3, 2, 1, 0, 5};
        System.out.println(Arrays.toString(sortArr(array)));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}



