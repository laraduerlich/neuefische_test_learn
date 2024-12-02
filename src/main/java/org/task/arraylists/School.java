package org.task.arraylists;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        System.out.println(students.toString());
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println("Student removed: " + student);
    }

    public Student getStudentByID(int id) {
        for (Student student : students) {
            if (student.getStudentID() == id) {
                return student;
            }
        } throw new IllegalArgumentException("this student does not exist");
    }

    public void getAllCoursesOfStudent(int id) {
        Student student = getStudentByID(id);
        if (student != null) {
            for (Course course : student.getCourses()) {
                System.out.println(course);
            }
        } else {
            System.out.println("Kein Schüler mit der ID " + id + " gefunden.");
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(students);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
