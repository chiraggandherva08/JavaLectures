package array_ArrayList.Array;

/*      if we change array in the method the original array will also be changes.

        Syntax :->
            in method creation :        
                <method-name> (<datatype>[] array) {
                }

            passing an array in method call :
                <method-name> (<array-name>);
*/

public class PassingArraysToMethods {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 21, 21};
        passArray(array); // passing an array to a method.
    }

    static void passArray (int[] array) {
        array[3] = 10000; // this will change the original array also.
    }

}
