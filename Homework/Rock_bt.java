package Homework;
import java.util.Scanner;
import java.util.Random;
public class Rock_bt {
public static final Character[] validChars = {'R', 'P', 'S', 'L', 'K'};
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    char p = getValidChar(input, "Please enter one of the 5 characters to start your turn: %n(R - Rock)%n(P - Paper)%n(S - Scissors)%n(L - Lizard)%n(K - Spock)%n");
    char c = computerTurn();
    determineWinner(p, c);


    }
    public static char getValidChar(Scanner input, String promt){
        while(true){
            System.out.printf(promt);
            try {
                Character turn = Character.toUpperCase(input.nextLine().charAt(0));
                if(notInArray(validChars, turn)){
                    System.out.printf("'%S' is not a valid character. ", turn);
                }
                else{
                    return turn;
                }
            } catch (Exception e) {
                System.out.printf("Please enter 1 of the 5 listed characters");
                // TODO: handle exception
            }
        }
    }
    public static boolean notInArray(Character[] array, char targetChar) {
        for (Character ch : array) {
            if (ch == targetChar) {
                return false;
            }
        }
        return true;  
    }
    public static char computerTurn(){
        Random rand = new Random();
        return validChars[rand.nextInt(validChars.length)];
    }
    public static void determineWinner(char player, char computer) {
        Scanner input = new Scanner(System.in);
        if (player == computer) {
            System.out.printf("Match has ended in a draw! Want to play again?: (Y/N)%n");
            char answer = Character.toUpperCase(input.nextLine().charAt(0));
            if (answer == 'N') {
                input.close();
                return; // Exit the method instead of restarting
            } else if (answer == 'Y') {
                main(new String[0]); // Restart the game
                return; // Exit the current method after restarting
            } else {
                System.out.println("Invalid input. Exiting the game.");
                input.close();
                return; // Exit the method for invalid input
            }
        }
        if (player == 'R' && computer == 'L') {
            System.out.printf("Player Wins! Rock crushes Lizard.%n");
        } else if (player == 'R' && computer == 'S') {
            System.out.printf("Player Wins! Rock crushes Scissors.%n");
        } else if (player == 'P' && computer == 'R') {
            System.out.printf("Player Wins! Paper covers Rock.%n");
        } else if (player == 'P' && computer == 'K') {
            System.out.printf("Player Wins! Paper disproves Spock.%n");
        } else if (player == 'S' && computer == 'P') {
            System.out.printf("Player Wins! Scissors cuts Paper.%n");
        } else if (player == 'S' && computer == 'L') {
            System.out.printf("Player Wins! Scissors decapitates Lizard.%n");
        } else if (player == 'L' && computer == 'P') {
            System.out.printf("Player Wins! Lizard eats Paper.%n");
        } else if (player == 'L' && computer == 'K') {
            System.out.printf("Player Wins! Lizard poisons Spock.%n");
        } else if (player == 'K' && computer == 'S') {
            System.out.printf("Player Wins! Spock smashes Scissors.%n");
        } else if (player == 'K' && computer == 'R') {
            System.out.printf("Player Wins! Spock vaporizes Rock.%n");
        } else if (computer == 'R' && player == 'S') {
            System.out.printf("Computer Wins! Rock crushes Scissors.%n");
        } else if (computer == 'R' && player == 'L') {
            System.out.printf("Computer Wins! Rock crushes Lizard.%n");
        } else if (computer == 'P' && player == 'R') {
            System.out.printf("Computer Wins! Paper covers Rock.%n");
        } else if (computer == 'P' && player == 'K') {
            System.out.printf("Computer Wins! Paper disproves Spock.%n");
        } else if (computer == 'S' && player == 'P') {
            System.out.printf("Computer Wins! Scissors cuts Paper.%n");
        } else if (computer == 'S' && player == 'L') {
            System.out.printf("Computer Wins! Scissors decapitates Lizard.%n");
        } else if (computer == 'L' && player == 'P') {
            System.out.printf("Computer Wins! Lizard eats Paper.%n");
        } else if (computer == 'L' && player == 'K') {
            System.out.printf("Computer Wins! Lizard poisons Spock.%n");
        } else if (computer == 'K' && player == 'S') {
            System.out.printf("Computer Wins! Spock smashes Scissors.%n");
        } else if (computer == 'K' && player == 'R') {
            System.out.printf("Computer Wins! Spock vaporizes Rock.%n");
        }
    
    }
}

// Rock-Paper-Scissors-Lizard-Spock Game
// Due: Oct 16 by 11:59pm

// Key requirements:
// 1. Player vs. Computer game
// 2. Player input: char (R, P, S, L, K)
// 3. Computer: Generate random choice
// 4. Compare player input to computer's choice
// 5. Output appropriate message (win/lose/tie)

// Input details:
// - Use char, not String
// - No nextChar() method available, see video for input method

// Valid inputs:
// R - Rock
// P - Paper
// S - Scissors
// L - Lizard
// K - Spock

// Hint for computer's choice:
// Generate random number 0-4, assign char based on result

// Naming convention:
// Rock_yourInitials.java (replace 'yourInitials' with your actual initials)

// Game rules:
// - Scissors cuts Paper
// - Paper covers Rock
// - Rock crushes Lizard
// - Lizard poisons Spock
// - Spock smashes Scissors
// - Scissors decapitates Lizard
// - Lizard eats Paper
// - Paper disproves Spock
// - Spock vaporizes Rock
// - Rock crushes Scissors