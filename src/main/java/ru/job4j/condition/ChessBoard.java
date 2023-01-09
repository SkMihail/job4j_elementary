package ru.job4j.condition;

public class ChessBoard {
    public static int elephantWay(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (coordinateIsValid(x1, y1, x2, y2) && stepIsValid(x1, y1, x2, y2)) {
            return Math.abs(x1 - x2);
        }
        return rsl;
    }

    public static boolean coordinateIsValid(int x1, int y1, int x2, int y2) {
        return x1 >= 0 && x1 <= 7
                && x2 >= 0 && x2 <= 7
                && y1 >= 0 && y1 <= 7
                && y2 >= 0 && y2 <= 7;
    }

    public static boolean stepIsValid(int x1, int y1, int x2, int y2) {
       return Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }

}
