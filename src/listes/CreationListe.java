package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            liste.add(i);
        }
        liste.forEach(System.out::println);

        System.out.println(liste.size());
    }
}
