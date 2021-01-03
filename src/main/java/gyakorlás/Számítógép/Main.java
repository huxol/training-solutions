package gyakorlás.számítógép;

//*     9. feladat: Készítsünk egy main nevű osztályt, amely a főprogramot tartalmazza.
//      Hozzunk létre két-két Számítógép típusú objektumot az alábbi adatokkal, majd
//      írassuk ki őket a képernyőre!
//
//      Számítógép szg1: AMD, 3.2 GHz, 4096 MB, 400 GB
//      Számítógép szg2: Intel, 2.6 GHz, 2048 MB, 500 GB

public class Main {

    public static void main(String[] args) {

        Számítógép szg1 = new Számítógép(" AMD ", 3.2, 4096, 400);
        Számítógép szg2 = new Számítógép(" Intel ", 2.6, 2048, 500);

        System.out.println(szg1);
        System.out.println(szg2);

//*     10. feladat: Hozzunk létre két Notebook objektumot is! Az első minden adattagját
//      paraméterként kapja, a második viszont 2048 MB-os memóriával jöjjön létre. Adatok:
//      Notebook nb1: AMD Turion X2, 1.8 GHz, 3072 MB, 250 GB, 3.55 óra
//      Notebook nb2: Intel Atom, 1.6 GHz, 120 GB, 2.2 óra

        Notebook nb1 = new Notebook(" AMD Turion X2 ", 1.8, 3072, 250, 3.55);
        Notebook nb2 = new Notebook(" Intel Atom ", 1.6, 2048, 120, 2.2);

        System.out.println(nb1);
        System.out.println(nb2);

        Számítógép szg3 = new Számítógép(" AMD ", 2.8, 2072, 500);
        Számítógép szg4 = new Számítógép(" Intel ", 2.6, 1024, 320);

        System.out.println("A szg3" + (szg3.korszerű()?" ":" nem") + " korszerű.");
        System.out.println("A szg4" + (szg4.korszerű()?" ":" nem") + " korszerű.");

        Pda p1 = new Pda("Samsung", 0.4, 512, 64, 3, 125);
        System.out.println(p1);

        System.out.println("A nb1" + (nb1.korszerű()?"":" nem") + " korszerű.");
        System.out.println("A nb2" + (nb2.korszerű()?"":" nem") + " korszerű.");

        System.out.println("A p1" + (p1.korszerű()?"":" nem") + " korszerű.");
    }
}
