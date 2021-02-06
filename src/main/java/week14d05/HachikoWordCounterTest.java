package week14d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachikoWordCounterTest {

    @Test
    void countWords() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("hachiko.srt"),
                Charset.forName("windows-1250"))) {
            System.out.println(new HachikoWordCounter().countWords(reader,
                    "Hach", "haza", "pályaudvar", "jó"));
        }
    }
}
