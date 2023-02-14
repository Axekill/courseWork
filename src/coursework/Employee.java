package coursework;

public class Employee {
    Counted counted;
    String firstName;
    String middleName;
    String lastName;
    int department;
    int salary;

    public Employee( String firstName, String middleName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public Counted getCounted() {
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
        if (salary < 0) {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + counted +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}