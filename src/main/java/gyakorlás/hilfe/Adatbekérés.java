package gyakorlás.hilfe;

import java.util.Scanner;

public class Adatbekérés {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot!");
        int szám = scanner.nextInt();

        // sc.close();

        System.out.println("A megadott szám kétszerese: " + szám * 2);
    }
    // 1. String s = sc.nextLine();
    // 2. float f = sc.nextFloat();
    // 3. double d = sc.nextDouble();
    // 4. byte b = sc.nextByte();
    // 5. long l = sc.nextLong();
}
