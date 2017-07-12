package pl.sda.cmed.design_patterns.operational.strategy.pattern;

import java.util.Collections;
import java.util.List;

public class RandomSort implements SortStrategy{
    // zadanie 3c:

    @Override
    public List<Integer> sort(List<Integer> printable) {
        Collections.shuffle(printable);
        return printable;
    }
    // Zaimplementuj interfejs SortStrategy
    // w taki sposób by przekazywana kolekcja
    // zmieniła kolejność w losowy sposób
}
