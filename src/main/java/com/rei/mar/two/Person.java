package com.rei.mar.two;

import java.util.Objects;

/**
 * Created by jdann on 7/21/16.
 */
public class Person {

    private final String name;
    private final int age;

    public static void main(String[] args) {
        Person person = new Person("cool guy", 4);
        System.out.println(person.getName());
    }

    public Person(String name, int age){

        Objects.requireNonNull(name, "name cannot be null!");

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o){

        //check if not null and is of this class
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }

        //cast object to a person
        Person person = (Person) o;

        //evaluate if name and age is the same
        return this.age == person.age && this.name.equals(person.name);
    }

    @Override
    public int hashCode(){

        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
