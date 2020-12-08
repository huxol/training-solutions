package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 2014, 369000);

        System.out.println(employee);

        employee.raiseSalary(20000);

        System.out.println(employee);

        employee.setName("Jack Doe");
        System.out.println("Name: " + employee.getName());
        System.out.println("Hiring year: " + employee.getHiringYear());
        System.out.println("Salary: " + employee.getSalary());
    }
}