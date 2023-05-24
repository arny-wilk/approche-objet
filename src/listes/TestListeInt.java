package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> listeEntier = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        listeEntier.forEach(System.out::println);

        System.out.println();

        sizeOfArrayList(listeEntier);

        System.out.println();

        listeEntier.sort(Comparator.naturalOrder());
        System.out.println("Natural order : ");
        listeEntier.forEach(System.out::println);

        System.out.println();

        maximumValue(listeEntier);

        System.out.println();

        removeMinimumValue(listeEntier);

        System.out.println();

        arrayListPositiveValueOnly(listeEntier);
    }

    /**
     * @param listeEntier Valeur absolue des éléments de l'ArrayList
     */
    private static void arrayListPositiveValueOnly(List<Integer> listeEntier) {
        System.out.println("ArrayList Positive numbers only : ");
        List<Integer> positiveValues = listeEntier.stream().map(o -> Math.abs(o)).collect(Collectors.toList());
        positiveValues.forEach(System.out::println);
    }

    /**
     * @param listeEntier On enlève l'élément le plus petit de la liste
     */
    private static void removeMinimumValue(List<Integer> listeEntier) {
        System.out.println("Remove the smallest element of the Array List");
        Integer remove = listeEntier.remove(0);
        System.out.println(remove);

    }

    /**
     * @param listeEntier Recherche de la valeur maximale
     */
    private static void maximumValue(List<Integer> listeEntier) {
        System.out.println("Maximum value : ");
        Integer max = listeEntier.get(listeEntier.size() - 1);
        System.out.println(max);
    }

    private static void sizeOfArrayList(List<Integer> listeEntier) {
        System.out.println("Size of the ArrayList : ");
        System.out.println(listeEntier.size());
    }
}
