package gyakorlás;

import java.util.Scanner;

public class Számok {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Kérem az első számot!");
        int a = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Kérem a második számot!");
        int b = scanner2.nextInt();

        if (a==b) System.out.println("A két szám egyenlő!");
        if (a > b) System.out.println("Az első szám a nagyobb!");
        if (a < b) System.out.println("Az második szám a nagyobb!");
    }
}

//* Készíts programot, amely bekér két számot és kiírja,
// hogy melyik a nagyobb illetve ha egyenlők, akkor azt.
