package gyakorlás.alapok;

public class Adattípusok {

    /* Készíts programot, ami ha megadunk két nem negatív számot sztring formátumban,
    akkor a kisebbik négyzetgyökét kiírja a képernyőre.
     */

    public static void main(String[] args) {
        String szám1 = "229";
        String szám2 = "49";

        double x = Double.valueOf(szám1);
        double y = Double.valueOf(szám2);
        double kisebb = Math.min(x, y);
        System.out.println("A kisebbik szám: " + kisebb);
        double négyzetgyök = Math.sqrt(kisebb);
        System.out.println("A kisebb szám négyzetgyöke: " + négyzetgyök);
    }
}

    /* Készíts programot, amely 10-től 20-ig generál két véletlen egész számot!
    Majd kiírja a két szám összegét, valamint szorzatát.
     */

    /* public static void main(String[] args) {

        int szám1 = (int) ((Math.random() * 10) + 11);
        int szám2 = (int) ((Math.random() * 10) + 11);

        System.out.println(" Az első véletlen szám: " + szám1);
        System.out.println(" A második véletlen szám: " + szám2);
        System.out.println(" A két szám összege: " + (szám1 + szám2));
        System.out.println(" A két szám szorzata: " + (szám1 * szám2));
    } */



    /* Készíts programot, amely kiszámítja és kiírja az 5 egység sugarú kör kerületét és területét!*/

   /* public static void main(String[] args) {

        final double PI = 3.14;
        int r = 5;
        double ker;
        double ter;

        ker = 2*r*PI;
        ter = Math.pow(r, 2) * PI;

        System.out.println(" A kör kerülete = " + ker);
        System.out.println(" A kör területe = " + ter);
    } */

