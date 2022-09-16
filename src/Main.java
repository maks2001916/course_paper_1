public class Main {
    public static void main(String[] args) {

        Employee ivan = new Employee(new Personality("Ivan", "Ivanov", "Ivanovich"), "1", 57825);
        Employee sergei = new Employee(new Personality("Sergei", "Sergeev", "Sergeevich"), "2", 74625);
        Employee dmitrii = new Employee(new Personality("Dmitrii", "Dmitriev", "Dmitrievich"), "3", 63817);
        Employee nikolai = new Employee(new Personality("Nikolai", "Nikolaev", "nikolaevich"), "4", 72381);
        Employee petr = new Employee(new Personality("Petr", "Petrov", "Petrovich"), "5", 62837);
        employees[0] = ivan;
        employees[1] = sergei;
        employees[2] = dmitrii;
        employees[3] = nikolai;
        employees[4] = petr;
        list();
        sumSalary();
        minSalary();
        maxSalary();
        averageSalary();
        fio();
    }

    private static Employee[] employees = new Employee[5];


    public static void list() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static void sumSalary() {
        int x = 0;
        for (int i = 0; i < employees.length; i++) {
            x += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплату - " + x);
    }
    public static void minSalary() {
        int x = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < x) {
                x = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата - " + x);
    }
    public static void maxSalary() {
        int x = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > x) {
                x = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата - " + x);
    }
    public static void averageSalary() {
        double x = 0;
        double y = employees.length;
        for (int i = 0; i < y; i++) {
            x += employees[i].getSalary();
        }
        System.out.println("Средняя зарплата - " + x / y);
    }
    public static void fio() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFio());
        }
    }

}