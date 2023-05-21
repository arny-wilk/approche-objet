package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.math.BigDecimal;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte("123456", BigDecimal.valueOf(12350.0));
        CompteTaux compte2 = new CompteTaux("755777", BigDecimal.valueOf(33432.02), 1.27f);

        Compte[] tableauDesComptes = new Compte[2];
        tableauDesComptes[0] = compte1;
        tableauDesComptes[1] = compte2;

        for (int i = 0; i < tableauDesComptes.length; i++) {
            System.out.println(tableauDesComptes[i]);
        }


    }
}
