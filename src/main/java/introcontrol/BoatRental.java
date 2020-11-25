package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {
        int csónak1Kapacitás = 5;
        int csónak2Kapacitás = 3;
        int csónak3Kapacitás = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány fős a csapat?");
        int csapatLétszám = scanner.nextInt();

        int szabadHely = 10;
        int szabadHajó = 3;

        if (csapatLétszám > 3) {
            System.out.println("Öt személyes csónak");
            csapatLétszám = csapatLétszám - 5;
            szabadHajó--;
            szabadHely = szabadHely - 5;
        }

        if (csapatLétszám > 2) {
            System.out.println("Három személyes csónak");
            csapatLétszám = csapatLétszám - 3;
            szabadHajó--;
            szabadHely = szabadHely - 3;
        }
        if (csapatLétszám > 0) {
            System.out.println("Két személyes csónak");
            csapatLétszám = csapatLétszám - 2;
            szabadHajó--;
            szabadHely = szabadHely - 2;
        }
        if (csapatLétszám > 0) {
            System.out.println("Sajnos, nincs több szabad hely!");
        } else {
            System.out.println("Üres helyek száma: " + szabadHely);
            System.out.println("Üres csónakok száma: " + szabadHajó);
        }
    }
}
