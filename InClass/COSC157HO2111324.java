package InClass;
import java.util.Arrays;
import java.util.Random;

public class COSC157HO2111324 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[][] board = new int[3][];
        highLow(board);
    }
    public static void  populateArray(int[][] arrayPassed){
        Random rng = new Random();
        Arrays.asList();
        for(int r = 0; r < arrayPassed.length; ++r){
            for(int collum = 0; collum < arrayPassed[r].length; ++collum){
                arrayPassed[r][collum] = rng.nextInt(101);
            }
        }
    }
    public static void printArray(int[][] arrayPassed){
        for(int[] row : arrayPassed){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void highLow(int[][] arrayPassed){
        int[][] copy = copy2DArray(arrayPassed);
        for(int r = 0; r < arrayPassed.length; ++r){
            Arrays.sort(copy[r]);
            System.out.println("Student: " + r);
            System.out.println("Low: " + copy[r][0]);
            System.out.println("High: " + copy[r][copy[r].length - 1]);
        }
    }
    public static int[][] copy2DArray(int[][] arrayPassed){
        int[][] copy = new int[arrayPassed.length][];
        for(int row = 0; row < arrayPassed.length; ++row){
            copy[row] = Arrays.copyOf(arrayPassed[row], arrayPassed[row].length);
        }
        return copy;
    }
}