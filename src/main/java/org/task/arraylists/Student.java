package org.task.arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String firstname;
    private String lastname;
    private int studentID;
    private List<Course> courses;

    public Student(String firstname, String lastname, int studentID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && Objects.equals(firstname, student.firstname) && Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, studentID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", studentID=" + studentID +
                ", courses=" + courses +
                '}';
    }
}
