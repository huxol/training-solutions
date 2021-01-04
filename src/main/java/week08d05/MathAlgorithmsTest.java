package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathAlgorithmsTest {

    @Test
    public void greatestCommonDivisorTest() {
        MathAlgorithms ma = new MathAlgorithms();

        assertEquals(2,ma.greatestCommonDivisor(8, 6));
        assertEquals(6, ma.greatestCommonDivisor(6, 12));
    }

    @Test
    public void greatestCommonDivisorEuclideanTest() {
        MathAlgorithms ma = new MathAlgorithms();

        assertEquals(2,ma.greatestCommonDivisor(8, 6));
        assertEquals(6, ma.greatestCommonDivisor(6, 12));
    }
}
