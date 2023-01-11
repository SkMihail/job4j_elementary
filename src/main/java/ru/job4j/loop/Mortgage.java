package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double debtOnCredit = amount;
        while (debtOnCredit > 0) {
            debtOnCredit = debtOnCredit + debtOnCredit * percent / 100 - salary;
            year++;
        }
        return year;
    }
}