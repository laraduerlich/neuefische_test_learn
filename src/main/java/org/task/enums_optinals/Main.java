package org.task.enums_optinals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Methode für Wochentage
        System.out.println(DaysOfWeek.MONDAY.getValue());
        System.out.println(DaysOfWeek.SUNDAY.getValue());

        // Person zu PersonsRepo hinzufügen
        PersonsRepo personsRepo = new PersonsRepo();
        personsRepo.addPerson(new Person(1, "Max", DaysOfWeek.FRIDAY, Gender.MALE));
        personsRepo.addPerson(new Person(3, "Mandy", DaysOfWeek.FRIDAY, Gender.FEMALE));
        personsRepo.addPerson(new Person(4, "Jo", DaysOfWeek.FRIDAY, Gender.DIVERSE));

        // Check wenn Person in PersonsRepo enthalten ist
        Optional<Person> checkPerson = personsRepo.getPerson(1);
        Person max = checkPerson.orElse(new Person(1, "UNKNOWN", DaysOfWeek.MONDAY, Gender.DIVERSE));
        System.out.println(max);

        // Check wenn Person nicht in PersonsRepo enthalten ist
        Optional<Person> databasePersonOrNot = personsRepo.getPerson(2);
        Person person2 = databasePersonOrNot.orElse(new Person(2, "UNKNOWN", DaysOfWeek.MONDAY, Gender.DIVERSE));
        System.out.println(person2);

        // Counter wie viele Personen von jedem Gender in PersonsRepo vorhanden sind
        personsRepo.countByGender();
    }
}
