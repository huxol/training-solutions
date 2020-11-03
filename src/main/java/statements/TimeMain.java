package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. időpont óra:");
        int hours1 = scanner.nextInt();
        System.out.println("1. időpont perc:");
        int minutes1 = scanner.nextInt();
        System.out.println("1. időpont másodperc:");
        int second1 = scanner.nextInt();

        System.out.println("2. időpont óra:");
        int hours2 = scanner.nextInt();
        System.out.println("2. időpont perc:");
        int minutes2 = scanner.nextInt();
        System.out.println("2. időpont másodperc:");
        int second2 = scanner.nextInt();

        Time time1 = new Time(hours1, minutes1, second1);
        Time time2 = new Time(hours2, minutes2, second2);

        System.out.println("Az első időpont " + time1.toString() + "=" + time1.getInMinutes() + " perc ");
        System.out.println("Az második időpont " + time2.toString() + "=" + time2.getInSeconds() + " másodperc ");
        System.out.println(" Az első korábbi, mint a második: " + time1.earlierThan(time2));
    }
}
