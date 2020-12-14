package methodstructure;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PendrivesTest {

    private static final List<Pendrive> PENDRIVES_LIST = Arrays.asList(
            new Pendrive("p1", 64, 3500),
            new Pendrive("p2", 32, 2000),
            new Pendrive("p3", 64, 3000),
            new Pendrive("p4", 32, 2500)
    );

    @Test
    public void best() {
        Pendrives pendrives = new Pendrives();

        assertEquals(PENDRIVES_LIST.get(2), pendrives.best(PENDRIVES_LIST));
    }

    @Test
    public void cheapest() {
        Pendrives pendrives = new Pendrives();

        assertEquals(PENDRIVES_LIST.get(1), pendrives.cheapest(PENDRIVES_LIST));
    }

    @Test
    public void risePriceWhereCapacity() {
        Pendrives pendrives = new Pendrives();

        int[] expected = {3500, 2200, 3000, 2750};
        pendrives.risePriceWhereCapacity(PENDRIVES_LIST, 10, 32);
        for (int j = 0; j < PENDRIVES_LIST.size(); j++) {
            assertEquals(expected[j], PENDRIVES_LIST.get(j).getPrice());
        }
    }
}
