package tri;

import listes.villes.ComparatorHabitant;
import listes.villes.ComparatorNom;
import listes.villes.Ville;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestVille2 {
    public static void main(String[] args) {

        ArrayList<Ville2> villes = new ArrayList<>();
        villes.add(new Ville2("Nice", 343_000));
        villes.add(new Ville2("Narbonne", 53_400));
        villes.add(new Ville2("Lyon", 484_000));
        villes.add(new Ville2("Foix", 9_700));
        villes.add(new Ville2("Pau", 77_200));
        villes.add(new Ville2("Marseille", 850_700));
        villes.add(new Ville2("Tarbes", 40_600));

        System.out.println("ArrayList des villes (Liste non triée) : ");
        villes.forEach(System.out::println);
        System.out.println();

//        sortedPopulation(villes);

        comparatorName(villes);

        comparatorHabs(villes);



    }

    /**
     * @param villes Using Comparator Interface within ComparatorNom Class
     *               overriding the compare() method to order by Name
     */
    private static void comparatorName(ArrayList<Ville2> villes) {
        System.out.println("Using ComparatorNom");
        Collections.sort(villes, new ComparatorNom());
        villes.forEach(System.out::println);
    }

    /**
     * @param villes Using Comparator Interface within ComparatorHabs Class
     *               overriding the compare() method to order by population
     */
    private static void comparatorHabs(ArrayList<Ville2> villes) {
        System.out.println("Using ComparatorHabitant : ");
        villes.sort((o1, o2) -> new ComparatorHabitant().compare(o1, o2));
        villes.forEach(System.out::println);
    }

//    private static void sortedPopulation(ArrayList<Ville2> villes) {
//        System.out.println("ArrayList des villes (Liste triée) : ");
//        Collections.sort(villes);
//        villes.forEach(System.out::println);
//    }
}
