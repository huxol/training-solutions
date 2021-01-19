package gyakorlás.alapok;

import java.util.Scanner;

public class TömbSzám {

    /* Készíts programot, amely bekér a billentyűzetről 5 db számot
    és elhelyezi egy megfelelő tömbben! A program írja is ki a tömb
    tartalmát a képernyőre, valamint jelenjen meg külön a legkisebb szám is.  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] számok = new int [5];
        for (int i=0; i<=4; i++) {
            System.out.println(" Kérewm a(z) " + (i+1) + ". számot! ");
            int a = scanner.nextInt();
            számok[i] = a;
        }
        System.out.println(" Kiírás: ");
        for (int i=0; i<=4; i++)
            System.out.println(számok[i]);

        int legkisebb = számok[0];
        for (int i=1; i<=4; i++)
            if(számok[i]<legkisebb) legkisebb=számok[i];
        System.out.println(" A legkisebb szám: " + legkisebb);
    }
}
