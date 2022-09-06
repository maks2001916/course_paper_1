public class Personality {
    private String name;
    private String surname;
    private String patronymic;

     Personality(String name, String surname, String patronymic) {
        this.name = name;
        this.surname =surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "Имя - " + name + '\n' +
                "Фамилия - " + surname + '\n' +
                "Отчество - " + patronymic;
    }
}
