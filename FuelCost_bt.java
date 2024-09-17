//First time working with wrapper classes! We should talk about them in class

import java.util.Scanner;
import java.lang.Math;
public class FuelCost_bt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining my Variables all at once
        int endingOdometerReading, beginningOdometerReading, numberMilesDrivenPerYear;
        double costPerGallonOfGas, milesPerGallon, costOfFuelPerMile, annualCostOfFuel, gallonsToFillTank;
        long milesPerGallonRounded;
        String confirmation;


        // Odometer reading (before the drive)
        System.out.println("Enter the current odometer reading before starting the drive: ");
        while(true){
            try {
                beginningOdometerReading = Integer.parseInt(input.nextLine());
                if(beginningOdometerReading < 0){
                    System.out.println("Invalid odometer reading! Please enter a value larger than 0");
                } else break;
            }catch (NumberFormatException e){
                System.out.println("Please enter integer values only: ");
            }
        }


        // Confirmation Process
        do {
            System.out.println("You entered: " + beginningOdometerReading + "-miles. Is this correct? (yes/no):");
            while (true){
            try{
                confirmation = input.nextLine();
                if (confirmation.equalsIgnoreCase("no")) {
                System.out.println("Please enter the correct odometer reading: ");
                beginningOdometerReading = Integer.parseInt(input.nextLine());
            } else if (!confirmation.equalsIgnoreCase("yes")) {
                System.out.println("Please enter either 'yes' or 'no'.");
            }else break;
            }catch (NumberFormatException e){
            System.out.println("Please enter integer values only: ");}
            }
        } while (!confirmation.equalsIgnoreCase("yes"));

        // Odometer reading (after the drive)
        System.out.println("Enter the final odometer mileage once the drive is finished: ");
        while(true){
            try{
                endingOdometerReading = Integer.parseInt(input.nextLine());
                if(endingOdometerReading <= beginningOdometerReading){
                    System.out.println("Please enter a value larger than "+ beginningOdometerReading + "-miles.");
                }
                else break;
            }
            catch (NumberFormatException e){
                System.out.println("Please enter integer values only: ");
            }
        }

        // Confirmation Process
        do {
            System.out.println("You entered: " + endingOdometerReading + "-miles. Is this correct? (yes/no):");
            confirmation = input.nextLine();

            if (confirmation.equalsIgnoreCase("no")) {
                System.out.println("Please enter the correct odometer reading: ");
                endingOdometerReading = Integer.parseInt(input.nextLine());
                // Adding error handling
                if (endingOdometerReading == beginningOdometerReading){
                    System.out.print("Enter a different value than the beginning odometer reading: ");
                    endingOdometerReading = Integer.parseInt(input.nextLine());
                }
            } else if (!confirmation.equalsIgnoreCase("yes")) {
                System.out.println("Please enter either 'yes' or 'no'.");
            }
        } while (!confirmation.equalsIgnoreCase("yes"));

        // Ask the User what size gas tank does their car have (in gallons)
        System.out.print("Enter the amount of gallons to fill your tank after the trip: ");

        // Here, I'll add some error handling in case a user enters in something unexpected
        while (true) {
            try {
                gallonsToFillTank = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter numbers only: ");
            }
        }

        // Confirmation Process
        do {
            System.out.print("You entered: " + gallonsToFillTank + "-gallon tank. Is this correct? (yes/no): ");
            confirmation = input.nextLine();

            if (confirmation.equalsIgnoreCase("no")) {
                System.out.print("Enter the amount of gallons to fill your tank after the trip: ");

                // Error handling inside the re-entry for incorrect confirmation
                while (true) {
                    try {
                        gallonsToFillTank = Double.parseDouble(input.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter numbers only: ");
                    }
                }
            } else if (!confirmation.equalsIgnoreCase("yes")) {
                System.out.println("Please enter either 'yes' or 'no'.");
            }

        } while (!confirmation.equalsIgnoreCase("yes"));

        // Asking User for the gas price they chose
        do {
            while (true) {
                System.out.print("Enter the cost of gas per gallon: $");
                try {
                    String userInput = input.nextLine().trim();
                    if (userInput.isEmpty()) {
                        System.out.println("Cannot be empty. Please enter a valid price.");
                        continue;
                    }
                    costPerGallonOfGas = Double.parseDouble(userInput);
                    if (costPerGallonOfGas <= 0) {
                        System.out.println("Must be greater than zero. Please enter a valid price.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number for the price.");
                }
            }

            // Confirmation Process
            while (true) {
                System.out.printf("You entered: $%.2f per gallon. Is this correct? (yes/no): ", costPerGallonOfGas);
                confirmation = input.nextLine().trim().toLowerCase();

                if (confirmation.equals("yes") || confirmation.equals("no")) {
                    break;
                } else {
                    System.out.println("Please enter either 'yes' or 'no'.");
                }
            }

        } while (!confirmation.equals("yes"));


        // Asking user how many miles driven per year
        System.out.println("Enter the amount of miles driven in a year: ");
        // Error handling in case a user enters in something unexpected
        while (true) {
            try {
                numberMilesDrivenPerYear = Integer.parseInt(input.nextLine());
                System.out.println("How many miles have you driven this year? ");
                if (numberMilesDrivenPerYear < endingOdometerReading - beginningOdometerReading) {
                    System.out.println("You've enterd a value smaller than what you just drove. Please enter a larger value: ");
                    continue;}
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter integer values only: ");
            }
        }

        // Confirmation Process
        do {
            System.out.print("You entered: " + numberMilesDrivenPerYear + "-miles per year. Is this correct? (yes/no):");
            confirmation = input.nextLine().trim().toLowerCase();

            if (confirmation.equals("no")) {
                System.out.println("Please re-enter the amount of miles driven in a year: ");
                // Here, we have to repeat the error handling process
                while (true) {
                    try {
                        numberMilesDrivenPerYear = Integer.parseInt(input.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter integer values only: ");
                    }
                }
            }

            // If it's incorrect, they will have to re-enter the value
            else if (!confirmation.equals("yes")) {
                System.out.println("Please enter either 'yes' or 'no'.");
            }
        }while (!confirmation.equalsIgnoreCase("yes")) ;




        // Returning the miles-per-gallon ratio
        milesPerGallon = ((double)endingOdometerReading - (double)beginningOdometerReading) / (double)gallonsToFillTank;
        milesPerGallonRounded = Math.round(milesPerGallon);
        System.out.println("Your MGP (Miles Per Gallon) for this trip was about: " + milesPerGallonRounded + "mpg. (Exact: "+ milesPerGallon + "mpg)");
        // Returning the cost of fuel per mile
        costOfFuelPerMile = (double) costPerGallonOfGas / milesPerGallon;
        System.out.println("Your cost of fuel for this trip was $" + costOfFuelPerMile);
        // Returning the expected Annual Cost of Fuel
        annualCostOfFuel = numberMilesDrivenPerYear * costOfFuelPerMile;
        System.out.println("The Annual cost of fuel is $" + annualCostOfFuel+ ". This is assuming you drive 15,000 miles a year");
    }
}