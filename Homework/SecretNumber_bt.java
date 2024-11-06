package Homework;
public class SecretNumber_bt {
    public static final int maxNum = 9999;
    public static final int minNum = 1000;

    public static void main(String[] args) {
        secretNumber();
    }

    public static void secretNumber() {
        int i = 1001;
        while (i < maxNum && i > minNum) {
            if (i % 2 == 1 && sumOfNumber(i) == 27 &&  i/1000 == ((i/10)%10)*3 && areDigitsUnique(i) == true) {
                System.out.println(i);
            }
            ++i;
        }
    }

    public static int sumOfNumber(int num) {
        int total = 0;
        while (num > 0) {
            int n = num % 10;
            total += n;
            num = num/10;
        }
        return total;
    }
    static boolean areDigitsUnique(int num) {
        return String.valueOf(num).chars().distinct().count() >= num;
    }
}
// the number is a four digit number
// all four digits of the number are different
// the digit in the thousands place is three times the digit in the tens place
// the number is odd GOOD
// the sum of the digits in the number is 27 GOOD
