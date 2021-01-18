package gyakorlás.alapok;

import java.util.Scanner;

public class ElágazóUtasítások {

    /* Készíts programot, ami bekéri egy bankbetét összegét, valamint azt,
    hogy hány hónapig lesz lekötve az összeg. Majd megjeleníti, hogy mennyi lesz
    a betét összege a lekötés végén, ha a kamat évi 12%! */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a bankbetét összegét!");
        int bankbetét = scanner.nextInt();
        System.out.println("Hány hónapra lesz lekötve a fenti összeg?");
        int hónap = scanner.nextInt();
        double összeg = bankbetét * Math.pow(1 + (double) 1 / 100, hónap);
        System.out.println("A kamattal növelt összeg a futamidő végén: " + összeg);
    }
}


    /* Készíts programot, ami egy számformátumban megadott érdemjegyet szövegesen jelenít meg!
    Az érdemjegyet a billentyűzeten kell bevinni! (pl. 1 = elégtelen; 2 = elégséges; stb.)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Kérem az érdemjegyet (1-5)! ");
        int érdemjegy = scanner.nextInt();

        switch (érdemjegy) {
            case 1 : System.out.println("elégtelen"); break;
            case 2 : System.out.println("elégséges"); break;
            case 3 : System.out.println("közepes"); break;
            case 4 : System.out.println("jó"); break;
            case 5 : System.out.println("jeles"); break;
            default:
                System.out.println("Nincs ilyen éedemjegy!");
        }
    } */




    /* Készíts programot, ami generál két véletlen egész számot [0;100] intervallumban.
    A nagyobbik számból vonja ki a kisebbet, és írja ki a végeredményt.

    public static void main(String[] args) {

        int szám1 = (int) ((Math.random() * 101));
        int szám2 = (int) ((Math.random() * 101));

        System.out.println("Az első szám: " + szám1);
        System.out.println("A második szám: " + szám2);

        if ( szám1 > szám2 )
            System.out.println("A két szám különbsége: " + (szám1 - szám2));
        else
            System.out.println("A két szám különbsége: " + (szám2 - szám1));
    } */



    /* Készíts programot, amely bekér két számot és kiírja, hogy
    melyik a nagyobb illetve ha egyenlők, akkor azt.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számot!");
        int szám1 = scanner.nextInt();
        System.out.println("Kérem a második számot!");
        int szám2 = scanner.nextInt();
        if (szám1 > szám2)
            System.out.println("A megadott számok közül az első a nagyobb!");
        if (szám1 < szám2)
            System.out.println("A megadott számok közül a második a nagyobb!");
        if (szám1 == szám2)
            System.out.println("A két szám egyenlő!");
    } */



    /* Készíts programot, amely bekér egy számot, majd kiírja, hogy osztható-e 2-vel vagy 3-mal! */

    /* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot!");
        int szám = scanner.nextInt();
        if (szám%2 == 0)
            System.out.println("A megadott szám osztható kettővel.");
        if (szám%3 == 0)
            System.out.println("A megadott szám osztható hárommal.");
    } */

