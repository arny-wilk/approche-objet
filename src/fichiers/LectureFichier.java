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

        ArrayList arrayVilles = new ArrayList<>();

        Path path = Paths.get("C:/Users/pc/Downloads/tp_15_recensement.csv");
        Path destinationPath = Paths.get("C:/Users/pc/Downloads/tp_15_recensement_sup_25000_hab.csv");
//        readFile(path);

        fillArray(path, arrayVilles);

        ArrayList<String> newArrayVilles = generateArrayList(arrayVilles);

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

    private static void fillArray(Path path, ArrayList arrayVilles) throws IOException {
        if (path.toFile().exists()) {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

            Iterator<String> iter = lines.iterator();
            String firstLine = iter.next();
            String[] header = firstLine.split(";");
            arrayVilles.add(header[6] + ";" + header[2] + ";" + header[1] + ";" + header[9]);

            while (iter.hasNext()) {
                String line = iter.next();
                String[] tokens = line.split(";");
                arrayVilles.add(new Ville3(tokens[6]
                        , tokens[2]
                        , tokens[1]
                        , Double.parseDouble(tokens[9].trim().replace(" ", "")))
                );
            }
        }
    }

    private static ArrayList<String> generateArrayList(ArrayList arrayVilles) {
        ArrayList<String> newArray = new ArrayList<>();
        Iterator<Ville3> iter = arrayVilles.iterator();
        newArray.add(String.valueOf(iter.next()));
        while (iter.hasNext()){
            Ville3 ville = iter.next();
            if(ville.getPopulationTotal() >= 25000.0){
                newArray.add(String.valueOf(ville));
            }
        }

        return newArray;
    }
}
