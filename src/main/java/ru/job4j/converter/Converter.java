package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        int buf = (int) (rsl * 10000);
        rsl = (float) buf / 10000;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        int buf = (int) (rsl * 10000);
        rsl = (float) buf / 10000;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");

        float inrubleToEuro = 140;
        float expected = 2;
        float outEuro = Converter.rubleToEuro(inrubleToEuro);
        boolean passedRubleToEuro = expected == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedRubleToEuro);

        float inRubleToDollar = 140;
        float expectedDollar = 2.3333F;
        float outDollar = Converter.rubleToDollar(inRubleToDollar);
        boolean passedRubleToDollar = expectedDollar == outDollar;
        System.out.println("120 rubles are 2. Test result : " + passedRubleToDollar);

    }
}
