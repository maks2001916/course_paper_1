import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee ivan = new Employee(new Personality("Ivan", "Ivanov", "Ivanovich"), "1", "57825");
        Employee sergei = new Employee(new Personality("Sergei", "Sergeev", "Sergeevich"), "2", " 74625");
        Employee dmitrii = new Employee(new Personality("Dmitrii", "Dmitriev", "Dmitrievich"), "3", "63817");
        Employee nikolai = new Employee(new Personality("Nikolai", "Nikolaev", "nikolaevich"), "4", "72381");
        Employee petr = new Employee(new Personality("Petr", "Petrov", "Petrovich"), "5", "62837");
        Employee[] storage = new Employee[5];
        storage[0] = ivan;
        storage[1] = sergei;
        storage[2] = dmitrii;
        storage[3] = nikolai;
        storage[4] = petr;
        list(storage);

    }


    public static void list(Employee[] storage) {
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }
}