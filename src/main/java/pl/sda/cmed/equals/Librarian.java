package pl.sda.cmed.equals;

public class Librarian extends Person {

    private int wage;

    public Librarian(String name, String surname, int age, int wage) {
        super(name, surname, age);
        this.wage = wage;
    }

    //     zadanie dodatkowe
    //     W metodach equals i hashCode dopisz implementacje tak by uwzględniały
    //     metody klasy nadrzędnej oraz wartość pola wage
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Librarian)) return false;

//        boolean result = super.equals(o);
//
//        if (result && this.wage != ((Librarian)o).getWage()){
//            result = false;
//        }

        return super.equals(o) && this.wage != ((Librarian)o).getWage();
    }

    @Override
    public int hashCode() {
        int result = 31 * super.hashCode() + this.wage;
        return result;
    }

    public int getWage() {
        return wage;
    }
}
