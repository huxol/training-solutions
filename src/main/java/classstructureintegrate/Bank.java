package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi az új számla száma?");
        String accountNumber = scanner.nextLine();

        System.out.println("Ki a tulajdonosa?");
        String owner = scanner.nextLine();

        System.out.println("Mekkora összeggel nyitja?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber, owner, amount);

        System.out.println("Mi az új számla száma?");
        String accountNumber2 = scanner.nextLine();



    }
}
