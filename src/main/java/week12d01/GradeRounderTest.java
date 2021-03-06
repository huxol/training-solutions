package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeRounderTest {

    @Test
    public static void main(String[] args) {
        assertArrayEquals(new int[] {39, 40, 41, 42, 45, 45, 45, 46, 47, 50, 50, 50},
                new GradeRounder().roundGrades(new int[] {39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
    }
}
