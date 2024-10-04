package InClass;

import java.util.Scanner;

public class IntroToJavaBaseball
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    final int TICKET = 100, PARK = 50, BOOK = 5, FINE = 500;
    int evenInnings, oddInnings;
    System.out.println("Enter the number of innings: ");
    int innings = Integer.parseInt(input.nextLine());
    final double COST_PER_BEER = 15.50, COST_PER_HOTDOG = 9.50;
    double totalCostBeers, totalCostHotdogs, totalCostGame;

    evenInnings = innings / 2;
    //oddInnings = innings - evenInnings;
    oddInnings =  innings / 2 +  innings % 2;

    System.out.println(evenInnings);
    System.out.println(oddInnings);

    totalCostBeers = evenInnings * COST_PER_BEER;
    totalCostHotdogs = oddInnings * COST_PER_HOTDOG;

    totalCostGame = TICKET + PARK + BOOK + FINE + totalCostBeers + totalCostHotdogs;
    System.out.println(totalCostGame);

}//end main
}//end class
