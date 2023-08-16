package typeCasting;

public class Implicit_TypeCasting {

    public static void main(String[] args) {
        /*  Implicit Type Conversion :-->
         - The type conversion that is done automatically done by the compiler is known as implicit type conversion. This type of conversion is also known as automatic conversion.
            Let us look at two examples of implicit type conversion.

            DATATYPE hierarchy
                * double
                * float
                * long
                * int
                * short
                * char

        the datatype in the above list will be directly converted(implicit conversion ) into the datatype on the top of that
        */

        // assigning an int value to num_int
        int num_int = 9;
        // declaring a double type variable
        double num_double;
        // implicit conversion
        // assigning int value to a double variable
        num_double = num_int;
        System.out.println("num_int = " + num_int);
        System.out.println("num_double = " + num_double);
    }
}
