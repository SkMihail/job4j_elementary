package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isPrime = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
