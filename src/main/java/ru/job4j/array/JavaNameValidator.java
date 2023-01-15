package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || isNotLowerLatinLetter(name.charAt(0))) {
            return false;
        }
        char[] symbols = name.toCharArray();
        for (int i = 1; i < symbols.length; i++) {
            if (isNotLowerLatinLetter(symbols[i])
                    && isNotUpperLatinLetter(symbols[i])
                    && !Character.isDigit(symbols[i])
                    && isNotSpecialSymbol(symbols[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotSpecialSymbol(int code) {
        return code != 36 && code != 95;
    }

    public static boolean isNotUpperLatinLetter(int code) {
        return !(code >= 65 && code <= 90);
    }

    public static boolean isNotLowerLatinLetter(int code) {
        return !(code >= 97 && code <= 122);
    }
}

