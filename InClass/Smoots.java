package InClass;
public class Smoots {
    public static void main (String[] args){
        int feet = 6, inches = 1;
        int inchesInASmoot = 67;
        double yourHeightInSmoots = (feet * 12 + inches);

        System.out.printf("Your height in smoots is %.2f%n", yourHeightInSmoots / inchesInASmoot);
    }
}