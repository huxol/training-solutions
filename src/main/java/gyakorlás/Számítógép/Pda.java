package gyakorlás.számítógép;

//*   15.4.2. Származtassunk a Notebook osztályból egy Pda osztályt!
//    Az új osztály objektumai a notebook tulajdonságain kívül egy új -
//    egész értékű - súly adattaggal is rendelkeznek, amely a pda
//    súlyát tárolja grammban kifejezve. Készítsünk az új adattaghoz
//    lekérdező és beállító metódust, valamint az osztályhoz egy konstruktort,
//    amellyel mindegyik adattagjának kezdőérték adható!

public class Pda extends Notebook {
    private int súly;


    public Pda(String processzor, double sebesség, int ram, int hdd, double üzemidő, int súly) {
        super(processzor, sebesség, ram, hdd, üzemidő);
        this.súly = súly;
    }

    public int getSúly() {
        return súly;
    }

    public void setSúly(int súly) {
        this.súly = súly;
    }

    //* 15.4.3. Definiáljuk felül a Pda osztály Notebook osztálytól örökölt toString()
    // metódusát úgy, hogy az örököltek mellett a súly adattagot is jelenítse meg,
    // valamint a hdd adattag megjelenített neve "HDD" helyett "háttértár" legyen!
    // Az alábbi pda példányt hozzuk létre, és jelenítsük meg a képernyőn!
    //
    //Pda p1: Samsung, 0.4 GHz, 512 MB, 64 GB, 3 óra, 125 g


    @Override
    public String toString() {
        return super.getProcesszor() + " " + super.getSebesség() + " GHz CPU, "
                + super.getRam() + " MB RAM, " + super.getHdd() + " GB háttértár, "
                + super.getÜzemidő() + " óra üzemidő, " + súly + " gramm súly";
    }

    @Override
    public boolean korszerű() {
        return (super.getSebesség() > 0.3 && super.getRam() >= 128
                && super.getHdd() >= 16 && üzemidő >= 2.5 && súly < 150);
    }
}
