// String firstName, middleName, lastName;
import java.util.Scanner;
public class firstMiddleLast_bt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = getValidStringInput(input, "Enter your first name: ");
        String middleName = getValidStringInput(input, "Enter your middle name: ");
        String lastName = getValidStringInput(input, "Enter your last name: ");
        System.out.printf("Length of First Name: %d%n", firstName.length());
        System.out.printf("Length of Middle Name: %d%n", middleName.length());
        System.out.printf("Length of Last Name: %d%n", lastName.length());
        System.out.printf("Initials: %c%c%c%n", firstName.toUpperCase().charAt(0), middleName.toUpperCase().charAt(0), lastName.toUpperCase().charAt(0));
        System.out.printf("Total ASCII Values of Initials: %d%n", (int)firstName.toUpperCase().charAt(0) + (int)middleName.toUpperCase().charAt(0) + (int)lastName.toUpperCase().charAt(0));
        input.close();
    } // main method

    private static String getValidStringInput(Scanner input, String prompt) {
        String value;
        while (true) {
            System.out.println(prompt);
            try {
                value = input.nextLine();
                if (value.length() > 0) {
                    return value;
                } // if
                System.out.println("Please enter a valid name.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid name values only.");
            } // catch
        } // while
    } // getValidStringInput method
} // firstMiddleLast_bt class