package Homework;
import java.util.Scanner;

public class GeometricMean_bt {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double initialInvestment = investment();
        int years = years();
        double rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0, rate5 = 0, rate6 = 0;
        double gm = 0;

        if (years == 1) {
            rate1 = getRate(1);
            gm = rate1;
            System.out.printf("The geometric mean is: %.6f\n", gm);
            double finalValue = Math.pow(gm, years) * initialInvestment;
            System.out.printf("The value of the property after %d year will be $%.2f\n", years, finalValue);
        } else if (years == 2) {
            rate1 = getRate(1);
            rate2 = getRate(2);
            gm = geometricMean(rate1, rate2);
            System.out.printf("The geometric mean is: %.6f\n", gm);
            double finalValue = Math.pow(gm, years) * initialInvestment;
            System.out.printf("The value of the property after %d years will be $%.2f\n", years, finalValue);
        } else if (years == 3) {
            rate1 = getRate(1);
            rate2 = getRate(2);
            rate3 = getRate(3);
            gm = geometricMean(rate1, rate2, rate3);
            System.out.printf("The geometric mean is: %.6f\n", gm);
            double finalValue = Math.pow(gm, years) * initialInvestment;
            System.out.printf("The value of the property after %d years will be $%.2f\n", years, finalValue);
        } else if (years == 4) {
            rate1 = getRate(1);
            rate2 = getRate(2);
            rate3 = getRate(3);
            rate4 = getRate(4);
            gm = geometricMean(rate1, rate2, rate3, rate4);
            System.out.printf("The geometric mean is: %.6f\n", gm);
            double finalValue = Math.pow(gm, years) * initialInvestment;
            System.out.printf("The value of the property after %d years will be $%.2f\n", years, finalValue);
        } else if (years == 5) {
            rate1 = getRate(1);
            rate2 = getRate(2);
            rate3 = getRate(3);
            rate4 = getRate(4);
            rate5 = getRate(5);
            gm = geometricMean(rate1, rate2, rate3, rate4, rate5);
            System.out.printf("The geometric mean is: %.6f\n", gm);
            double finalValue = Math.pow(gm, years) * initialInvestment;
            System.out.printf("The value of the property after %d years will be $%.2f\n", years, finalValue);
        } else if (years == 6) {
            rate1 = getRate(1);
            rate2 = getRate(2);
            rate3 = getRate(3);
            rate4 = getRate(4);
            rate5 = getRate(5);
            rate6 = getRate(6);
            gm = geometricMean(rate1, rate2, rate3, rate4, rate5, rate6);
            System.out.printf("The geometric mean is: %.6f\n", gm);
            double finalValue = Math.pow(gm, years) * initialInvestment;
            System.out.printf("The value of the property after %d years will be $%.2f\n", years, finalValue);
        } else {
            System.out.println("Invalid number of years");
        }
    }

    private static int years() {
        System.out.println("Please enter the number of years you will hold the property:");
        while (true) {
            try {
                int userInput = Integer.parseInt(input.nextLine());
                if (userInput >= 1 && userInput <= 6) {
                    return userInput;
                } else {
                    System.out.println("Please enter a number between 1 and 6 inclusive");
                }
            } catch (Exception e) {
                System.out.println("Please enter integer values only");
            }
        }
    }

    private static double investment() {
        System.out.println("Please enter the beginning value of the property:");
        while (true) {
            try {
                double userInput = Double.parseDouble(input.nextLine());
                if (userInput > 0) {
                    return userInput;
                } else {
                    System.out.println("Your initial investment has to be larger than $0");
                }
            } catch (Exception e) {
                System.out.println("Please enter numerical values only");
            }
        }
    }

    private static double getRate(int year) {
        System.out.printf("Please enter the rate for year %d\n", year);
        while (true) {
            try {
                double userInput = Double.parseDouble(input.nextLine());
                return userInput;
            } catch (Exception e) {
                System.out.println("Please enter a valid rate (a decimal number).");
            }
        }
    }

    public static double geometricMean(double y1, double y2) {
        return Math.pow((y1 * y2), 1.0 / 2);
    }

    public static double geometricMean(double y1, double y2, double y3) {
        return Math.pow((y1 * y2 * y3), 1.0 / 3);
    }

    public static double geometricMean(double y1, double y2, double y3, double y4) {
        return Math.pow((y1 * y2 * y3 * y4), 1.0 / 4);
    }

    public static double geometricMean(double y1, double y2, double y3, double y4, double y5) {
        return Math.pow((y1 * y2 * y3 * y4 * y5), 1.0 / 5);
    }

    public static double geometricMean(double y1, double y2, double y3, double y4, double y5, double y6) {
        return Math.pow((y1 * y2 * y3 * y4 * y5 * y6), 1.0 / 6);
    }
}