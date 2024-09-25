package Homework;

import java.util.Scanner;

public class Seconds_bt{
    public final static int SECONDS_IN_YEAR = 31536000;
    public final static int SECONDS_IN_DAY = 86400;
    public final static int SECONDS_IN_HOUR = 3600;
    public final static int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int seconds = getValidIntInput(input, "Enter the number of seconds: ");
        int years = seconds / SECONDS_IN_YEAR;
        int days = (seconds % SECONDS_IN_YEAR) / SECONDS_IN_DAY;
        int hours = ((seconds % SECONDS_IN_YEAR) % SECONDS_IN_DAY) / SECONDS_IN_HOUR;
        int minutes = (((seconds % SECONDS_IN_YEAR) % SECONDS_IN_DAY) % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        int remainingSeconds = (((seconds % SECONDS_IN_YEAR) % SECONDS_IN_DAY) % SECONDS_IN_HOUR) % SECONDS_IN_MINUTE;
        System.out.printf("Years: %d Days: %d Hours: %d Minutes: %d Seconds: %d%n", seconds, years, days, hours, minutes, remainingSeconds);
        input.close();
    }// main method
    private static int getValidIntInput(Scanner input, String prompt){
        int value;
        while(true){
            System.out.println(prompt);
            try{
                value = Integer.parseInt(input.nextLine());
                if(value >= 0){
                    return value;
                } // if
                System.out.println("Please enter a value larger than 0");
            } catch (NumberFormatException e){
                System.out.println("Please enter integer values only.");
            } // catch
        } // while
    } // getValidIntInput method
}// Seconds_bt class