package InClass;

public class phoneNumber {
    public static void main(String[] args) {
        int result = 0;
        int number = 1234567;
        int firstThreeDigits = number / 10000;
        int lastFourDigits = number % 10000;

//        result = (firstThreeDigits * 80);
//        result = result + 1;
//        result = result * 250;
//        result = result + lastFourDigits;
//        result = result + lastFourDigits;
//        result = result - 250;
//        result = result / 2;
        result = (((((((firstThreeDigits * 80) + 1) * 250) + lastFourDigits) + lastFourDigits) - 250 )/ 2);
        System.out.printf("The phone number is: %d%n", result);
    }
}