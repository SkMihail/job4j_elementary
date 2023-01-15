package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        char[] symbols = name.toCharArray();
        if (!isLowerLatinLetter(symbols[0])) {
            return false;
        }
        for (int i = 1; i < symbols.length; i++) {
            if (!isLowerLatinLetter(symbols[i])
                    && !isUpperLatinLetter(symbols[i])
                    && !Character.isDigit(symbols[i])
                    && !isSpecialSymbol(symbols[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == '_' || code == '$';
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 'A' && code <= 'Z';
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 'a' && code <= 'z';
    }
}

