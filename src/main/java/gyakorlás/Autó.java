package gyakorlás;

//* Osztály definíció:

public class Autó {
    private static int példányszám;
    private String rendszám;
    private int teljesítmény;
    private boolean automata;

//* Konstruktor

    public Autó(String rendszám, int teljesítmény, boolean automata) {
        Autó.példányszám++;
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
    }

//* Példányosítás:

    public static void main(String[] args) {
        Autó a1 = new Autó(new String("HHT-376"), 75, false);
        Autó a2 = new Autó(new String("GER-786"), 60, false);
        Autó a3 = new Autó(new String("BGJ-391"), 95, true);
    }
}