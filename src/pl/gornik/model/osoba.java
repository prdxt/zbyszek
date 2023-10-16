package pl.gornik.model;

import java.util.Objects;

public class osoba {
    private String name;
    private String surname;
    private int age;
    private String pesel;

    public osoba(String name, String surname, int age, String pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        osoba osoba = (osoba) o;
        return age == osoba.age && Objects.equals(pesel, osoba.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, pesel);
    }

    @Override
    public String toString() {
        return "Osoba {" +
                "imie ='" + name + '\'' +
                ", nazwisko ='" + surname + '\'' +
                ", wiek =" + age +
                ", pesel ='" + pesel + '\'' +
                '}';
    }
}
