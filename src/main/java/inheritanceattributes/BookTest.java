package inheritanceattributes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void constructorTest() {
        Book book = new Book("Gyűrűk ura", 3000);
        assertEquals("Gyűrűk ura",book.getTitle());
        assertEquals(3000,book.price);
    }

    @Test
    public void testPurchase() {
        Book book = new Book("Gyűrűk ura", 3000);
        assertEquals(6000,book.purchase(2));
    }
}
