package debug;

import java.util.ArrayList;

public class CompanyMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 1996);
        Employee employee2 = new Employee("Jack Doe", 1994);
        Employee employee3 = new Employee("Jane Doe", 1998);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);


    }
}
