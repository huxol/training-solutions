package gyakorlás;

import java.util.Scanner;

public class SzámbólSzöveg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Kérem az érdemjegyet (1-5)! ");
        int jegy = scanner.nextInt();
        switch (jegy) {
            case 1:
                System.out.println(" Elégtelen "); break;
            case 2:
                System.out.println(" Elégséges "); break;
            case 3:
                System.out.println(" Közepes "); break;
            case 4:
                System.out.println(" Jó "); break;
            case 5:
                System.out.println(" Jeles "); break;
            default:
                System.out.println(" Nincs ilyen osztályzat! ");
        }
    }
}

//*  Készíts programot, ami egy számformátumban megadott érdemjegyet szövegesen jelenít meg!
// Az érdemjegyet a billentyűzeten kell bevinni! (pl. 1 = elégtelen; 2 = elégséges; stb.)
