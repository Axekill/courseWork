package coursework;

public class Employee {
    private static int counted;
    private final int id;
    private final String FIO;
    private int department;
    private int salary;

    public Employee(String FIO, int department, int salary) {
        id = ++counted;
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFIO() {
        return this.FIO;
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
        return "id: " + id +
                ", Ф.И.О.:" + FIO +
                ", Отдел: " + department +
                ", Зарплата: " + salary;
    }
}