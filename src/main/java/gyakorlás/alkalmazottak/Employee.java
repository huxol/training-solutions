package gyakorlás.alkalmazottak;

public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    public Employee (String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Jane Doe", 33, " ", 1000);

        System.out.println("Name" + emp1.name);
        System.out.println("Age:" + emp1.age );
        System.out.println("Designation:" + emp1.designation );
        System.out.println("Salary:" + emp1.salary);
    }
}
