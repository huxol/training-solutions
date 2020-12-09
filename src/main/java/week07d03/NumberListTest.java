package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class NumberListTest {

    @Test
    public void isIncreasingTest() {
        NumberList nl = new NumberList();

        assertTrue(nl.isIncreasing(Arrays.asList(1,2,4,5)));
        assertTrue(nl.isIncreasing(Arrays.asList(-100,1,1,1,2,4,5)));
        assertTrue(nl.isIncreasing(Arrays.asList(1,1,1,1,1,1)));
        assertFalse(nl.isIncreasing(Arrays.asList(-1,1,3,4,3,5,6)));
    }
}
