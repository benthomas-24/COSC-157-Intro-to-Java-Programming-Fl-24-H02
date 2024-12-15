package Homework;
public class Hatch {
    public String deck;
    public boolean sealed;
    public boolean closed;

    public Hatch() {
        deck = "unknown";
        closed = false; // Open
        sealed = false; // Unsealed
    }

    public Hatch(String deckPassed) {
        deck = deckPassed;
        closed = true;
        sealed = true;
    }

    public boolean isClosed() {return this.closed;}
    public boolean isSealed() {return this.sealed;}
    public void open(){
        if (this.closed && !this.sealed) {
            System.out.println("Hatch Now Opened!");
            this.closed = false;}
        else{
            if (!this.closed)
                System.out.println("Hatch is already open. You may not open an already open hatch.");
            else
                System.out.println("Hatch is sealed. You may not open a sealed hatch.");}
    }
    public void close(){
        if (!this.closed){
            System.out.println("Hatch Now Closed!");
            this.closed = true;}
        else
            System.out.println("Hatch is already closed. You may not close an already closed hatch.");
    }
    public void seal(){
        if (!this.sealed && this.closed){
            System.out.println("Hatch Now Sealed!");
            this.sealed = true;
        }
        else
            if(this.closed)
                System.out.println("Hatch is already sealed. You may not seal an already sealed hatch.");
            else
                System.out.println("The hatch is open. You may not seal an open hatch");
    }
    public void unseal(){
        if (this.sealed){
            System.out.println("Hatch Now Unsealed!");
            this.sealed = false;
        }
        else
            System.out.println("Hatch is already unsealed. You may not unseal an already unsealed hatch.");
    }
}