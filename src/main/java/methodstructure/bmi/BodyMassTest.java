package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BodyMassTest {

    private static final double SAMPLE_MASS = 70;
    private static final double SAMPLE_HEIGHT = 1.7;
    private static final double SAMPLE_MASS_UNDER = 60;
    private static final double SAMPLE_HEIGHT_UNDER = 1.9;
    private static final double SAMPLE_MASS_OVER = 90;
    private static final double SAMPLE_HEIGHT_OVER = 1.6;

    @Test
    public void constructorShouldInitialize() {
        BodyMass bm = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);

        assertEquals(SAMPLE_MASS, bm.getWeight());
        assertEquals(SAMPLE_HEIGHT, bm.getHeight());
    }

    @Test
    public void body() {
        BodyMass bm = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);
        BodyMass bmUnder = new BodyMass(SAMPLE_MASS_UNDER, SAMPLE_HEIGHT_UNDER);

        assertFalse(bm.isThinnerThan(bmUnder));
        assertTrue(bmUnder.isThinnerThan(bm));
        assertFalse(bm.isThinnerThan(bm));
    }
}
