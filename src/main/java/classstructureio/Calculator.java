package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Írj be egy egész számot: ");
        int number1 = scanner.nextInt();
        System.out.println("Írd be a második számot: ");
        int number2 = scanner.nextInt();

        System.out.println(number1 + " + " + number2);
        System.out.println(number1 + number2);
    }
}