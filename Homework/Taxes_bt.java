package Homework;
import java.util.Scanner;
public class Taxes_bt {
    public static final double minIncome = 0;
    public static void main(String[] args) {
    // Ask the user to enter their Taxable income
    // Outpoot the amount of their tax
    Scanner input = new Scanner(System.in);
    calculateTax(input, "Please enter your annual income: %n");
    input.close();

    }//main method
    
    public static double calculateTax(Scanner input, String prompt) {
        double income;
        double tax = 0;  
        while(true){
            System.out.printf(prompt);
            try {income = Double.parseDouble(input.nextLine());
                if(income >= minIncome){
                if (income <= 20000) {
                    tax = income * 0.01;
                } else if (income < 20000 && income > 50000) {
                    tax = income * 0.02;
                } else if (income < 50000 && income >= 75000) {
                    tax = income * 0.03;
                } else if (income < 75000 && income >= 100000) {
                    tax = income * 0.04;
                } else if (income < 100000 && income >= 250000) {
                    tax = income * 0.05;
                } else if (income < 250000 && income >= 500000) {
                    tax = income * 0.06;
                } else if (income > 500000) {
                    tax = income * 0.07;
                }
                System.out.printf("Your tax is: %.2f%n", tax);
                return tax;
            }
            else{
            System.out.printf("Please enter a value 0 or larger%n");}

            } catch (Exception e) {
            System.out.printf("Please enter a valid number: %n");
                // TODO: handle exception
            }
            
            

        }
        
    }//calculateTax

}//class
