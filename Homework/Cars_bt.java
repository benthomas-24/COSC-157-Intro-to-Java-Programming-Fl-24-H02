package Homework;
import java.util.Scanner;
public class Cars_bt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }

    static void startGame() {
        Scanner input = new Scanner(System.in);
        boolean gameOver = true;
        do /*game begins*/ {
            gameOver = false;
            System.out.println("---- Let’s Play the Moving Day Game ----");
            System.out.print("\nPlease enter the number of Chevys: ");
            int numberOfChevys = Integer.parseInt(input.nextLine());
            System.out.print("\nPlease enter the number of Fords: ");
            int numberOfFords = Integer.parseInt(input.nextLine());
            int totalPositions = numberOfFords + numberOfChevys + 1;
            String[] positions = new String[totalPositions];

            for (int i = 0; i < positions.length; i++) {
                if (i < numberOfFords) {
                    positions[i] = "F";
                } else if (i == numberOfFords) {
                    positions[i] = "";  // Empty space in the middle
                } else {
                    positions[i] = "C";
                }
            }
            for (int i = 0; i < positions.length; i++) {
                if (i == 0) {
                    System.out.print("  " + i + "  ");
                } else {
                    System.out.print(" " + i + "  ");
                }
            }
            System.out.println();
            for (int i = 0; i < positions.length; i++) {
                if (i == 0) {
                    System.out.print("| " + positions[i] + " | ");
                } else if (positions[i].equals("F") || positions[i].equals("C")) {
                    System.out.print(positions[i] + " | ");
                } else {
                    System.out.print("  | ");
                }
            }
            System.out.println();
        }
        while (!gameOver);
    }
}

// there are c Chevys on c squares, f Fords on f squares, and one empty square for a total of c + f + 1 squares
// the Chevys start out on the right, the Fords start out on the left, the empty square is in the middle
// there are two moves JUMP and SLIDE
// a Chevy can JUMP over a Ford or Chevy onto an empty stone
// a Ford can JUMP over a Chevy onto an empty stone
// a Chevy or Ford can slide onto an empty stone
// Chevys can ONLY move left, Fords can ONLY move right
// the user WINS when the Chevys occupy the left most f squares, the Fords occupy the rightmost f squares, and the empty square is in the middle
// the user LOSES when the user can't make any more moves and the winning condition hasn't been satisfied