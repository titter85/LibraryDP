package pl.sda.cmed.design_patterns.operational.strategy.pattern;

import java.util.List;

public class ConfigurablePrinter {

    public String print(List<Integer> printable, SortStrategy sortStrategy) {

        // zadanie 1:
        // Dodaj do tej metody parameter, który pozwoli podać Ci
        // obiekt implementujący interfejs SortStrategy

        // zdadnie 2:
        // Wykorzystaj przekazaną implementację interfejsu do tego by
        // posortować listę przekazaną w parametrze printable
        // przed jej wydrukowaniem

        // zadanie 3:
        // Więcej w klasach: NoSort, ReverseSort, RandomSort

        return sortStrategy.sort(printable)
                .stream()
                .map(Object::toString)
                .reduce((x, y) -> x + "," + y)
                .orElse("");
    }
}
