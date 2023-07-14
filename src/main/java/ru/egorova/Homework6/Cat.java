package ru.egorova.Homework6;

import java.util.Objects;

public class Cat {
    String name;
    String  breed;

    public Cat (){

    }
    public Cat(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return name + "  " + breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,breed);
    }
}