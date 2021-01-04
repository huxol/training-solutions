package week09d02;

public class FibCalculator {

    private static int[] FIB_NUMS = new int [1000];

    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    static long sumEvens(int bound) {
        int sum = 0;
        int fibN = 0;
        while (fib(fibN) < bound) {
            if (FIB_NUMS[fibN] % 2 == 0) {
                sum += FIB_NUMS[fibN];
            }
            fibN++;
        }
        return sum;
    }

    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

//* A week09d02 csomagban készíts egy osztályt FibCalculator néven.
// Ennek legyen egy metódusa long sumEvens(int bound) néven.
// Ennek a metódusnak a feladata az, hogy összeadja a páros fibonacci számokat
// addig, amig a következő fibonacci szám nem nagyobb, mint bound,
// majd visszadja a végredményt. */
