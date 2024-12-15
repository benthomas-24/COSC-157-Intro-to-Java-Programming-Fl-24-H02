import java.util.Scanner;
public class Dog{
    //instance variables
    String name;
    String breed;
    int age;
    boolean bites;

    //constructors
//public, same name as class, non-static, no return type, give value to all variables
//default constructor ie takes no args
    public Dog() {
        name = "unknown";
        breed = "unknown";
        age = 0;
        bites = false;
    }//end method

    //non- default constructor ie takes  args
    public Dog(String namePassed, String breedPassed, int agePassed, boolean bitesPassed) {
        name = namePassed;
        breed = breedPassed;
        age = agePassed;
        bites = bitesPassed;
    }//end method


    public boolean equals(Dog dogPassed) {
        return
                this.name.equals(dogPassed.name) &&
                        this.age == dogPassed.age &&
                        this.breed.equals(dogPassed.breed) &&
                        this.bites == dogPassed.bites;
    }//end method

    public String toString() {
        return
                "\nName: " + this.name +
                        "\nAge: " + this.age +
                        "\nBreed: " + this.breed +
                        "\nBites: " + this.bites;
    }//end method

    public int getAge() {
        return this.age;
    }//end method

    public void setName(String namePassed) {
        this.name = namePassed;
    }//end meothod
    public static void setAge(int agePassed){
        Scanner input = new Scanner(System.in);
        while(agePassed < 0 || agePassed > 33) {
            System.out.println("Invalid age. Please enter 0 - 33.");
            agePassed = input.nextInt();
        }
    }
    public void setBites(boolean bitesPassed){
        this.bites = bitesPassed;
    }//
    public void bark(){
        System.out.println("Woof! Woof!");
    }
//    public boolean equals(Dog dogPassed){
//        return this.name.equals(dogPassed.name) &&
//        this.age == dogPassed.age &&
//        this.breed.equals(dogPassed.breed) &&
//        this.bites == dogPassed.bites;
//    }
}