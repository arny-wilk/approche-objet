package listes;

import java.util.*;
import java.util.stream.Collectors;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> listeEntier = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        listeEntier.forEach(System.out::println);
        System.out.println();
        sizeOfArrayList(listeEntier);
        System.out.println();

        listeEntier.sort(Comparator.naturalOrder());
        System.out.println("Natural order : ");
        listeEntier.forEach(System.out::println);

        maximumValue(listeEntier);

        removeMinimumValue(listeEntier);

        System.out.println();

        arrayListPositiveValueOnly(listeEntier);
    }

    private static void arrayListPositiveValueOnly(ArrayList<Integer> listeEntier) {
        System.out.println("ArrayList Positive numbers only : ");
        List<Integer> positiveValues = listeEntier.stream().map(o -> Math.abs(o)).collect(Collectors.toList());
        positiveValues.forEach(System.out::println);
    }

    private static void removeMinimumValue(ArrayList<Integer> listeEntier) {
        System.out.println("Remove the smallest element of the Array List");
        listeEntier.remove(0);
        listeEntier.forEach(System.out::println);
    }

    private static void maximumValue(ArrayList<Integer> listeEntier) {
        System.out.println("Maximum value : ");
        Integer max = listeEntier.get(listeEntier.size() - 1);
        System.out.println(max);
    }

    private static void sizeOfArrayList(ArrayList<Integer> listeEntier) {
        System.out.println("Size of the ArrayList : ");
        System.out.println(listeEntier.size());
    }
}
