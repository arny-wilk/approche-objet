package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        showKeys(mapVilles);

        showValues(mapVilles);

        System.out.println("La taille du HashMap est : " + mapVilles.size());

    }

    private static void showValues(HashMap<Integer, String> mapVilles) {
        System.out.println("Les valeurs de notre HashMap sont : ");
        for (String ville: mapVilles.values()){
            System.out.println(ville);
        }
    }

    private static void showKeys(HashMap<Integer, String> mapVilles) {
        System.out.println("Les clés de notre HashMap sont : ");
        for (Integer key : mapVilles.keySet()){
            System.out.println(key);
        }
    }
}
