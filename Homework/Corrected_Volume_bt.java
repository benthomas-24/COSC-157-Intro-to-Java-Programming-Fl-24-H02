
package Homework;

import java.util.Scanner;

public class Corrected_Volume_bt {
    private static final double PI = Math.PI;
    private static final double gallonsPerCubicFoot = 7.48;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = getValidDoubleInput(input, "Please enter the radius of the circle (in feet): ");
        double height = getValidDoubleInput(input, "Please enter the height of the cylinder (in feet): ");
        double volumeCubicFeet = PI * Math.pow(radius, 2) * height;
        double volumeGallons = volumeCubicFeet * gallonsPerCubicFoot;
        System.out.printf("The cylinder's volume is %.2f cubic feet.%n", volumeCubicFeet);
        System.out.printf("The cylinder could hold %.2f gallons of water.%n", volumeGallons);
        input.close();
    }
    private static double getValidDoubleInput(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = Double.parseDouble(input.nextLine());
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }
}
