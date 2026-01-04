import java.util.Objects;

import static java.util.Objects.hash;

public class Person {

    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Person person = (Person) object;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    public int hashCode() {
        return hash(super.hashCode(), name, surname);
    }
}
