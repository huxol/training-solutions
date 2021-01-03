package gyakorlás.számítógép;

import java.util.Objects;

public class Számítógép implements Comparable<Számítógép> {

    private String processzor;
    private double sebesség;
    private int ram;
    private int hdd;

//* Definiáljunk egy olyan konstruktort az osztályhoz,
// amellyel az adattagoknak kezdőérték adható!


    public Számítógép(String processzor, double sebesség, int ram, int hdd) {
        this.processzor = processzor;
        this.sebesség = sebesség;
        this.ram = ram;
        this.hdd = hdd;
    }

//* Írjuk meg az adattagok lekérdező és beállító metódusait!


    public String getProcesszor() {
        return processzor;
    }

    public double getSebesség() {
        return sebesség;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setProcesszor(String processzor) {
        this.processzor = processzor;
    }

    public void setSebesség(double sebesség) {
        this.sebesség = sebesség;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

//* 3. feladat: Definiáljuk felül az osztályunk toString() metódusát úgy, hogy
//    az adattagjait soronként és a következő formátumban adja vissza:
//    <processzor> <sebesség> GHz CPU, <ram> MB RAM, <hdd> GB HDD
//    (pl. "AMD 2.4 GHz CPU, 1024 MB RAM, 500 GB HDD")
//
//    Az Object osztályból örökölt toString() metódus átdefiniálását szintén
//    kezdeményezhetjük a helyi menü metódus-felülíró (Override Method) menüpontjában,
//    viszont a kapott kódot a kívánalmaknak megfelelően át kell alakítani.


    @Override
    public String toString() {
        return processzor + " " + sebesség + " GHz CPU, " + ram + " MB RAM, " + hdd + " GB HDD ";
    }

//*   4. feladat: Definiáljuk felül az equals() metódust úgy, hogy két számítógép
//    akkor legyen egyenlő, ha a processzoruk neve megegyezik, és
//    a sebesség- és kapacitás-paramétereik páronként maximum 10%-kal térnek el egymástól!
//
//    Ennek a metódusnak is generáljuk a vázát, majd a Math osztály abs() metódusát
//    felhasználva - és a kódot jelentősen átírva - előállítjuk az összetett feltételt.
//    Az automatikusan generálódó hashCode() metódus átdefiniálására
//    most nincs szükség, akár törölhető is.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Számítógép sz = (Számítógép) o;
        //* return Double.compare(that.sebesség, sebesség) == 0 && ram == that.ram
        // && hdd == that.hdd && Objects.equals(processzor, that.processzor); */

        return (processzor.equals(sz.processzor) &&
                Math.abs(sebesség / sz.sebesség - 1) <= 0.1 &&
                Math.abs(ram / sz.ram - 1) <= 0.1 &&
                Math.abs(hdd / sz.hdd - 1) <= 0.1);
    }

    @Override
    public int hashCode() {
        return 0;
    }

//*    5. feladat: Egészítsük ki a Számítógép osztály definícióját úgy, hogy az objektumai
//     processzoruk sebessége alapján összehasonlíthatók legyenek! Implementáljuk a
//     Comparable interfészt is!
//
//     A  feladat megoldásához a compareTo() metódust kell felüldefiniálni, hogy
//     a megadott szempont szerint tudjuk az osztálypéldányokat összehasonlítani.
//     A Comparable interfész implementálását az osztály fejében jelezni kell.
//     Definíciója csak egyetlenegy metódust tartalmaz.


    public int compareTo(Számítógép sz) {
        return (int)(this.sebesség - sz.sebesség);
    }

    public interface Comparable<T> {
        public int compareTo(T o);
    }


//*     15.4.1. Egészítsük ki a Számítógép osztályt egy olyan metódussal, amely a következő
//      feltételek alapján eldönti egy objektumról, hogy korszerű-e! Korszerű, ha a processzor
//      sebessége minimum 1.6 GHz-es, a memória legalább 2048 MB-os, valamint a merevlemez
//      nagyobb, mint 160 GB. Ezek a számítógépek korszerűek?
//
//      Számítógép szg3: AMD, 2.8 GHz, 3072 MB, 500 GB
//      Számítógép szg4: Intel, 2.6 GHz, 1024 MB, 320 GB

    public boolean korszerű() {
        return (sebesség >= 1.6 && ram >= 2048 && hdd > 160);
    }


}
