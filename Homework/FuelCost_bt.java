package Homework;

import java.util.Scanner;
import java.lang.Math;

public class FuelCost_bt {
    private static final int MIN_ODOMETER_READING = 0;
    private static final double MIN_COST_PER_GALLON = 0.01;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int beginningOdometerReading = getValidIntInput(input, "Enter the current odometer reading before starting the drive: ", MIN_ODOMETER_READING);
        int endingOdometerReading = getValidIntInput(input, "Enter the final odometer mileage once the drive is finished: ", beginningOdometerReading++ );
        double gallonsToFillTank = getValidDoubleInput(input, "Enter the amount of gallons to fill your tank after the trip: ", 0.1);
        double costPerGallon = getValidDoubleInput(input, "Enter the cost of gas per gallon: $", MIN_COST_PER_GALLON);
        int numberOfMilesDrivenPerYear = getValidIntInput(input, "Enter the amount of miles driven in a year: ", endingOdometerReading - beginningOdometerReading);

        double milesPerGallon = ((double)endingOdometerReading - beginningOdometerReading) / gallonsToFillTank;
        long milesPerGallonRounded = Math.round(milesPerGallon);
        System.out.printf("Your MPG (Miles Per Gallon) for this trip was about: %d mpg. (Exact: %.2f mpg)%n", milesPerGallonRounded, milesPerGallon);

        double costOfFuelPerMile = costPerGallon / milesPerGallon;
        System.out.printf("Your cost of fuel for this trip was $%.4f per mile%n", costOfFuelPerMile);

        double annualCostOfFuel = numberOfMilesDrivenPerYear * costOfFuelPerMile;
        System.out.printf("The Annual cost of fuel is $%.2f. This is based on your input of %d miles driven per year%n", annualCostOfFuel, numberOfMilesDrivenPerYear);

        input.close();
    }// main method

    public static int getValidIntInput(Scanner input, String prompt, int minValue) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Integer.parseInt(input.nextLine());
                if (value >= minValue) {
                    return value;
                }// if
                System.out.printf("Please enter a value %d or larger%n", minValue);
            }// try
            catch (NumberFormatException e) {
                System.out.println("Please enter integer values only.");
            }// catch
        }// while
    }// getValidIntInput method

    private static double getValidDoubleInput(Scanner input, String prompt, double minValue) {
        double value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Double.parseDouble(input.nextLine());
                if (value >= minValue) {
                    return value;
                }// if
                System.out.printf("Please enter a value larger than %.2f%n", minValue);
            }// try
            catch (NumberFormatException e) {
                System.out.println("Please enter valid number values only.");
            }// catch
        }// while
    }// getValidDoubleInput method
}// FuelCost_bt class
