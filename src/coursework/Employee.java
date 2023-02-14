package coursework;

public class Employee {
    private static int counted;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private int salary;

    public Employee(String firstName, String middleName, String lastName, int department, int salary) {
        counted++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public int getCounted() {
        return counted;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        if (department > 0 && department <= 5) {
            this.department = department;
        }
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "id: " + counted +
                ", Ф.И.О.:" + lastName + " " + firstName + " " + middleName +
                ", Отдел: " + department +
                ", Зарплата: " + salary ;
    }
}