package listes.villes;

import tri.Ville2;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville2> {
    @Override
    public int compare(Ville2 o1, Ville2 o2) {
        if(o1.getNbHabitants() < o2.getNbHabitants()){
            return -1;
        } else if (o1.getNbHabitants() > o2.getNbHabitants()){
            return +1;
        }
        return 0;
    }
}
