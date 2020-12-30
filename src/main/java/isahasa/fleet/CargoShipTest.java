package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CargoShipTest {

    @Test
    public void load() {
        CargoShip cargoShip = new CargoShip(100);
        assertEquals(0, cargoShip.getCargoWeight());

        int remainder = cargoShip.loadCargo(56);

        assertEquals(0, remainder);
        assertEquals(56, cargoShip.getCargoWeight());
    }

    @Test
    public void loadToMuch() {
        CargoShip cargoShip = new CargoShip(100);
        assertEquals(0, cargoShip.getCargoWeight());

        int remainder = cargoShip.loadCargo(111);

        assertEquals(11, remainder);
        assertEquals(100, cargoShip.getCargoWeight());
    }
}
