package controlselection.greetings;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    public void testGreet() {
        Greetings greetings = new Greetings();
        assertEquals("Jó éjt!", greetings.greet(4, 30));
        assertEquals("Jó éjt!", greetings.greet(5, 0));
        assertEquals("Jó reggelt", greetings.greet(5, 1));
        assertEquals("Jó reggelt!", greetings.greet(9, 0));
        assertEquals("Jó napot!", greetings.greet(9, 1));
        assertEquals("Jó napot!", greetings.greet(18, 30));
        assertEquals("Jó estét!", greetings.greet(18, 31));
        assertEquals("Jó estét!", greetings.greet(20, 0));
        assertEquals("Jó éjt!", greetings.greet(20, 1));
    }
}