import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String firstName, lastName;
        int age;
        boolean opinion;
        char middleInitial;

        System.out.println("PLease enter your first name. ");
        firstName = input.nextLine();

        System.out.println("Please enter your middle initial.");
        middleInitial = (char)System.in.read();

        input.nextLine(); // Flush the line

        System.out.println("PLease enter your last name. ");
        lastName = input.nextLine();

        System.out.println("Java is easy to learn (True or False)?");
        opinion = input.nextBoolean();

        System.out.printf("Hi, %s %s!%n", firstName, lastName);
        System.out.printf("Java is easy to learn?: %b%n", opinion);

    }// end main
}// end class