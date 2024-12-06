package org.task.exceptions;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private final static StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public static Student findStudentById(String id) throws StudentNotFoundException {
        return repo.findById(id);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }
}