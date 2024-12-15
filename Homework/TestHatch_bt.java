package Homework;

public class TestHatch_bt {
    public static void main(String[] args) {

        Hatch h1 = new Hatch("Main");
        Hatch h2 = new Hatch("Upper");
        Hatch h3 = new Hatch("Lower");
        Hatch h4 = new Hatch("Poop");
        System.out.println("H1:\n");
        h1.unseal();
        h1.open();
        System.out.println();
        System.out.println("H3:\n");
        h3.unseal();
        h3.open();
        h3.seal();
        System.out.println();
        System.out.println("H4:\n");
        h4.unseal();
        System.out.println();

        System.out.println();
        System.out.println("The \"Main\" Hatch should be open and unsealed.");
        System.out.println("Information for hatch: " + h1.deck);
        System.out.println("Closed: " + h1.isClosed());
        System.out.println("Sealed: " + h1.isSealed());
        System.out.println();

        System.out.println("The \"Upper\" Hatch should be closed and sealed.");
        System.out.println("Information for hatch: " + h2.deck);
        System.out.println("Closed: " + h2.isClosed());
        System.out.println("Sealed: " + h2.isSealed());
        System.out.println();

        System.out.println("The \"Lower\" Hatch should be open and sealed.");
        System.out.println("Information for hatch: " + h3.deck);
        System.out.println("Closed: " + h3.isClosed());
        System.out.println("Sealed: " + h3.isSealed());
        System.out.println();

        System.out.println("The \"Poop\" Hatch should be closed and unsealed.");
        System.out.println("Information for hatch: " + h4.deck);
        System.out.println("Closed: " + h4.isClosed());
        System.out.println("Sealed: " + h4.isSealed());
    }
}