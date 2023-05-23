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

    private static void toUpperCase(ArrayList<String> villes) {
        Iterator<String> iter = villes.iterator();
        System.out.println("UpperCase all cities : ");
        while(iter.hasNext()){
            String ville = iter.next();
            String upperCase = ville.toUpperCase();
            System.out.println(upperCase);
        }
    }

    private static void maximumLength(ArrayList<String> villes) {
        villes.sort(Comparator.naturalOrder());
        System.out.println("Maximum Length is : " + villes.get(0));
    }

}
