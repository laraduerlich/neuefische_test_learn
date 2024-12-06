package org.task.exceptions;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        try {
            System.out.println(StudentService.findStudentById("1"));;
        } catch (StudentNotFoundException studentNotFoundException) {
            System.out.println("Student not found");
        }
    }
}
