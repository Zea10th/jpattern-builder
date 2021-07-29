package org.example.builder;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address;
    private Person person;

    public PersonBuilder setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия не может быть пустой");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Возраст может принимать значения от 0 до 200");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        if (surname.isEmpty()) {
            throw new IllegalArgumentException("Адрес не может быть пустым");
        }
        this.address = address;
        return this;
    }

    public Person build() {
        try {
            if (this.age < 0) {
                person = new Person(name, surname);
            } else {
                person = new Person(name, surname, age);
            }
            if (!address.isEmpty() || address != null) {
                person.setAddress(this.address);
            }
        } catch (IllegalStateException e) {
            System.out.println("Недостаточно данных для создания записи");
        }
        return person;
    }
}
