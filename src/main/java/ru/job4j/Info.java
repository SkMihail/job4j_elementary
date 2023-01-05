package ru.job4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Info {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("dd.MM.yyyy").format(localDate));

    }
}
