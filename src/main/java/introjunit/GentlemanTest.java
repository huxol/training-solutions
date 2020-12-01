package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    public void byNormalName() {
        String name = "John Doe";

        String greeting = new Gentleman().sayHello(name);

        assertEquals("Hello John Doe", greeting);
    }
}
