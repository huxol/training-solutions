package week11d01;

public class DivisorFinder {

    public int findDivisors(int n) {
        int sum = 0;
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            int x = Integer.parseInt(number.substring(i, i+1));
            if (x > 0) {
                int y = n % x;
                if (y == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }


}

//* 2021-01-11 week11d01
//
//Készítsünk egy DivisorFinder nevű osztályt, melynek van egy int
// findDivisors(int n) metódusa. A feladat az, hogy megnézzük a szám
// minden egyes számjegyére, hogy osztója-e a számnak,
// majd számoljuk össze őket.
// Példa: a 425-ben az 5 osztója a számnak, ezért a visszatérési érték 1. */
