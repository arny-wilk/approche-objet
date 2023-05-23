package listes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<>(Arrays.asList("Nice"
                , "Carcassonne"
                , "Narbonne"
                , "Lyon"
                , "Foix"
                , "Pau"
                , "Marseille"
                , "Tarbes"));

        maximumLength(villes);

        toUpperCase(villes);

        System.out.println(removeFirstChar(villes));

    }

    /**
     * @param villes On enlève les villes qui commencent par la lettre N
     * @return une nouvelle arrayList de villes filtrées
     */
    private static ArrayList<String> removeFirstChar(ArrayList<String> villes) {
        Iterator<String> iter = villes.iterator();
        while(iter.hasNext()){
            String ville = iter.next();
            if(ville.charAt(0) == 'N'){
                iter.remove();
            }
        }
        return villes;
    }

    /**
     * @param villes On met les villes en Majuscule
     */
    private static void toUpperCase(ArrayList<String> villes) {
        Iterator<String> iter = villes.iterator();
        System.out.println("UpperCase all cities : ");
        while(iter.hasNext()){
            String ville = iter.next();
            String upperCase = ville.toUpperCase();
            System.out.println(upperCase);
        }
    }

    /**
     * @param villes On trouve la ville qui a le plus grand nombre de caractères
     */
    private static void maximumLength(ArrayList<String> villes) {
        villes.sort(Comparator.comparing(String::length));
        villes.forEach(System.out::println);
        System.out.println("Maximum Length is : " + villes.get(villes.size()-1));
    }

}
