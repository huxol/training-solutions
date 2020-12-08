package debug;

public class Employee {

    private String name;
    private int YearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.YearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }
}
