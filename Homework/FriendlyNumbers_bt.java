package Homework;

import java.util.Scanner;

public class FriendlyNumbers_bt {
    public static final int MIN_VALUE = 10000;  
    public static final int MAX_VALUE = 99999;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        divideFiveDigitNumber(input, "Enter a 5 digit number to see if is a Friendly Number!: ");
        input.close();
    }// Main Method
    public static int divideFiveDigitNumber(Scanner input, String prompt){
        while(true){
            System.out.printf(prompt);
            try {
                int num = Integer.parseInt(input.nextLine());
                if (num >= MIN_VALUE && num <= MAX_VALUE){
                    if((num/1000) % 2 == 0){
                        if ((num/100) % 3 == 0) {
                            if ((num/10)% 4 == 0) {
                                if (num % 5 == 0) {
                                    System.out.printf("Your number passed the 'Friendly Number Test'! %d is a Friendly Number!%n", num);
                                    return num;
                                    
                                } else {
                                    System.out.printf("Your number failed the 'Friendly Number Test' because %d wasn't devisable by 5 %n", num);
                                    return num;  
                                }
                                
                            } else {
                                System.out.printf("Your number failed the 'Friendly Number Test' because %d wasn't devisable by 4 %n", (num/10));
                                return num;
                            }
                            
                        } else {
                            System.out.printf("Your number failed the 'Friendly Number Test' because %d wasn't devisable by 3 %n", (num/100));
                            return num;
                            
                        }
                    }
                    else{
                        System.out.printf("Your number failed the 'Friendly Number Test' because %d isn't devisable by 2 %n", (num/1000));
                        return num;
                    }
                } System.out.printf("Please enter a valid integer between %d-%d.%n", MIN_VALUE, MAX_VALUE); 

            } catch (Exception e) {
                System.out.printf("Please enter a valid integer between %d-%d.%n", MIN_VALUE, MAX_VALUE);
            // TODO: handle exception
            }
    
        }
    }
}// FriendlyNumbers Class

