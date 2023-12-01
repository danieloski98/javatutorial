package org.example;

public class Person {
    int id;
    String name;

    Float marks;

    Person() {}

    Person(int i, String name) {
        this.id = i;
        this.name = name;
    }

    Person (Float marks) {
        this.marks = marks;
    }

    void displayAge() {
        System.out.println("My age is 20");
    }

    String displayAge(int age) {
        return "My age is " + age;
    }
}
