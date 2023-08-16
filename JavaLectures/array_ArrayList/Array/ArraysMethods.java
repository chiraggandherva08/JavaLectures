package array_ArrayList.Array;

//import java.util.Arrays;

public class ArraysMethods {
    
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 20, 11, 23, 18, 8, -1};
        
        // Returns a string showing the array. 
        Arrays.toString(array);

        // Returns a copy of the given array from starting and ending index.
        int[] arrCpy = Array.copyOfRange(array, 0, array.length/2); 
    }
}
