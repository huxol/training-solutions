package gyakorlás;

//*  Hozzunk létre egy Dolgozó nevű osztályt
// a következő tulajdonságok reprezentálására:

public class Dolgozó {

    public String név;
    public int születési_év;
    public String munkakör;
    public int fizetés;
    public boolean adójóváírás;

//* Hozzunk létre az osztályunkhoz egy olyan paraméteres konstruktort, amely
// segítségével a példányosítás során minden adattagnak kezdőértéket (inicializálás) adhatunk!

    public Dolgozó (String név, int születési_év, String munkakör, int fizetés, boolean adójóváírás) {
        this.név = név;
        this.születési_év = születési_év;
        this.munkakör = munkakör;
        this.fizetés = fizetés;
        this.adójóváírás = adójóváírás;
    }

//*  Példányosítsuk az előző osztályunkat! Hozzuk létre az alábbi objektumokat,
// majd a megadott kódrészletet beszúrva írassuk ki őket a képernyőre!
//
//Kovács Péter, 1966, igazgató, 500000, nem
//
//Nagy Árpád, 1954, portás, 100000, igen
//
//Kiss P. Eszter, 1980, főelőadó, 250000, nem

    @Override
    public String toString() {
        return "Dolgozó{" +
                "név='" + név + '\'' +
                ", születési_év=" + születési_év +
                ", munkakör='" + munkakör + '\'' +
                ", fizetés=" + fizetés +
                ", adójóváírás=" + adójóváírás +
                '}';
    }

    public static void main(String[] args) {
        Dolgozó d1 = new Dolgozó("Kovács Péter", 1966, "igazgató", 500_000, false);
        Dolgozó d2 = new Dolgozó("Nagy Árpád", 1954, "portás", 100_000, true);
        Dolgozó d3 = new Dolgozó("Kiss P. Eszter", 1980, "főelőadó", 250_000, false);


        System.out.println(d1);
        System.out.println();
        System.out.println(d2);
        System.out.println();
        System.out.println(d3);
        System.out.println();

        Dolgozó d4 = new Dolgozó("Soós Elemér", 1990, "gyakornok", 73_500, true);
        System.out.println(d4);
    }
}
