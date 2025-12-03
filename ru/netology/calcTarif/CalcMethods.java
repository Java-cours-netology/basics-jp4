package ru.netology.calcTarif;

public class CalcMethods {
    public static int firstVariant(int revenue){
        double result = 0.06 * revenue;
        return (int) result;
    }

    public static int secondVariant(int revenue, int expense){
        double result = 0.15 * Math.abs(revenue - expense);
        return (int) result;
    }
}
