package pl.sda.cmed.design_patterns.operational.strategy.pattern;

import java.util.Collections;
import java.util.List;

public class ReverseSort implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> printable) {
        Collections.reverse(printable);
        return printable;
    }
    // zadanie 3b:
    // Zaimplementuj interfejs SortStrategy
    // w taki sposób by przekazywana zmienna była w odwrotnej kolejności
}
