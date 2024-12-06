package org.task.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {

    @Test
    void findById_shouldThrowException_whenIdNotExist() {
        assertThrows(StudentNotFoundException.class, () -> StudentRepo.findById("1"));
    }

}