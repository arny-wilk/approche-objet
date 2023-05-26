package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

        String str = "";

        long debut1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            str += i;
        }
        long fin1 = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes pour la concaténation : " + (fin1 - debut1));

        StringBuilder buildStr = new StringBuilder();

        long debut2 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            buildStr.append(i);
        }
        long fin2 = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes pour la classe String Build : " + (fin2 - debut2));
    }
}
