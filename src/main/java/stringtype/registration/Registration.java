package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Felhasználónév:");
        String username = scanner.nextLine();

        System.out.println("Jelszó:");
        String password = scanner.nextLine();

        System.out.println("Jelszó újra:");
        String password2 = scanner.nextLine();

        System.out.println("Email cím:");
        String email = scanner.nextLine();

    }
}
