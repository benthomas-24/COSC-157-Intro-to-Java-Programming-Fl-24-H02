package Homework;
import java.util.Arrays;
import java.util.Scanner;
public class Score_bt {
    private static final int maxStudents = 26;
    private static final int minStudents = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = getValidIntInput(input, "Please enter the amount of students in your class: ");
        int[] studentScores = new int[numberOfStudents];
        scores(studentScores);

        // do/while -> get # of n students
        // declare/create an array
        // for loop n times
        // *nested in for loop* do while -> get the score

        // sort
        // highest [len - 1]
        // lowest [0]
    }

    private static int getValidIntInput(Scanner input, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Integer.parseInt(input.nextLine());
                if (value >= minStudents) {
                    return value;
                }// if
                System.out.printf("Please enter a value between %d-%d%n", minStudents, maxStudents);
            }// try
            catch (NumberFormatException e) {
                System.out.println("Please enter integer values only.");
            }// catch
        }// while
    }// getValidIntInput method

    private static void scores(int[] arrayPassed) {
        int[] arraySorted = Arrays.copyOf(arrayPassed, arrayPassed.length);
        Arrays.sort(arraySorted);
        System.out.println(Arrays.toString(arraySorted));
    }
}