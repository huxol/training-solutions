package week06d04;

public class Item {

    private int price;
    private int month;
    private String name;

    public Item(int price, int month, String name) {
        this.price = price;
        this.month = month;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}


//* Készíts az week06d04 csomagban egy Budget osztályt, amely a konstruktorában Item példányokat vár
// listában (List). Az Item tartalmazza az alábbi attribútumokat: int price, int month, String name.
// A Budget osztály tárolja el egy attribútumban a konstruktorban megkapott items listát.
// Írjunk egy metódust, getItemsByMonth néven, mely egy hónapot vár (1-12) és visszaadja
// az Itemeket az adott hónapban! Bónusz feladat: ellenőrizzük a bemeneti paramétereket és
// írjunk tesztet!
