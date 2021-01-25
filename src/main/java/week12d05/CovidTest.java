package week12d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CovidTest {

    @Test
    void testWordCounter() {
        Covid covid = new Covid();
        InputStream is = CovidTest.class.getResourceAsStream("/index.html");

        int counter = covid.wordCounter("koronavírus");
        assertEquals(12,counter);
    }
}
