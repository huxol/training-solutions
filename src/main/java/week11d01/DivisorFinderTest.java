package week11d01;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisorFinderTest {

    @Test
    public void divisorFinder() {
        DivisorFinder d = new DivisorFinder();
        assertEquals(1, d.findDivisors(425));
        assertEquals(2, d.findDivisors(123));
    }
}
