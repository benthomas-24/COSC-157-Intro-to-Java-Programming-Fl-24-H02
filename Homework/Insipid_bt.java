package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Insipid_bt {
    public static final int minValue = 1;
    public static final int maxValue = 99;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Insipid_bt something = new Insipid_bt();
        int user_number = getValidIntInput(input, "Enter a number 1-99 to see if it is as Insipid number: ");
        is_insipid(user_number);

    }

    private static int getValidIntInput(Scanner input, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Integer.parseInt(input.nextLine());
                if (value >= minValue && value <= maxValue) {
                    return value;
                }
                System.out.printf("Please enter a value between %d and %d%n", minValue, maxValue);
            } catch (NumberFormatException e) {
                System.out.println("Please enter integer values only.");
            }
        }
    }

    private static void is_insipid(int original_number) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(original_number);

        int i = original_number;
        while (i != 58 && i != 1) {
            int result = 0;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                result += digit * digit;
                temp /= 10;
            }
            i = result;
            sequence.add(i);
        }
        System.out.print("The sequence starting at " + original_number + " is: ");
        for (int j = 0; j < sequence.size(); j++) {
            System.out.print(sequence.get(j));
            if (j < sequence.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        if (i == 1) {
            System.out.printf("%d is an insipid number%n", original_number);
        } else {
            System.out.printf("%d is not an insipid number%n", original_number);
        }
    }
}