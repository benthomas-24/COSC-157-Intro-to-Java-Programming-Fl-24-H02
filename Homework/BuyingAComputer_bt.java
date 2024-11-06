package Homework;

// Available computer specs:
// double terraBytesOfRam = 1;
// double screenSize = 13;
// double terraBytesOfStorage = 8;
// double coreCPU = 8;
public class BuyingAComputer_bt {
    public static final double terraBytesOfRam = 1;
    public static final double screenSize = 13;
    public static final double terraBytesOfStorage = 8;
    public static final double coreCPU = 8;
    public static void main(String[] args) {
        System.out.printf("%b%n", Yogi());
        System.out.printf("%b%n", BooBoo());
        System.out.printf("%b%n", WileECoyote());
        System.out.printf("%b%n", Roadrunner());
        
    }
    public static boolean Yogi(){
       int yogiTerraBytesOfRam =  1;
       int yogiScreenSize = 13;
       int yogiTerraBytesOfStorage =  8;
       int yogiCoreCPU = 8;
     
      return yogiTerraBytesOfRam <= terraBytesOfRam && 
             yogiScreenSize <= screenSize && 
             yogiTerraBytesOfStorage <= terraBytesOfStorage && 
             yogiCoreCPU <= coreCPU;
    }

    public static boolean BooBoo() {
        int booTerraBytesOfRam = 1;
        int booScreenSize = 15; // Can be 13 or 15
        int booTerraBytesOfStorage = 16; // Can be 8 or 16
        int booCoreCPU = 16; // Can be 8 or 16

        return booTerraBytesOfRam <= terraBytesOfRam &&
               (booScreenSize == 13 || booScreenSize == 15) &&
               (booTerraBytesOfStorage == 8 || booTerraBytesOfStorage == 16) &&
               (booCoreCPU == 8 || booCoreCPU == 16);
    }

    public static boolean WileECoyote() {
        int wileTerraBytesOfRam = 2;
        int wileScreenSize = 13;
        int wileTerraBytesOfStorage = 8;
        int wileCoreCPU = 8;

        return wileTerraBytesOfRam <= terraBytesOfRam &&
               wileScreenSize <= screenSize &&
               wileTerraBytesOfStorage <= terraBytesOfStorage &&
               wileCoreCPU <= coreCPU;
    }

    public static boolean Roadrunner() {
        int roadrunnerTerraBytesOfRam = 2;
        int roadrunnerScreenSize = 15; // Can be 13 or 15
        int roadrunnerTerraBytesOfStorage = 16; // Can be 8 or 16
        int roadrunnerCoreCPU = 16; // Can be 8 or 16

        return roadrunnerTerraBytesOfRam <= terraBytesOfRam &&
               (roadrunnerScreenSize == 13 || roadrunnerScreenSize == 15) &&
               (roadrunnerTerraBytesOfStorage == 8 || roadrunnerTerraBytesOfStorage == 16) &&
               (roadrunnerCoreCPU == 8 || roadrunnerCoreCPU == 16);
    }
}

// Homework: Buying a Computer
// Due: Oct 16 by 11:59pm

// Computer specifications:
// - terraBytesOfRam
// - screenSize
// - terraBytesOfStorage
// - coreCPU


// Requirements for each character:

// Yogi:
// - terraBytesOfRam: 1
// - screenSize: 13
// - terraBytesOfStorage: 8
// - coreCPU: 8

// Boo-Boo:
// - terraBytesOfRam: 1
// - screenSize: 13 or 15
// - terraBytesOfStorage: 8 or 16
// - coreCPU: 8 or 16

// Wile E. Coyote:
// - terraBytesOfRam: 2
// - screenSize: 13
// - terraBytesOfStorage: 8
// - coreCPU: 8

// Roadrunner:
// - terraBytesOfRam: 2
// - screenSize: 13 or 15
// - terraBytesOfStorage: 8 or 16
// - coreCPU: 8 or 16

// Key requirements:
// 1. Use boolean logic to determine if each character should buy the computer
// 2. Do not use nested if statements
// 3. Output whether each character should buy the computer
// 4. Complete the provided code (look for comments indicating where to add code)

// File naming convention:
// BuyingAComputer_yourInitials.java (replace 'yourInitials' with your actual initials)