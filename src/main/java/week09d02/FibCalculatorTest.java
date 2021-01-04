package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibCalculatorTest {

    @Test
    public void fibCalculatorTest() {
        FibCalculator fc = new FibCalculator();

        assertEquals(55,new FibCalculator().sumEvens(100));
    }
}
