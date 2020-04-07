package com.company.javabrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> peoples = Arrays.asList(
                new Person("Shubhamay", "Das", 32),
                new Person("Anusua", "Abc", 30),
                new Person("Anirban", "Efg", 35),
                new Person("Atul", "ADc", 36),
                new Person("Puchka", "cdf", 30)
        );
        List<Person> sortedPeople = new ArrayList<>();

        System.out.println("Normal Loop");
        for(int i=0; i< peoples.size(); i++){
            System.out.println(peoples.get(i));
        }

        System.out.println("For Each");
        for(Person p : peoples) {
            System.out.println(p );
        }

        //Java 8 internal iterator , less space
        System.out.println("For internal Each");
        peoples.forEach(System.out::println);

    }
}
