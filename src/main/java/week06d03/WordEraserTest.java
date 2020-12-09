package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void eraseWordTest() {
        WordEraser we = new WordEraser();
        String original = "alma körte barack alma szílva körte bírsalma";
        String result = "körte barack szílva körte bírsalma";
        assertEquals(result, we.eraseWord(original, "alma"));
    }
}
