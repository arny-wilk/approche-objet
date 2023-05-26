package listes.villes;

import java.util.ArrayList;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("New York", 8_468_000, Continent.AMERIQUE_NORD));
        villes.add(new Ville("Paris", 2_161_000, Continent.EUROPE));
        villes.add(new Ville("Pekin", 21_540_000, Continent.ASIE));
        villes.add(new Ville("Moscou", 11_980_000, Continent.ASIE));
        villes.add(new Ville("Berlin", 3_645_000, Continent.EUROPE));
        villes.add(new Ville("Sydney", 5_312_000, Continent.ASIE));
        villes.add(new Ville("Sao Paulo", 12_330_000, Continent.AMERIQUE_SUD));
        villes.add(new Ville("Dakar", 1_146_000, Continent.AFRIQUE));

        villes.forEach(System.out::println);
    }
}
