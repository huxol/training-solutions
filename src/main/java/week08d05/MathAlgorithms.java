package week08d05;

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b) {

        List<Integer> divisors = getCommonDivisors(a, b);
        int max = divisors.get(0);

        for (int i = 1; i < divisors.size(); i++) {
            if (divisors.get(i) > max) {
                max = divisors.get(i);
            }
        }
        return max;
    }

    private List<Integer> getCommonDivisors(int a, int b) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <=a; i++) {
            if ( a % i == 0 && b / i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public int recursiveEuclidean(int a, int b) {
        if (b == 0) {
            return a;
        } else {
           return recursiveEuclidean(b, a/b);
        }
    }
}


//* 2020-12-18  A week08d05 csomagban készíts egy osztályt MathAlgorithms néven.
// Legyen benne egy metódus, greatestCommonDivisor(int a, int b) ,
// ami paraméterül vár két pozitív egész számot és visszaadja a legnagyobb közös osztójukat.
//
//pl 6 és 8 legnagyobb közös osztója 2. */
