package Study;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        leapYear("Enter a year to check if it is a 'Leap Year':", input);
    }
    private static void leapYear(String prompt, Scanner input){
        System.out.println(prompt);
        int year = Integer.parseInt(input.nextLine());
        if(year % 4 == 0){
            System.out.printf("%d is a leap year.%n", year);
        }
        else{
            System.out.printf("%d is not a leap year.%n", year);
        }
    }
}

//Write a program that checks if a given year is a leap year.