package Homework;
public class PrimeMethods_bt {
    public static boolean determineIfPrime(int valuePassed) {
        boolean isPrime = true;
        if (valuePassed < 2)
            isPrime = false;
        else if (valuePassed == 2)
            isPrime = true;
        else
            for (int i = 2; i < Math.sqrt(valuePassed) + 1; ++i) {
                if (valuePassed % i == 0)
                    return false;
            }//end for loop
        return isPrime;
    }//end method
    public static boolean isSophieGermainPrime(int p) {
     return determineIfPrime(p) && determineIfPrime(2*p + 1);
    }
    public static boolean isTwinPrime(int p){
        return determineIfPrime(p) && determineIfPrime(p + 2);
    }
    public static boolean isSafePrime(int p){
        return determineIfPrime(p) && determineIfPrime((p - 1)/2);

    }
}