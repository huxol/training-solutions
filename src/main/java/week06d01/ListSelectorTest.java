package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    ListSelector ls = new ListSelector();

    @Test
    public void getEventIndexElementsTest() {
        assertEquals("[almabarack]", ls.getEventIndexElements(Arrays.asList("alma", "körte", "barack")));
    }

    @Test
    public void getEventIndexElementsWithNull() {
        assertThrows(IllegalArgumentException.class, ()-> ls.getEventIndexElements(null));
    }

    @Test
    public  void getEventIndexElementsWithEmptyList() {
        assertEquals("", ls.getEventIndexElements(new ArrayList<>()));
    }
}
