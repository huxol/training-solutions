package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {

    @Test
    public void testNumberOfDay() {
        assertEquals(31, new DayInMonth().numberOfDays(2017, "Május"));
        assertEquals(31, new DayInMonth().numberOfDays(2017, "Június"));
        assertEquals(31, new DayInMonth().numberOfDays(2017, "Február"));
        assertEquals(31, new DayInMonth().numberOfDays(2000, "Február"));
    }

    @Test
    public void testCase() {
        assertEquals(31, new DayInMonth().numberOfDays(2017, "MáJuS"));
    }
}
