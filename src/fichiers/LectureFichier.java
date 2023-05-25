package fichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {

        ArrayList<Ville3> arrayVilles = new ArrayList<>();

        Path path = Paths.get("C:/Users/pc/Downloads/tp_15_recensement.csv");
        Path destinationPath = Paths.get("C:/Users/pc/Downloads/tp_15_recensement_sup_25000_hab.csv");

        readFile(path);

        extractDataFromFile(path, arrayVilles);

        ArrayList<String> newArrayVilles = fillNewArray(path, arrayVilles);

        newArrayVilles.forEach(System.out::println);

        Files.write(destinationPath, newArrayVilles, StandardCharsets.UTF_8);

        List<String> lines3 = Files.readAllLines(destinationPath);
        lines3.forEach(System.out::println);


    }

    private static void readFile(Path path) throws IOException {
        if (path.toFile().exists()) {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            lines.forEach(System.out::println);
        } else {
            System.out.println("Ooops the file doesn't exist...try again");
        }
    }

    private static void extractDataFromFile(Path path, ArrayList<Ville3> arrayVilles) throws IOException {
        if (path.toFile().exists()) {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

            Iterator<String> iter = lines.iterator();
            iter.next();

            while (iter.hasNext()) {
                String line = iter.next();
                String[] tokens = line.split(";");
                arrayVilles.add(new Ville3(tokens[6]
                        , tokens[2]
                        , tokens[1]
                        , Integer.parseInt(tokens[9].trim().replace(" ", "")))
                );
            }
        }
    }

    private static ArrayList<String> fillNewArray(Path path, ArrayList<Ville3> arrayVilles) throws IOException {
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        String header = lines.get(0);
        String[] split = header.split(";");
        ArrayList<String> newArray = new ArrayList<>();
        newArray.add(split[6] + ";" + split[2] + ";" + split[1] + ";" + split[9]);
        for (Ville3 ville : arrayVilles) {
            if (ville.getPopulationTotal() >= 25000.0) {
                newArray.add(String.valueOf(ville));
            }
        }

        return newArray;
    }
}
