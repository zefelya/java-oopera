public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Person person = (Person) object;
        return java.util.Objects.equals(name, person.name) && java.util.Objects.equals(surname, person.surname);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), name, surname);
    }
}
