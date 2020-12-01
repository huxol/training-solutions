package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void testLeapYear() {
        assertEquals(29, new DayInMonth().numberOfDays(2012, "Február"));
    }

    @Test
    public void testLeapYea100() {
        assertEquals(29, new DayInMonth().numberOfDays(1900, "Február"));
    }

    @Test
    public void testLeapYear400() {
        assertEquals(29, new DayInMonth().numberOfDays(2000, "Február"));
    }

    @Test
    public void testIllegalMonth() {
        assertThrows(IllegalArgumentException.class, () -> new DayInMonth().numberOfDays(2012, "abc"));
    }
}