package maps;

import fichiers.Ville3;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapVilles {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/Users/pc/Downloads/tp_15_recensement.csv");

        HashMap<String, Ville3> mapVilles = new HashMap<>();

        createHashMap(path, mapVilles);

        removeSmallestCity(mapVilles);

        for (Ville3 ville : mapVilles.values()){
            System.out.println(ville);
        }

        BigDecimal num = new BigDecimal(123);
        System.out.println(num);

    }

    private static void removeSmallestCity(HashMap<String, Ville3> mapVilles) {
        Iterator<Ville3> iter = mapVilles.values().iterator();
        Ville3 first = iter.next();
        while(iter.hasNext()){
            Ville3 ville = iter.next();
            if(ville.getPopulationTotal() < first.getPopulationTotal()){
                first = ville;
            }
        }
        mapVilles.remove(first.getNom());
    }

    private static void createHashMap(Path path, HashMap<String, Ville3> mapVilles) throws IOException {
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        Iterator<String> iter = lines.iterator();
        iter.next();
        while (iter.hasNext()) {
            String line = iter.next();
            String[] tokens = line.split(";");
            mapVilles.put(tokens[6], new Ville3(tokens[6]
                    , tokens[2]
                    , tokens[1]
                    , Integer.parseInt(tokens[9].trim().replace(" ", ""))));
        }
    }
}
