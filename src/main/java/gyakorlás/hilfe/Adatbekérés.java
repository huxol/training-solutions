package gyakorlás.hilfe;

import java.util.Scanner;

public class Adatbekérés {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot!");
        int szám = scanner.nextInt();

        System.out.println("A megadott szám kétszerese: " + szám * 2);
    }
}
