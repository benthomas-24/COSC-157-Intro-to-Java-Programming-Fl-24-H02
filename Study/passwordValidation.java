package Study;
import java.util.Scanner;
public class passwordValidation {
    public static final String password = "H3llo Wrld";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please re-enter the password to the system:\nCurrent password: 'H3llo Wrld' ");
        String userAttemptinput = input.nextLine();
        if (!userAttemptinput.equals(password)) {
            System.out.println("Access Denied");
        }
        else{
            System.out.println("Access Granted");
        }
    }
}
//Create a program that validates a password based on multiple criteria (length, upper-
//case letters, special characters).