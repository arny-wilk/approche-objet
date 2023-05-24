package fichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path originPath = Paths.get("C:/Users/pc/Downloads/tp_15_recensement.csv");

        createNewFile(originPath);

    }

    private static void createNewFile(Path originPath) throws IOException {
        Path destinationPath = Paths.get("C:/Users/pc/Downloads/tp_15_recensement_version2.csv");

        List<String> lines = Files.readAllLines(originPath, StandardCharsets.UTF_8);

        ArrayList<String> arrayLines = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayLines.add(lines.get(i));
        }
        Files.write(destinationPath, arrayLines, StandardCharsets.UTF_8);

        List<String> lines2 =  Files.readAllLines(destinationPath);
        lines2.forEach(System.out::println);
    }
}
