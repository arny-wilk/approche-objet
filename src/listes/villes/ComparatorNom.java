package listes.villes;

import tri.Ville2;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville2> {
    @Override
    public int compare(Ville2 o1, Ville2 o2) {
        int result = o1.getNom().compareTo(o2.getNom());
        return result;
    }
}
