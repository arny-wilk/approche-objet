package sets;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> sets = new HashSet<>();
        sets.add(1.5);
        sets.add(8.25);
        sets.add(-7.32);
        sets.add(13.3);
        sets.add(-12.45);
        sets.add(48.5);
        sets.add(0.01);

        sets.forEach(System.out::println);

        findMaxValue(sets);

        System.out.println("New HashSet after modification : ");
        removeMinimumValue(sets).forEach(System.out::println);
    }

    /**
     * @param sets Method to remove the minimum value of the HashSet
     * @return
     */
    private static List<Double> removeMinimumValue(HashSet<Double> sets) {
        List<Double> collect = sets.stream().sorted(Double::compareTo).collect(Collectors.toList());
        Double remove = collect.remove(0);
        System.out.println("The minimum value of the Hashest removed is : " + remove);
        return collect;
    }

    /**
     * @param sets On trouve la plus grande valeur de notre HashSet
     */
    private static void findMaxValue(HashSet<Double> sets) {
        Optional<Double> max = sets.stream().max(Double::compareTo);
        System.out.println("The Maximum value is : " + max.get());
    }
}
