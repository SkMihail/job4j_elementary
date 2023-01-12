package ru.job4j.array;

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
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        temp = array[1];
        array[1] =  array[2];
        array[2] = temp;

        temp = array[3];
        array[3] = array[4];
        array[4] = temp;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}



