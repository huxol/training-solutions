package week06d02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static week06d02.Category.BAKEDGOODS;
import static week06d02.Category.DAIRY;

import java.util.Arrays;

public class ProductTest {

    @Test
    public void getProductByCategoryNameTest() {
        Store store = new Store(Arrays.asList (
                new Product("kifli", BAKEDGOODS, 25),
                new Product("zsemle", BAKEDGOODS, 20),
                new Product("tej", DAIRY, 200),
                new Product("joghurt", DAIRY, 150),
                new Product("tejföl", DAIRY, 250)
        ));

        assertEquals(2, Store.getProductByCategoryName(BAKEDGOODS));
        assertEquals(1, Store.getProductByCategoryName(DAIRY));
    }
}
