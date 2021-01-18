package gyakorlás.alapok;

public class Adattípusok2 {

    /* Adj meg egy valós számot. A számot úgy jelenítsd meg,
    hogy a tizedespont helyén egy tizedesvessző jelenjen meg! */

    public static void main(String[] args) {
        double szám = 621.48;
        String st = Double.toString(szám);
        System.out.println("A szám erdeti formája: " + szám);
        System.out.println("A szám átalakított formátuma: " + st.replace('.', ','));
    }
}

    /*  Készíts programot, amely két adott sztringet megjelenít, az egyiket kisbetűs,
    a másikat nagybetűs formában! A második sztringben található összes 'e' karaktert
    kicseréli az első sztring második karakterével.
     */

    /* public static void main(String[] args) {
        String s1 = "Ma a MALÉV-vel repülök.";
        String s2 = "Holnap lehet, hogy esik az eső.";
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.replace('e', s1.charAt(1)));
    } */


    /* Készíts programot, amely az "Indul a görög aludni"
    sztring tartalmát megfordítja és kiírja! */

    /* public static void main(String[] args) {

        StringBuffer szöveg = new StringBuffer("Indul a görög aludni");
        System.out.println(szöveg.reverse());
    } */

