package week11d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFilterTest {

    @Test
    public void wordFilterTest() {
        WordFilter wf = new WordFilter();
        List<String> result = wf.wordsWithChar(Arrays.asList("alma", "körte", "barack"), 'a');
        assertEquals(Arrays.asList("alma", "barack"), result);
    }

    @Test
    public void wordFilterTestEmptyResult() {
        WordFilter wf = new WordFilter();
        List<String> result = wf.wordsWithChar(Arrays.asList("alma", "körte", "barack"), 'z');
        assertEquals(0, result.size());
    }


}
