package InClass;

public class Ounces {
    public static void main(String[] args) {
        int Gallons, HalfGallons, Quarts, Pints, Cups, Ounces;

        Ounces = 123;
        Gallons = Ounces / 128;
        Ounces = Ounces % 128;

        HalfGallons = Ounces / 64;
        Ounces = Ounces % 64;

        Quarts = Ounces / 32;
        Ounces = Ounces % 32;

        Pints = Ounces / 16;
        Ounces = Ounces % 16;

        Cups = Ounces / 8;
        Ounces = Ounces % 8;

        System.out.printf("Gallons: %d%nHalfGallons: %d%nQuarts: %d%nPints: %d%nCups: %d%nCups: %d%n", Gallons, HalfGallons, Quarts, Pints, Cups, Ounces);


    }
}// main method