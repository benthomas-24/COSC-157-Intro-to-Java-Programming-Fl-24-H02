package Homework;
import java.util.Scanner;
public class FrequencyAnalysis_bt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] count = new int[26];

        System.out.println("Please enter a string and we will tell you how many times the letters of the same type appear:\n");
        String usrInput = input.nextLine();

        for(int l = 0; l < usrInput.length(); l++){
            char currentChar = Character.toUpperCase(usrInput.charAt(l));
            if (currentChar >= 'A' && currentChar <= 'Z'){
                int index = currentChar - 'A'; //Because 'A' is 65
                count[index]++;
            }
        }
        for(int i = 0; i < count.length; i++){
            char letter = (char) (i + 'A');
            if(count[i] > 0) {
                System.out.printf("%c: %d%n", letter, count[i]);
            }
        }
    }
}