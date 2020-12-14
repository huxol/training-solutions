package week08d01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RobotTest {

    @Test
    public void testMoveRobot() {
        Robot robot = new Robot();
        robot.move("FFLLLLLBBBBJJJJJJJ");
        assertEquals(3,robot.getPosition().getX());
        assertEquals(-3,robot.getPositions().getY());

    }

    @Test
    public void testWrongMove() {
        Robot robot = new Robot();
        assertThrows(IllegalArgumentException.class, ()->robot.move("FFLLDLLBBBBJJJJJJJ"))
    }
}
