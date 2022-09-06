public class Main {
    public static void main(String[] args) {

        Employee ivan = new Employee(new Personality("Ivan", "Ivanov", "Ivanovich"), "1", "57825");
        Employee sergei = new Employee(new Personality("Sergei", "Sergeev", "Sergeevich"), "2", " 74625");

        System.out.println(ivan);
        System.out.println(sergei);

    }
}