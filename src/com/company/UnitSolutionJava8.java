package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitSolutionJava8   {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Shubhamay", "Das", 32),
                new Person("Anusua", "Abc", 30),
                new Person("Anirban", "Efg", 35),
                new Person("Atul", "ADc", 36),
                new Person("Puchka", "Cdf", 30)
        );
        List<Person> sortedPeople = new ArrayList<>();
        sortedPeople.add(people.get(0));

        //Step1 Sort the list by last name
       Collections.sort(people, (Person p1, Person p2) ->  p1.getLastName().compareTo(p2.getLastName()));

        //Create a method that prints all the element in the list
        printConditionally(people, (Person p) -> true, p -> System.out.println(p));

        //Create a method that prints all people last name start with C
        printConditionally(people, (Person p) -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        //Create a method that prints all people last name start with C and only first name
        printConditionally(people, (Person p) -> p.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));
    }

    private static void printConditionally(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p: personList) {
            if(predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}

