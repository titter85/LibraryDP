package pl.sda.cmed.design_patterns.operational.observer;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class StringSubject implements Subject {
    private String value;
    private List<Observer> observersList = new LinkedList<Observer>();
    // zadanie 1a:
    // Stwórz pole typu List<Observer>, które będzie przechowywać zarejestrowanych obserwatorów
    // i zainicjalizuj je instancją klasy LinkedList

    // zadanie1b:
    // Stwórz pole odpowiadające obecnemu stanowi naszego Subject'a


    @Override
    public void attach(Observer observer) {
        // zadanie 1c:
        // Wypełnij metodę dołączającą obserwatora do listy obserwatorów
        // sprawadzając najpierw czy jest on już w liście obserwatorów
        // hint: .contains() .add()
        if (!observersList.contains(observer)) {
            observersList.add(observer);
        }
    }

    @Override
    public void notifyChanged() {
        // zadanie 2a:
        // powiadom każdego z zarejestrowanych obserwatorów wywołując ich metodę update(...)
        // hint: forEach()
        observersList.forEach(o -> o.update(this.value));
    }

    // zadanie 2b:
    // Dodaj metodę o nazwie setValue(String newValue) ustawiającą wartość zmiennej stanu
    // po przypisaniu nowego stanu wywołaj metodę notifyChanged by powiadomić obserwatorów o zmianie


    @Override
    public void detach(Observer observer) {
        // zadanie 2c:
        // usuń obserwatora z listy
        // hint: .remove()
        observersList.remove(observer);
    }

    public void setValue(String value) {
        this.value = value;
        notifyChanged();
    }
}