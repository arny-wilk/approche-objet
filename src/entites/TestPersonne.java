package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale addr3 = new AdressePostale(12, "Rue des mousquetaires", 34000, "Montpellier");
        AdressePostale addr4 = new AdressePostale(8, "Rue Jean Moulin", 34500, "Béziers");

        Personne personne1 = new Personne("tata", "papa", addr3);
        Personne personne2 = new Personne("titi", "pipi", addr4);

        personne1.print();

        addr3.setLibelle_rue("Rue des Tulipes");

        personne1.print();
    }
}
