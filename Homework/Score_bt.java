package Homework;
import java.util.ArrayList;
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
    private static int studentsAtAverage(int[] scores, double average){
        ArrayList<Integer> atAverage = new ArrayList<>();
        for (int score : scores) {
            if (score == average) {
                atAverage.add(score);
            }
        }
        return atAverage.size();
    }
    private static int studentsAboveAverage(int[] scores, int average){
        ArrayList<Integer> aboveAverage = new ArrayList<>();
        for (int score : scores) {
            if (score > average)
                aboveAverage.add(score);
        }
        return aboveAverage.size();
    }
    private static int studentsBelowAverage(int[] scores, int average){
        ArrayList<Integer> belowAverage = new ArrayList<>();
        for (int score : scores) {
            if (score < average)
                belowAverage.add(score);
        }
        return belowAverage.size();
    }
    private static void scores(int[] arrayPassed) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arrayPassed.length; i++) {
            while (true) {
                System.out.printf("Enter #%d: ", i + 1);
                try {
                    arrayPassed[i] = Integer.parseInt(input.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter integer values only");
                }
            }
            sum += arrayPassed[i];
        }
        int averageScore = (sum/arrayPassed.length);
        double averageScoreExact = ((double) sum/arrayPassed.length);
        int aboveAverage = studentsAboveAverage(arrayPassed, averageScore);
        int belowAverage = studentsBelowAverage(arrayPassed, averageScore);
        int studentsAtAverage = studentsAtAverage(arrayPassed, averageScore);
        int[] arraySorted = Arrays.copyOf(arrayPassed, arrayPassed.length);
        Arrays.sort(arraySorted);
        System.out.println("Sorted Scores: "+ Arrays.toString(arraySorted) + "\n");
        System.out.println("Best Score: "+arraySorted[arrayPassed.length - 1]);
        System.out.println("Lowest Score: "+arraySorted[0]);
        System.out.printf("Average Score: %d\n", averageScore);
        System.out.printf("Average Score (Exact): %.2f\n", averageScoreExact);
        System.out.printf("Students At Average: %d\n", studentsAtAverage);
        System.out.printf("Students Above Average: %d\n", aboveAverage);
        System.out.printf("Students Below Average: %d\n", belowAverage);

    }
}