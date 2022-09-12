import java.util.Objects;

public class Employee {
    private Personality fio;
    private String department;
    private int salary;
    private static int count = 0;
    private int id;
    public Employee(Personality fio, String department, int salary) {
        count++;
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = count;
    }

    public int getId() {
        return id;
    }

    public Personality getFio() {
        return this.fio;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fio, employee.fio) && Objects.equals(department, employee.department) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, department, salary);
    }

    @Override
    public String toString() {
        return "Ф.И.О.:" + "\n"
                + fio + "\n" +
                "Отдел - " + department + "\n" +
                "Зарплата - " + salary + "\n" +
                "ID - " + id;
    }
}
