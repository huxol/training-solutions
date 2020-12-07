package stringconcat.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    public void testCreate() {
        Employee employee = new Employee("Kiss Géza", "minőségellenőr", 520000);

        assertEquals("Kiss Géza", employee.getName());
        assertEquals("minőségellenőr", employee.getJob());
        assertEquals(520000, employee.getSalary());
    }

    @Test
    public void  testCreateWithEmptyName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("", "minőségellenőr", 520000));
        assertEquals("A név mező nem lehet üres!", ex.getMessage());
    }

    @Test
    public void  testCreateWithNullJob() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Kis Géza", "", 520000));
        assertEquals("A munkakör mező nem lehet üres!", ex.getMessage());
    }

    @Test
    public void testCreateWithNegativeSalary() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Kiss Géza", "minőségellenőr", -520000));
        assertEquals("A munkabér mező értéke csak 0, vagy pozitív szám lehet!", ex.getMessage());
    }

    @Test
    public void testToString() {
        Employee employee = new Employee("Kiss Géza", "minőségellenőr", 520000);

        assertEquals("Kiss Géza - minőségellenőr - 520000Ft", employee.toString());
    }
}
