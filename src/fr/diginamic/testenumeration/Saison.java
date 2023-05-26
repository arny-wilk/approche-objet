package fr.diginamic.testenumeration;

import java.util.Optional;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4),
    ;

    private String libelle;
    private int ordre;

    private static String none="Null";

    private Saison(String libelle, int ordre){
        this.libelle = libelle;
        this.ordre = ordre;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public static Saison equaly(String libelle){
        Saison[] saisons = Saison.values();
        for(Saison s: saisons){
            if(s.getLibelle().equalsIgnoreCase(libelle)){
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return libelle + " " + ordre;
    }
}
