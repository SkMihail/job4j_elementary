package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int backCoin = money - price;
        while (backCoin > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (backCoin - coins[i] >= 0) {
                    backCoin -= coins[i];
                    rsl[size] = coins[i];
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
