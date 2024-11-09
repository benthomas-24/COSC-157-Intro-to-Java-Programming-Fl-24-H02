    package Homework;// int amountOfNuts = getValidIntInput(input, "Enter the amount of nuts: ");
    import java.util.Scanner;
    public class squirrels_bt {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = getValidIntInput(input, "Enter a positive whole integer: ");
            int initialNumberOfNuts = 12495 + 15625*n;
            System.out.printf("The initial number of nuts is %d%n", initialNumberOfNuts);
            int numberOfNutsForSquirrel1 = (initialNumberOfNuts/5);
            int numberOfNuts = (initialNumberOfNuts) - (numberOfNutsForSquirrel1+1);
            int numberOfNutsForSquirrel2 = (numberOfNuts/ 5);
            numberOfNuts -= (numberOfNutsForSquirrel2+1);
            int numberOfNutsForSquirrel3 = (numberOfNuts/ 5);
            numberOfNuts -= (numberOfNutsForSquirrel3+1);
            int numberOfNutsForSquirrel4 = (numberOfNuts/ 5);
            numberOfNuts -= (numberOfNutsForSquirrel4+1);
            int numberOfNutsForSquirrel5 = (numberOfNuts/ 5) ;
            numberOfNuts -= (numberOfNutsForSquirrel5+1);
            System.out.printf("The number of nuts that Squirrel 1 took during the night: %d%n", numberOfNutsForSquirrel1);
            System.out.printf("The number of nuts that the chipmunk got during the night: %d%n", 1);
            System.out.printf("The number of nuts that Squirrel 2 took during the night: %d%n", numberOfNutsForSquirrel2);
            System.out.printf("The number of nuts that the chipmunk got during the night: %d%n", 1);
            System.out.printf("The number of nuts that Squirrel 3 took during the night: %d%n", numberOfNutsForSquirrel3);
            System.out.printf("The number of nuts that the chipmunk got during the night: %d%n", 1);
            System.out.printf("The number of nuts that Squirrel 4 took during the night: %d%n", numberOfNutsForSquirrel4);
            System.out.printf("The number of nuts that the chipmunk got during the night: %d%n", 1);
            System.out.printf("The number of nuts that Squirrel 5 took during the night: %d%n", numberOfNutsForSquirrel5);
            System.out.printf("The number of nuts that the chipmunk got during the night: %d%n", 1);
            System.out.printf("The number of nuts in the pile in the morning: %d%n", numberOfNuts);
            System.out.printf("The number of nuts each squirrel got in the morning: %d%n",numberOfNuts/5);
            System.out.printf("number of nuts the chipmunk got in the morning: %d%n", numberOfNuts%5);
            input.close();
        } // main method
        private static int getValidIntInput(Scanner input, String prompt){
            int n;
            while(true){
                System.out.println(prompt);
                try{
                    n = Integer.parseInt(input.nextLine());
                    if(n >= 0){
                         return n;
                    } // if
                    System.out.printf("Please enter a value larger than %d%n", n);
                } catch (NumberFormatException e){
                    System.out.println("Please enter integer values only.");
                } // catch
            } // while
        } // getValidIntInput method
    }// squirrels_bt class