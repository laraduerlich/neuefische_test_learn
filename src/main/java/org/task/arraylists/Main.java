package org.task.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        School school = new School();

        Student student1 = new Student("John", "Smith", 1);
        Student student2 = new Student("Jane", "Doe", 2);
        Student student3 = new Student("Jack", "Smith", 3);
        Student student4 = new Student("Jill", "Smith", 4);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        Course course1 = new Course("math", "Peter", 101);
        Course course2 = new Course("chemistry", "Peter", 102);
        Course course3 = new Course("engineering", "Peter", 103);

        school.printStudents();
        school.getStudentByID(2);
        school.removeStudent(school.getStudentByID(4));

        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course2);
        student3.addCourse(course3);

        school.getAllCoursesOfStudent(1);

    }
}
