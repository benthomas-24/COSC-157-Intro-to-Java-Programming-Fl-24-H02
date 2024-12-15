package Homework;

import java.util.Scanner;

public class GCDLCM_bt{
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            int num1 = getValidInt("Enter in a positive integer value for num1");
            int num2 = getValidInt("Enter in a positive integer value for num2");
            System.out.printf("The gcd of %d and %d is %d\n", num1, num2, gcd(num1, num2));
            System.out.printf("The lcm of %d and %d is %d\n", num1, num2, lcm(num1, num2));
        }while (askToRepeat());
        }
    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static int lcm (int a, int b) {
        return ((a * b) / gcd(a, b));
    }
    public static int getValidInt(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                int userInput = Integer.parseInt(input.nextLine());
                if (userInput > 0){
                    return userInput;
                }
                else {
                    System.out.println("Please enter a positive integer");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
    public static boolean askToRepeat(){
        boolean repeat = false;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Do you wish to repeat?\nYes or No?:\n");
        while (true) {
            String userResponse = input.nextLine();
            if (userResponse.equalsIgnoreCase("yes")) {
                repeat = true;
                break;
            }
            else if(userResponse.equalsIgnoreCase("no")){
                break;
            }
            else{
                System.out.println("Please enter Yes or No");
            }
        }
        return repeat;
    }
}

