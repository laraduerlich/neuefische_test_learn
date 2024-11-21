package org.task;

public class PlayerCharacter {

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

   static int X = 0;
   static int Y = 0;


    public static int move(char direction) {
        if (direction == 'W') {
            Y++;
            return Y;
        } else if (direction == 'S') {
            Y--;
            return Y;
        } else if (direction == 'D') {
            X++;
            return X;
        } else if (direction == 'A') {
            X--;
            return X;
        }
        return Y;
    }
}
