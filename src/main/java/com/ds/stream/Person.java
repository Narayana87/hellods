package com.ds.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 21));
        persons.add(new Person("Charlie", 30));
        persons.add(new Person("David", 22));
        persons.add(new Person("Eve", 35));




        //Filter based on Age
        List<Person> filterdAnsSorted = persons.stream().filter(person -> person.getAge() > 20).toList();
        //filterdAnsSorted.forEach(System.out::println);

        //Sorted based on Name
        List<Person> sortbasedOnName = persons.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).toList();
        //sortbasedOnName.forEach(System.out::println);

        List<Person> sortedAndFiltered = persons.stream().filter(p -> p.getAge() > 20).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).toList();
        sortedAndFiltered.forEach(System.out::println);

        List<Person> sorted = persons.stream()
                .sorted(Comparator.comparingInt(Person::getAge)) // Sort based on age
                .toList();
       // sorted.forEach(System.out::println);
    }
}

