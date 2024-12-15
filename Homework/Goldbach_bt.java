package Homework;
import java.util.Locale;
import java.util.Scanner;
public class Goldbach_bt {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            int input = userInput();
            goldBach(input);
        }
        while (askToRepeat());
    }
    public static int userInput(){
        int userInput;
        System.out.println("Please enter an even number greater than 2");
        while (true){
            try {
                userInput = Integer.parseInt(input.nextLine());
                if(userInput > 2 && userInput % 2 == 0){
                    return userInput;
                }
                else{
                    System.out.println("Make sure your number is greater than 2 and even. Please, try again.");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a integer values only");
            }
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        if (n == 2){
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i+=2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void goldBach(int n) {
        boolean found = false;
        for(int i = 2; i <= n / 2; i++){
            if(isPrime(i) && isPrime(n - i)){
                System.out.printf("%d = %d + %d", n, i, n - i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("No prime pairs found for the given number.");
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