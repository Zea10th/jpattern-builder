package org.example.builder;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address = "undefined";

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return !address.equals("undefined");
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return this.address;
    }

    public String setAddress(String address) {
        this.address = address;
        return this.address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0)
                .setAddress(this.address);
        return builder;
    }

    @Override
    public String toString() {
        return "Name: \t" + this.name +
                "\nSurname: \t" + this.surname +
                "\nAge: \t" + this.age +
                "\nAddress: \t" + this.address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}