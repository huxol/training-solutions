package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        String problem = "3 / 8 + 7 (8 - 2)";
        double result = 3.0 / 8.0 + 7.0 / (8.0 - 2.0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mennyi az eredmény? Négy tizedesjegy pontossággal add meg!");
        System.out.println(problem);

        double resultByUser = scanner.nextDouble();

        if (Math.abs(result - resultByUser) < 0.0001) {
            System.out.println("Helyes az eredmény!");
        } else {
            System.out.println("Hibás az eredmény!");
        }
    }
}