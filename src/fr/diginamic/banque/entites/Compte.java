package fr.diginamic.banque.entites;

import java.math.BigDecimal;

public class Compte {

    private String numero_compte;
    private BigDecimal solde_compte;

    public Compte(String numero_compte, BigDecimal solde_compte) {
        this.numero_compte = numero_compte;
        this.solde_compte = solde_compte;
    }

    @Override
    public String toString() {
        return "numero_compte='" + numero_compte + '\'' + ", solde_compte=" + solde_compte;
    }
}
