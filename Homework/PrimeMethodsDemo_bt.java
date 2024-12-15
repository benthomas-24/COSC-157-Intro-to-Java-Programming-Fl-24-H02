package Homework;
import java.util.Scanner;
public class PrimeMethodsDemo_bt {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int userInput = getint();
        System.out.printf("Prime: %b", PrimeMethods_bt.determineIfPrime(userInput));
        System.out.printf("Sophie Germain Prime: %b", PrimeMethods_bt.isSophieGermainPrime(userInput));
        System.out.printf("Twin Prime: %b", PrimeMethods_bt.isTwinPrime(userInput));
        System.out.printf("Safe Prime: %b", PrimeMethods_bt.isSafePrime(userInput));
    }
    public static int getint(){
        int userInput;
        while (true){
            System.out.println("Please Enter an int");
            try {
                userInput = Integer.parseInt(input.nextLine());
                return userInput;
            }catch (Exception e){
                System.out.println("Please enter Integer values only");
            }
        }
    }
}