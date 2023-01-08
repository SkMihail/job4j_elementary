package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result2 = Point.distance(100, 500, 500, 100);
        System.out.println("result (100, 500) to (500, 100) " + result2);

    }
}