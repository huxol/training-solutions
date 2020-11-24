package introdate;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(2000, 1, 11, "John Doe");
        System.out.println(employee.getName());
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
    }
}
