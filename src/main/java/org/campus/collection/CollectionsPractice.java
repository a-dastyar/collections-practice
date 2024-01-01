package org.campus.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CollectionsPractice {

    public static void main(String[] args) {

        System.out.println("--------- Zipping and printing lists ---------");
        var linked = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        var array = new ArrayList<>(List.of(1, 2, 3));
        zipAndPrint(linked, array);

        System.out.println("--------- Adding countries to map and printing ---------");
        var countries = Map.of(
                "IRN", new Country("Iran", "IRN", 87_590_873),
                "IRQ", new Country("Iraq", "IRQ", 43_324_000),
                "IND", new Country("India", "IND", 1_428_627_663),
                "USA", new Country("U.S. America", "USA", 334_914_895)
        );
        System.out.printf("The population of Iran is: %d \n", countries.get("IRN").getPopulation());
        countries.values().forEach(System.out::println);
    }

    public static void zipAndPrint(List<Integer> first, List<Integer> second) {
        var itr1 = first.iterator();
        var itr2 = second.iterator();
        while (itr1.hasNext() || itr2.hasNext()) {
            var number1 = (itr1.hasNext() ? Optional.ofNullable(itr1.next()).orElse(0) : 0);
            var number2 = (itr2.hasNext() ? Optional.ofNullable(itr2.next()).orElse(0) : 0);
            System.out.println(number1 + number2);
        }
    }

}
