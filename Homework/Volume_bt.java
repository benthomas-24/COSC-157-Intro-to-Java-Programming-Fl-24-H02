package Homework;

import java.util.Scanner;

public class Volume_bt {
    private static final double PI = Math.PI;
    private static final double gallonsPerCubicFoot = 7.48;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = getValidDoubleInput(input, "Please enter the radius of the circle (in cubic feet): " );
        double height = getValidDoubleInput(input, "Please enter the height of the cylinder (in cubic feet): ");
        double volumeCubicFeet = PI * Math.pow(radius, 2) * height; // v = pi*r^2*h
        double volumeGallons = volumeCubicFeet / gallonsPerCubicFoot; // v = pi*r^2*h / 7.48
        System.out.printf("The volume of the cylinder is %.2f gallons.%n", volumeGallons);
        input.close();

    } // main method
    private static double getValidDoubleInput(Scanner input, String prompt){
        Double value;
        while(true){
            System.out.println(prompt);
            try{
                value = Double.parseDouble(input.nextLine());
                if (value >= 0){
                    return value;
                } // if
                System.out.printf("Please enter a value larger than %.0f%n", value);
                }/*try*/ catch (NumberFormatException e){
                    System.out.println("Please enter valid number values only.");
            } // catch
        } // while
        } //getValidDoubleInput method

} // Volume_bt class