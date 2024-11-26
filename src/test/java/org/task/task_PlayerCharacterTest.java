package org.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class task_PlayerCharacterTest {

    @BeforeEach
    void setUp() {
        task_PlayerCharacter.X = 0;
        task_PlayerCharacter.Y = 0;
    }

    @Test
    void getX_expect0_whenStart() {
        // GIVEN
        int start = 0;
        // WHEN
        int actualStart = task_PlayerCharacter.getX();
        // THEN
        Assertions.assertEquals(start, actualStart);
    }
    @Test
    void getY_expect0_whenStart() {
        // GIVEN
        int start = 0;
        // WHEN
        int actualStart = task_PlayerCharacter.getY();
        // THEN
        Assertions.assertEquals(start, actualStart);
    }
    @Test
    void move_expect1Up_whenW() {
        // GIVEN
        char up = 'W';
        int expectedY = 1;
        // WHEN
        int moveUP = task_PlayerCharacter.move(up);
        // THEN
        Assertions.assertEquals(expectedY, moveUP);
    }
    @Test
    void move_expect1Down_whenS() {
        // GIVEN
        char down = 'S';
        int expectedY = -1;
        // WHEN
        int moveDOWN = task_PlayerCharacter.move(down);
        // THEN
        Assertions.assertEquals(expectedY, moveDOWN);
    }
    @Test
    void move_expect1Right_whenD() {
        // GIVEN
        char right = 'D';
        int expectedX = 1;
        // WHEN
        int moveRIGHT = task_PlayerCharacter.move(right);
        // THEN
        Assertions.assertEquals(expectedX, moveRIGHT);
    }
    @Test
    void move_expect1Left_whenA() {
        // GIVEN
        char left = 'A';
        int expectedX = -1;
        // WHEN
        int moveLEFT = task_PlayerCharacter.move(left);
        // THEN
        Assertions.assertEquals(expectedX, moveLEFT);
    }
}
