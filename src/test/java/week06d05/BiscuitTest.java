package week06d05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BiscuitTest {

    private Biscuit target;

    @BeforeEach
    public void setUp() {
        target = Biscuit.of(BiscuitType.PILÓTA, 30);
        System.out.println("In set up.");
    }

    @Test
    public void test0() {
        System.out.println("in test 0");
    }

    @Test
    public void test1() {
        System.out.println("in test 1");
    }
}