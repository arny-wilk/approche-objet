package fr.diginamic.banque.entites;

import java.math.BigDecimal;

public class CompteTaux extends Compte {

    float taux_remuneration;

    public CompteTaux(String numero_compte, BigDecimal solde_compte, float taux_remuneration) {
        super(numero_compte, solde_compte);
        this.taux_remuneration = taux_remuneration;
    }

    @Override
    public String toString() {
        return super.toString() + ", taux_remuneration=" + taux_remuneration;
    }
}
