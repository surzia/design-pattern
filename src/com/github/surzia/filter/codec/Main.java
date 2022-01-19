package com.github.surzia.filter.codec;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creating an object of List in main() method
        // Declaring object of user-defined datatype 'Person'
        List<Person> persons = new ArrayList<>();

        // Adding elements to the object created above
        // using the add() method of List
        // Custom entries
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        // Display message
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        // Display message
        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        // Display message
        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        // Display message
        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
