package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

import java.math.BigDecimal;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte("123456", BigDecimal.valueOf(12350.0));
        System.out.println(compte1);
    }
}
