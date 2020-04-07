package com.company.javabrains;

import java.util.Arrays;
import java.util.List;

public class StreamsExamples {

    public static void main(String[] args) {

        //Streams
        //A sequence of elements supporting sequential and parallel aggregate operations

        List<Person> people = Arrays.asList(
                new Person("Shubhamay", "Das", 32),
                new Person("Anusua", "Abc", 30),
                new Person("Anirban", "Efg", 35),
                new Person("Atul", "ADc", 36),
                new Person("Atul", "ADc", 36),
                new Person("Atul", "ADc", 36),
                new Person("Puchka", "cdf", 30)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("A"))
                .limit(4)
                .forEach(p -> System.out.println(p.getFirstName()));

        people.parallelStream()
                .filter(p -> p.getLastName().startsWith("A"))
                .forEach(p -> System.out.println(p.getFirstName()));

        people.stream();
    }
}
