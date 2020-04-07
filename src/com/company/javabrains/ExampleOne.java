package com.company.javabrains;

import java.util.*;

public class ExampleOne {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
          new Person("Shubhamay", "Das", 32),
          new Person("Anusua", "Abc", 30),
          new Person("Anirban", "Efg", 35),
          new Person("Atul", "ADc", 36),
          new Person("Puchka", "cdf", 30)
        );
        List<Person> sortedPeople = new ArrayList<>();
        sortedPeople.add(people.get(0));

        //Step1 Sort the list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getLastName().compareTo(t1.getLastName());
            }
        });

        //Create a method that prints all the element in the list
        for (Person p: people) {
            System.out.println(p.toString());
        }

        //Create a method that prints all people last name start with C
        for (Person p: people) {
            if(p.getLastName().startsWith("c")) {
                System.out.println(p.toString());
            }
        }
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("A");
            }
        });

        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                System.out.println("Last Name");
                return p.getFirstName().startsWith("A");
            }
        });
    }

    private static void printConditionally(List<Person> personList, Condition condition) {
        for (Person p: personList) {
            if(condition.test(p)) {
                System.out.println("======================");
                System.out.println(p.toString());
            }
        }
    }

    interface Sort {
            List<Person> sort(Boolean b);
    }

    interface Condition {
        boolean test(Person p);
    }
}
