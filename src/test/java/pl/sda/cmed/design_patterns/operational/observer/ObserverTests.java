package pl.sda.cmed.design_patterns.operational.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ObserverTests {

    @Test
    public void attachingTest() {
        StringSubject subject = new StringSubject();

        // Dodaj do subject'a utworzonych obserwatorów
         subject.attach(new SecondObserver());
         subject.attach(new ThirdObserver());
         subject.attach(new FirstObserver());

         subject.setValue("Woo Hoo");
        // zaobserwuj co zostało wypisane w konsoli
        subject.setValue("zmieniam się :)");
    }

    @Test
    public void detachingTest() {
        StringSubject subject = new StringSubject();

        // Zarejestruj w subject'cie utworzonych obserwatorów
         subject.attach(new SecondObserver());
         subject.attach(new ThirdObserver());

        // Przypisz jednego z obserwatorów do zmiennej i zarejestruj go w subject'cie
         FirstObserver modifyingObserver = new FirstObserver();
         subject.attach(modifyingObserver);

        System.out.println("First notification:");
         subject.setValue("Message1");
        System.out.println("-------- end of notifications --------");

        // wyrejestruj wcześniej przypisanego do zmiennej obserwatora z subject'a
         subject.detach(modifyingObserver);

        System.out.println("Second notification:");
         subject.setValue("Message2");
        System.out.println("-------- end of notifications --------");
        // zaobserwuj co zostało wypisane w konsoli
    }
}
