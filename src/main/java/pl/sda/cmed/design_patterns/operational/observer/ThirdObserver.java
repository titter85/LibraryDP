package pl.sda.cmed.design_patterns.operational.observer;

public class ThirdObserver implements Observer {
    @Override
    public void update(String newValue) {
        System.out.println(this.getClass().getSimpleName()+" [Observed New Value]: "+newValue+"BLEBLE");
    }
    /* zadanie 3a:
        Zaimplementuj interfejs Observer i w odpowiedzi na aktualizację
        wypisz informacje o przekazanym obiekcie do konsoli, załączając nazwę tej klasy.
    */
}