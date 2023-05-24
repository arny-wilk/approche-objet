package sets.pays;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;

public class TestPays {
    public static void main(String[] args) {
        HashSet<Pays> pays = new HashSet<>();
        pays.add(new Pays("USA", 331_900_000, 70_248.63));
        pays.add(new Pays("France", 67_750_000, 43_658.98));
        pays.add(new Pays("Allemagne", 83_200_000, 51_203.55));
        pays.add(new Pays("UK", 64_550_000, 46_510.28));
        pays.add(new Pays("Italie", 59_110_000, 35_657.50));
        pays.add(new Pays("Japon", 125_700_000, 39_312.66));
        pays.add(new Pays("Chine", 1_412_000_000, 12_556.33));
        pays.add(new Pays("Russie", 143_400_000, 12_194.78));
        pays.add(new Pays("Inde", 1_408_000_000, 2_256.59));

        highestGDPperCapita(pays);

        findHighestTotalGDP(pays);


        System.out.println("Modify the country with lowest GDP : ");
        modifyMin(pays);
        pays.forEach(System.out::println);
        System.out.println();
        System.out.println("Remove the country with lowest GDP : ");
        removeLowestGDPCountry(pays);
        System.out.println();
        pays.forEach(System.out::println);

    }

    private static void removeLowestGDPCountry(HashSet<Pays> pays) {
        Optional<Pays> min = pays.stream().min(Comparator.comparingDouble(Pays::getTotalGdp));
        Iterator<Pays> iter = pays.iterator();
        while (iter.hasNext()) {
            Pays pays1 = iter.next();
            if(pays1.equals(min.get())){
                iter.remove();
            }
        }
    }

    private static void modifyMin(HashSet<Pays> pays) {
        Optional<Pays> min = pays.stream().min(Comparator.comparingDouble(Pays::getTotalGdp));
        Iterator<Pays> iter = pays.iterator();
        while (iter.hasNext()) {
            Pays pays1 = iter.next();
            if(pays1.equals(min.get())){
                pays1.setNom(pays1.getNom().toUpperCase());
            }
        }
    }

    private static void findHighestTotalGDP(HashSet<Pays> pays) {
        Optional<Pays> max = pays.stream().max(Comparator.comparingDouble(Pays::getTotalGdp));
        System.out.println("The country with the Highest Total GDP is : " + max.get().getNom());
    }

    private static void highestGDPperCapita(HashSet<Pays> pays) {
        Optional<Pays> max = pays.stream().max(Comparator.comparingDouble(Pays::getGdpByHabs));
        System.out.println("The country with the highest GDP per capita : " + max.get());
    }
}
