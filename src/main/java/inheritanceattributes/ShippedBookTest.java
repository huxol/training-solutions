package inheritanceattributes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippedBookTest {

    @Test
    public void constructorAndToStringTest() {
        ShippedBook book = new ShippedBook("Gyűrűk ura", 3000, 1200);
        assertEquals("Gyűrűk ura:3000 - 1200",book.toString());
    }

    @Test
    public void orderTest() {
        ShippedBook book = new ShippedBook("Gyűrűk ura", 3000, 1200);
        assertEquals(7200,book.order(2));
    }
}
