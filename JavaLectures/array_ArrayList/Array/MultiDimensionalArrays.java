package array_ArrayList.Array;

import java.util.Arrays;

public class MultiDimensionalArrays {

    /*      Important points while creating 2D array :->
                1. giving the number of rows in the declaration is mandatory.
                2. giving the number of columns in the declaration is not mandatory.

            Syntax ->
                <datatype>[][] <arrayName> = new <datatype>[no. of rows][];
    */

    public static void main(String[] args) {

        int[][] array = { // 2D array.

            { 1, 3, 5, 7 } ,
            { 9, 11, 13, 15 } , 
            { 17, 19, 21, 23 } , 
            { 25, 27, 29, 31 } 

        };

        // Accessing elements of an 2D array :->
        System.out.println( array[0][0] + " " + array[0][1] );

        // Printing 2D array
        System.out.println(
                "[ " 
                + Arrays.toString(array[0])
                + Arrays.toString(array[1])
                + Arrays.toString(array[2])
                + Arrays.toString(array[3])
                + " ]"
        );
    }
}