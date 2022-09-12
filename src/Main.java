import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee ivan = new Employee(new Personality("Ivan", "Ivanov", "Ivanovich"), "1", 57825);
        Employee sergei = new Employee(new Personality("Sergei", "Sergeev", "Sergeevich"), "2", 74625);
        Employee dmitrii = new Employee(new Personality("Dmitrii", "Dmitriev", "Dmitrievich"), "3", 63817);
        Employee nikolai = new Employee(new Personality("Nikolai", "Nikolaev", "nikolaevich"), "4", 72381);
        Employee petr = new Employee(new Personality("Petr", "Petrov", "Petrovich"), "5", 62837);
        Employee[] storage = new Employee[5];
        storage[0] = ivan;
        storage[1] = sergei;
        storage[2] = dmitrii;
        storage[3] = nikolai;
        storage[4] = petr;
        list(storage);
        sumSalary(storage);
        minSalary(storage);
        maxSalary(storage);
        averageSalary(storage);
        fio(storage);
    }


    public static void list(Employee[] storage) {
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }

    public static void sumSalary(Employee[] storage) {
        int x = 0;
        for (int i = 0; i < storage.length; i++) {
            x += storage[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплату - " + x);
    }

    public static void minSalary(Employee[] minSalary) {
        int x = minSalary[0].getSalary();
        for (int i = 0; i < minSalary.length; i++) {
            if (minSalary[i].getSalary() < x) {
                x = minSalary[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата - " + x);
    }

    public static void maxSalary(Employee[] maxsalary) {
        int x = maxsalary[0].getSalary();
        for (int i = 0; i < maxsalary.length; i++) {
            if (maxsalary[i].getSalary() > x) {
                x = maxsalary[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата - " + x);
    }

    public static void averageSalary(Employee[] averageSalary) {
        int x = 0;
        for (int i = 0; i < averageSalary.length; i++) {
            x += averageSalary[i].getSalary();
        }
        System.out.println("Средняя зарплата - " + x / averageSalary.length);
    }

    public static void fio(Employee[] fio) {
        for (int i = 0; i < fio.length; i++) {
            System.out.println(fio[i].getFio());
        }
    }

}