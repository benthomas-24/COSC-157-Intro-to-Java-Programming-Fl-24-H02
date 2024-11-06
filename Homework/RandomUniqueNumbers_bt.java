package Homework;
import java.util.Random;
import java.util.Scanner;
public class RandomUniqueNumbers_bt {
    public static void main(String[] args){
        Random rng = new Random();
        int randomInt1, randomInt2, randomInt3, randomInt4;
        do {
            randomInt1 = rng.nextInt(1, 21);
            randomInt2 = rng.nextInt(1, 21);
            randomInt3 = rng.nextInt(1, 21);
            randomInt4 = rng.nextInt(1, 21);
        } while (randomInt1 == randomInt2 || randomInt1 == randomInt3 || randomInt1 == randomInt4 ||
                randomInt2 == randomInt3 || randomInt2 == randomInt4 || randomInt3 == randomInt4);

        System.out.println(randomInt1);
        System.out.println(randomInt2);
        System.out.println(randomInt3);
        System.out.println(randomInt4);

    }
}


/*
Note: You MAY NOT use a Hash Set in your solution to this assignment.
Note: You MAY NOT use an Array in your solution to this assignment.

You work for the Massachusetts State Lottery as a programmer. A new game coming out will require players to guess 4 different numbers
between 1 and 20 (inclusive of 1 and 20). You have been given the assignment to write code that will generate 4 random numbers between
1 and 20 (inclusive of 1 and 20) with no repeat numbers. Your code should output the numbers generated (they do not have to be in any order).
Name your program RandomUniqueNumbers_yourInitials.java (yourInitials represents your initials).

Hint: Boolean logic would be helpful here
Hint: A do/while loop would be an efficient way to approach this assignment
Hint: Remember this video about generating random numbers in our chapter 3 module:
*/