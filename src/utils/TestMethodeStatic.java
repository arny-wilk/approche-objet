package utils;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.max;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int convertChaine = parseInt(chaine);
        System.out.println(convertChaine);

        int a = 10;
        int b = 15;
        int compare = max(a, b);
        System.out.println(compare);
    }
}
