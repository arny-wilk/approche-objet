package sets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>(Arrays.asList("US"
                , "France"
                , "Allemagne"
                , "UK"
                , "Italie"
                , "Japon"
                , "Chine"
                , "Russie"
                , "Inde"));

        List<String> collect = countries.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

        maxLengthCountry(collect);

        System.out.println("We remove the max length country : ");
        remmoveCountryMaxLength(collect).forEach(System.out::println);

    }

    /**
     * @param countries On recherche le Pays qui a le plus grand nombre de caractère
     */
    private static void maxLengthCountry(List<String> countries) {
        System.out.println("The Country with Max Character length is : " + countries.get(countries.size() - 1));
    }


    /**
     * @param countries On retire le paus ayant le plus grand nombre de caractères du HashSet
     * @return
     */
    private static List<String> remmoveCountryMaxLength(List<String> countries) {
        countries.remove(countries.size()-1);
        return countries;
    }
}
