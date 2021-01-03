package gyakorlás.számítógép;

//*     6. feladat: Származtassunk a Számítógép osztályból egy Notebook osztályt! Az új osztály
//      objektumai a számítógép tulajdonságain kívül egy új - valós értékű - üzemidő adattaggal
//      is rendelkeznek. Készítsünk az új adattaghoz lekérdező metódust, valamint az osztályhoz
//      egy konstruktort, amellyel mindegyik adattagjának kezdőérték adható!
//      Az új osztályt az extends kulcsszóval származtathatjuk a szülőosztályból.
//      A konstruktor és az új adattag lekérdező metódusának előállítása a generátor
//      használatával egyszerű. Figyeljük meg a super() metódus használatát!
//      Segítségével a szülőosztály adattagjaira hivatkozhatunk, míg a this
//      a származtatott osztály új adattagját hivatkozza.

import java.text.DecimalFormat;

public class Notebook extends Számítógép {
    public double üzemidő;


    public Notebook(String processzor, double sebesség, int ram, int hdd, double üzemidő) {
        super(processzor, sebesség, ram, hdd);
        this.üzemidő = üzemidő;
    }

    public double getÜzemidő() {
        return üzemidő;
    }

//*   7. feladat: Egészítsük ki a Notebook osztályt egy olyan konstruktorral is, amely a RAM
//    méretét 2048 MB-ra állítja be, a többi adattag értékét pedig paraméterek határozzák meg!
//
//    A Notebook osztály új konstruktorában a ram adattag nem szerepel paraméterként,
//    mert konkrét értéket kap, amit a super() metódus meghívásakor állítunk be.


    public Notebook(String processzor, double sebesség, int ram, int hdd) {
        super(processzor, sebesség, 2048, hdd);
        this.üzemidő = üzemidő;
    }

//*   8. feladat: Definiáljuk felül a Számítógép osztálytól örökölt toString() metódust úgy,
//    hogy a notebook a számítógéptől örökölt adattagjai után az üzemidőt is jelenítse meg
//    egy tizedes pontossággal (pl. ..., 3,5 óra üzemidő)!
//    A korábban már megismert java.text.DecimalFormat osztályt importálva.


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.0");
        return super.toString() + ", "+ df.format(üzemidő) + " óra üzemidő";
    }

    //* 15.4.4. Módosítsuk a Számítógép osztály korszerű() metódusát úgy, hogy az
    // alábbi feltételek teljesülése esetén a Notebook és a Pda osztály példányait is -
    // a kategóriájuknak megfelelő paraméterekhez viszonyítva - minősíteni tudjuk!
    // Jelenítsük meg a képernyőn a már létező nb1, nb2 és p1 példányok minősítését!
    //
    //Korszerűek, ha teljesítik az alábbi paramétereket:
    //
    // 	CPU sebesség (GHz)	RAM (MB)	Háttértár (GB)	Üzemidő (óra)	Súly (g)
    //  notebook	>1	>=1024	>=120	>=3
    //  pda	>0.3	>=128	>=16	>=2.5	<150


    @Override
    public boolean korszerű() {
        return (super.getSebesség() > 1.0 && super.getRam() >= 1024
                && super.getHdd() >= 120 && üzemidő >= 3.0);
    }
}
