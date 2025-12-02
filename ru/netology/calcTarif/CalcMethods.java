package ru.netology.calcTarif;

public class CalcMethods {
    public static int premiereVariante(int revenu){
        double resultat = 0.06 * revenu;
        return (int) resultat;
    }

    public static int deuxiemeVariante(int revenu, int depense){
        double resultat = 0.15 * (revenu - depense);
        return (int) resultat;
    }
}
