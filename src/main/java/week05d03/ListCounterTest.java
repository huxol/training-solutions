package week05d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    public void StartTest() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("Alma", "Körte", "Banán", "Szilva");

        assertEquals(2, listCounter.Start(testList));
    }
}
