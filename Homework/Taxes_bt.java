package Homework;
import java.util.Scanner;
public class Taxes_bt {
    public static final double minIncome = 0;
    public static void main(String[] args) {
    // Ask the user to enter their Taxable income
    // Outpoot the amount of their tax
    Scanner input = new Scanner(System.in);
    double tax = calculateTax(input, "Please enter your annual income: %n");
    System.out.printf("Your tax is: %s%n", String.format("$%,.2f", tax));
    input.close();
    }// main method
    
    public static double calculateBracketTax(double income, double upperBound, double lowerBound, double rate){
        double taxableAmountInBracket = Math.min(income, upperBound) - lowerBound;
        taxableAmountInBracket = Math.max(taxableAmountInBracket, 0);
        return taxableAmountInBracket * rate;
    }// calculateBracketTax method

    public static double calculateTax(Scanner input, String prompt) {
        double income;
        double tax = 0;  
        while(true) {
            System.out.printf(prompt);
            try {
                income = Double.parseDouble(input.nextLine());
                if(income >= minIncome) {
                    tax = calculateBracketTax(income, 20000, 0, 0.01) +
                          calculateBracketTax(income, 50000, 20000, 0.02) +
                          calculateBracketTax(income, 75000, 50000, 0.03) +
                          calculateBracketTax(income, 100000, 75000, 0.04) +
                          calculateBracketTax(income, 250000, 100000, 0.05) +
                          calculateBracketTax(income, 500000, 250000, 0.06) +
                          calculateBracketTax(income, Double.MAX_VALUE, 500000, 0.07);
                    return tax;
                } else {
                    System.out.printf("Please enter a value $0.00 or larger%n");
                }
            } catch (NumberFormatException e) {
                System.out.printf("Please enter a valid number%n");
            }
        }
    }// calculateTax

}// class
