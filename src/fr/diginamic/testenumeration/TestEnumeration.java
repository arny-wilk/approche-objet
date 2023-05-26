package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison[] values = Saison.values();
        for (Saison s: values){
            System.out.println(s);
        }

        String nom = "ETE";
        Saison saison = Saison.valueOf(nom);
        System.out.println(saison.getLibelle());

        String libelle = "Hiver";

        Saison equaly = Saison.equaly(libelle);
        System.out.println(equaly);

    }
}
