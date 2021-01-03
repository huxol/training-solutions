package gyakorlás;

import java.util.Scanner;

public class BankiKamat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Kérem a betét összegét! ");
        int betét = scanner.nextInt();
        System.out.println(" Hány hónapra kötik le? ");
        int hónap = scanner.nextInt();
        double összeg = betét * Math.pow(1 + (double) 1/100, hónap);
        System.out.println(" A kamattal növelt összeg a futamidő végén: " + összeg);
    }
}

//* Készíts programot, ami bekéri egy bankbetét összegét, valamint azt,
// hogy hány hónapig lesz lekötve az összeg.
// Majd megjeleníti, hogy mennyi lesz a betét összege a lekötés végén, ha a kamat évi 12%!
