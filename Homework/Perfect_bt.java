package Homework;
import static java.lang.Math.sqrt;

public class Perfect_bt {
    public static void main(String[] args) {
        for(int i = 2; i <= 10000; ++i){
            int sum = 1;
            for(int n = 2; n<=(int)sqrt(i); ++n){
                if (i % n == 0){
                    sum += n;
                    if(n != i/n){
                        sum += i/n;
                    }
                }
            }
            if(sum == i){
                System.out.printf("%d is a perfect number%n", i);
            }
        }
    }
}