package org.task.exceptions;

import java.util.*;

public class StudentRepo {

    private static final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public static Student findById(String id) throws StudentNotFoundException {
        if (!students.containsKey(id)) {
            throw new StudentNotFoundException("Student not found");
        }
        return students.get(id);
    }

}