package array_ArrayList.Array;

import java.util.Arrays;

// All the array functions are written the Arrays class ( import java.util.Arrays; ).
// import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

    /*      declaring Array by different methods :->
                1. datatype[] variableName = {value1, value2, value3, ...... } ;
                2. datatype[] variableName = new datatype[ size ] ;
                3. datatype[] variableName = new datatype[] {value1, value2, value3, ......} ;

            creation and memory allocation of arrays:->
                * - array in cpp and c are stored in continuous fashion.
                * - array in java are stored in Heap Memory.
                * - Heap memory objects can be continuous or non-continuous.
                * - array in java are stored in continuous or non-continuous fashion depending on the JVM.
    */

        int[] array; // declaration of an array.
        array= new int[5]; // initialization of the array.
        array[0]=3; array[1]=12; array[2]=2; array[3]=54; array[4]=23; // Assigning values to the array.

        /*  NOTE :- 
                1* if you don't store any value in the array, the default value is the default value of the datatype of the
                datatype declared for than array.
                ( String - null , char - ' ' , int - 0 , float - 0.0 , boolean - false ).

                2* null can only be assigned to a non-primitive datatype.
        */

        // Printing arrays with the help of the Arrays class :->
        System.out.println( Arrays.toString(array) );

        // Length of arrays and strings :->
        // array.length; -> returns the length of the array.
        // String.length(); -> return the length of the string.

    }
}
