package Homework;

import java.util.Random;

public class CarnivalGame_bt {
    public static void main(String[] args) {
        int wins = 0;
        for(int i = 0; i < 100; ++i) {
            int sixSidedDie = dieRoll(6);
            int twentySidedDie = dieRoll(20);
            int eightSidedDie = dieRoll(8);
            int fourSidedDie = dieRoll(4);
            int twelveSidedDie = dieRoll(12);
            int total = sixSidedDie + twentySidedDie + eightSidedDie + fourSidedDie + twelveSidedDie;
            if(total < 20 || total > 35){
                ++wins;
            }
        }
        System.out.printf("You have won %d out of 100 games", wins);
    }
    public static int dieRoll(int x){
        Random rng = new Random();
        return rng.nextInt(x)+1;
    }
}
