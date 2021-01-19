package gyakorlás.alapok;

import java.util.Scanner;

public class Ciklusok {

    /*  Kérd be n értékét és készítsd el az alábbi n soros háromszöget!
        minta:
        1
        1    2
        1    2    3
        .     .     .
        1    2    3    n  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Kérem n értékét! ");
        int n = scanner.nextInt();
        for ( int i = 1; i <= n; i++) {
            for ( int j = 1; j <= i; j++) {
                System.out.println( j + " ");
            }
            System.out.println(" ");
        }
    }


}

    /* Írjuk ki az 1-200 közötti számok közül azokat az
    5-tel oszthatóakat, amelyek nem oszthatók 25-tel!

    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++)
            if (i%5 == 0 && i%25 != 0)
                System.out.println(i + " ");
    } */




    /* Írjál programot, ami 50 db kockadobást szimulál, és
    kiírja a dobásokat egymás mellé, szóközzel elválasztva!

    public static void main(String[] args) {
        for (int i = 1; i<= 50; i++)
            System.out.println(((int) Math.random() * 6 ) + 1 + " ");
    } */



    /* Készíts programot, amely 1-től 10-ig kiírja egymás mellé,
    vesszővel elválasztva a számok négyzetét!

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            / System.out.println(i * i + " , "); /
            System.out.println((int) (Math.pow(i, 2)) + " , ");
    } */




    /* Készíts programot, amely egymás alá hússzor kiírja a "Jó napot kívánok!" szöveget!

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++)
            System.out.println(" Jó napot kívánok! ");
    } */

