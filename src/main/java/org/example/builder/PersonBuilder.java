package org.example.builder;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address;
    private Person person;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.age < 0) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
        }
        if (!address.equals("")) {
            person.setAddress(this.address);
        }
        return person;
    }
}
