package org.sessions.lombok;

import org.task.exceptions.StudentRepo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Lombok!");

        StudentLombok studentLombok = new StudentLombok("Max", 34, 1); // @AllArgsConstructor
        StudentLombok studentLombok2 = new StudentLombok(); // @NoArgsConstructor
        StudentLombok studentLombok3 = StudentLombok.builder() // @Builder, braucht nicht alle Eigenschaften, gut für Tests
                .age(34)
                .name("John")
                .build();
        System.out.println(studentLombok3);

        System.out.println("-".repeat(40));

        StudentRecord studentRecord = new StudentRecord("Tim", 30, 2);
        System.out.println(studentRecord);
        studentRecord = studentRecord.withAge(40);
        System.out.println(studentRecord);

    }
}
