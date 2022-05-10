import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return true;
    }

    public boolean hasAddress() {
        return !(address == null);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age = age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder(surname, 0, address);
    }

    @Override
    public String toString() {
        return String.format("Имя: " + this.name +
                "%n Фамилия: " + this.surname +
                "%n Возраст: " + this.age +
                "%n Город проживания: " + this.address);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

}




