package listes.villes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestVille {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343_000));
        villes.add(new Ville("Narbonne", 53_400));
        villes.add(new Ville("Lyon", 484_000));
        villes.add(new Ville("Foix", 9_700));
        villes.add(new Ville("Pau", 77_200));
        villes.add(new Ville("Marseille", 850_700));
        villes.add(new Ville("Tarbes", 40_600));

        villes.forEach(System.out::println);
        System.out.println();

        biggestCity(villes);

        removeSmallestCity(villes);

        toUpperCaseLargestCities(villes);

    }

    /**
     * @param villes On met en Majsucule les plus grandes villes
     */
    private static void toUpperCaseLargestCities(ArrayList<Ville> villes) {
        Iterator<Ville> iter = villes.iterator();
        while(iter.hasNext()){
            Ville ville = iter.next();
            if(ville.getNbHabitants() >= 100_000){
                ville.setNom(ville.getNom().toUpperCase());
            }
        }
        System.out.println("Grandes Villes en Majuscule : ");
        villes.forEach(System.out::println);
    }

    /**
     * @param villes On trouve la plus grande ville
     */
    private static void biggestCity(ArrayList<Ville> villes) {
        villes.sort(Comparator.comparingInt(Ville::getNbHabitants));
        Ville maximumHabitants = villes.get(villes.size() - 1);
        System.out.println("Ville ayant le plus grand nombre d'habitants : " + maximumHabitants);
    }

    /**
     * @param villes On enlève la plus petite ville
     */
    private static void removeSmallestCity(ArrayList<Ville> villes) {
        villes.sort(Comparator.comparingInt(Ville::getNbHabitants));
        Ville smallestCity = villes.get(0);
        villes.remove(smallestCity);
        System.out.println("Nous avons enlevé la ville la plus petite : " + smallestCity);
    }
}
