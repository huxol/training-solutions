package week07d04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LabTestTest {

    @Test
    void testConstructor() {
        Lab lab = new Lab("Method overload");

        assertEquals("Method overload", lab.getTitle());
        assertEquals(null, lab.getCompletedAt());
        Assertions.assertFalse(lab.isCompleted());
    }

    @Test
    void TestConstructorWithParameter() {
        Lab lab = new Lab("Method ", LocalDate.of(2020, 11,11));

        assertEquals(LocalDate.of(2020, 11,11), lab.getCompletedAt());
        assertTrue(lab.isCompleted());
        assertEquals("Method ", lab.getTitle());
    }

    @Test
    void testComplete() {
        Lab lab = new Lab("Method");
        lab.complete();

        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.now(), lab.getCompletedAt());
    }
}
