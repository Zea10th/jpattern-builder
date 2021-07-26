package org.example.builder;

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

    @Override
    public String toString() {
        return "Name: \t" + this.name +
                "\nSurname: \t" + this.surname +
                "\nAge: \t" + this.age +
                "\nAddress: \t" + this.address;
    }

    @Override
    public int hashCode() {
        return (this.name +
                this.surname +
                this.age +
                this.address).hashCode();
    }
}