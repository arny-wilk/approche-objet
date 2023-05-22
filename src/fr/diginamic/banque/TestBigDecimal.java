package fr.diginamic.banque;

import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) {
        double taux1 = 1.03;
        double montant = 2001.05;
        double annuite = taux1 * montant;
        System.out.println("Without BigDecimal type :");
        System.out.println(annuite);

        convertToBigDecimal(taux1, montant);
    }

    /**
     * @param taux1 {double} le taux d'intérêt appliqué
     * @param montant {double} le montant du principal
     */
    private static void convertToBigDecimal(double taux1, double montant) {
        BigDecimal newTaux1 = BigDecimal.valueOf(taux1);
        BigDecimal newMontant = BigDecimal.valueOf(montant);

        System.out.println("With BigDecimal type :");
        BigDecimal newAnnuite = newTaux1.multiply(newMontant);
        System.out.println(newAnnuite);
    }
}
