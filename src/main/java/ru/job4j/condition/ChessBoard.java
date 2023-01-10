package ru.job4j.condition;

public class ChessBoard {
    public static int elephantWay(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (coordinateIsValid(x1, y1, x2, y2) && stepIsValid(x1, y1, x2, y2)) {
            return Math.abs(x1 - x2);
        }
        return rsl;
    }

    public static boolean isValueOnBoard(int i) {
        return i >= 0 && i <= 7;
    }

    public static boolean coordinateIsValid(int... points) {
        int count = points.length;
        if (count != 4) {
            return false;
        }
        for (int i : points) {
            if (isValueOnBoard(i)) {
                count--;
            }
        }
        return count == 0;
    }

    public static boolean stepIsValid(int x1, int y1, int x2, int y2) {
       return Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }
}
