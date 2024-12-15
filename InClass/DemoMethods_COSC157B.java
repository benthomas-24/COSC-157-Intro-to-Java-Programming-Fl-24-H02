package InClass;

import java.sql.SQLOutput;

public class DemoMethods_COSC157B {
    public static void main(String[] args){
        hello();
        greeting("Fred");
        String firstName =  "ABC";
        greeting(firstName);
        System.out.println(add(3,9));
        System.out.println(add(5.5, 2.3));
        System.out.println(test(-9));
        offensive("foobar");
        offensive("Hello World");
    }
    public static void hello(){
        System.out.println("Hello");
    }
    public static void greeting(String namePassed){
        System.out.printf("It is nice to meet you %s!%n", namePassed);
    }
    public static int add(int n1, int n2){
        return n1 + n2;
    }
    public static int add(double n1, double n2){
        return (int)(n1 + n2);
    }
    public static int add(int n1, double n2){
        return (int)(n1 + n2);
    }
    public static int add(double n1, int n2){
        return (int)(n1 + n2);
    }
    public static String test(int n){
        if (n < 0){
            return "negative";
        }
        else {
            return "positive";
        }
    }
    public static void offensive(String word){
        if(!word.equals("foobar")){
            System.out.printf("%s is a nice word.%n", word);
        }
        else {
            return;
        }
    }
}
