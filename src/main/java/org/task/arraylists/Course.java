package org.task.arraylists;

import java.util.Objects;

public class Course {
    private String coursename;
    private String instructor;
    private int room;

    public Course(String coursename, String instructor, int room) {
        this.coursename = coursename;
        this.instructor = instructor;
        this.room = room;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return room == course.room && Objects.equals(coursename, course.coursename) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coursename, instructor, room);
    }

    @Override
    public String toString() {
        return "Course{" +
                "coursename='" + coursename + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room=" + room +
                '}';
    }
}
