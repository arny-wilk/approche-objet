package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays2> listPays = new ArrayList<>();
        listPays.add(new Pays2("France", 65_000_000, "Europe"));
        listPays.add(new Pays2("Allemagne", 80_000_000, "Europe"));
        listPays.add(new Pays2("Belgique", 10_000_000, "Europe"));
        listPays.add(new Pays2("Russie", 150_000_000, "Asie"));
        listPays.add(new Pays2("Chine", 1_400_000_000, "Asie"));
        listPays.add(new Pays2("Indonésie", 220_000_000, "Océanie"));
        listPays.add(new Pays2("Australie", 20_000_000, "Océanie"));

        HashMap<String, Integer> mapContinent = getStringIntegerHashMap(listPays);

        System.out.println(mapContinent);
    }

    private static HashMap<String, Integer> getStringIntegerHashMap(ArrayList<Pays2> listPays) {
        HashMap<String, Integer> mapContinent = new HashMap<>();
        Iterator<Pays2> iter = listPays.iterator();
        while (iter.hasNext()){
            Pays2 pays = iter.next();
            if(!mapContinent.containsKey(pays.getContinent())){
                mapContinent.put(pays.getContinent(), 1);
            } else {
                int compteur = mapContinent.get(pays.getContinent());
                compteur++;
                mapContinent.put(pays.getContinent(), compteur);
            }
        }
        return mapContinent;
    }
}
