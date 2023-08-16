package array_ArrayList.Array;

public class JaggedArray {

    // any multidimensional array in which the length of the row is not fixed is called jagged array.
    public static void main(String[] args) {
        
        // Example of jagged array.
        int[][] Jagged = {
            { 1 , 2 , 3 , 5 , 10 },
            { 4 , 53 , 45 },
            { 10 , 34 , 19 , 90 , 32 , 12 }
        };

        // Printing a jagged array.
        for (int[] x: Jagged) {
            for (int y : x) {
                System.out.print( y + ",");
            }
            System.out.println();
        }
    }    
}
