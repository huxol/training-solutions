package intromethods;

public class Employee {

    private String name;

    private int hiringYear;

    private int salary;

    public Employee(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public int getSalary(int amount) {
        return salary += amount;
    }


}
