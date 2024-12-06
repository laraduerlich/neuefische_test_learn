package org.task.lombok;

public class Main {
    public static void main(String[] args) {

        // new Students
        Student student1 = new org.task.lombok.Student(1,"Max","Musterstr. 1", 2);
        Student student2 = Student.builder()
                .id(2)
                .name("Tim")
                .build();
        Student student3 = Student.builder()
                .id(3)
                .name("John")
                .build();


        // new Teacher
        Teacher teacher1 = new Teacher(1,"Müller", "Math");
        Teacher teacher2 = new Teacher(2, "Mustermann", "Math");

        // new Course
        Course course1 = new Course(1, "Math", teacher1, student1);
        Course course2 = Course.builder()
                .id(3)
                .name("English")
                .student(student2)
                .build();

        // Check Getter, Setter, toString
        System.out.println(student1.getAddress());
        student1.setAddress("Musterstr. 2");
        System.out.println(student1.getAddress());

        System.out.println(course1.toString());

        // Check Wither
        System.out.println(teacher2.toString());
        teacher2 = teacher2.withSubject("English");
        System.out.println(teacher2.toString());

    }
}
