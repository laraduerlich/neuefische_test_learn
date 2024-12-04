package org.task.enums_optinals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonsRepo {

    Map<Integer, Person> persons = new HashMap<>();

    public Optional<Person> getPerson(int id) {
        return Optional.ofNullable(persons.get(id));
    }

    public void addPerson(Person person) {
        persons.put(person.id(), person);
    }

    public void countByGender() {
        int femaleCount = 0;
        int maleCount = 0;
        int diverseCount = 0;
        for (Person person : persons.values()) {
            if (person.gender() == Gender.FEMALE) {
                femaleCount++;
            } else if (person.gender() == Gender.MALE) {
                maleCount++;
            } else if (person.gender() == Gender.DIVERSE) {
                diverseCount++;
            }
        }
        System.out.println("Female persons: " + femaleCount);
        System.out.println("Male persons: " + maleCount);
        System.out.println("Diverse persons: " + diverseCount);
    }




}
