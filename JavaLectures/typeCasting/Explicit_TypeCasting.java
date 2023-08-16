package typeCasting;

public class Explicit_TypeCasting {

    public static void main(String[] args) {
        /*  Java allows us to convert data of one type to that of another. This is known as type conversion.

            There are two types of type conversion in C++.
                *--> Implicit Conversion
                *--> Explicit Conversion (also known as Type Casting    */

        //    NOTE : the value of any operation between int and int will be int , ie. 3/4 will be 0
        System.out.println("3/4 = " + 3/4);
        //    NOTE : the value of any operation between int and float  or float and float will be float , ie. 3.0/4 or 3/4.0 will be 0.75
        System.out.println("(float)3/4 = " + (float)3/4);
        System.out.println("3.0/4 = " + 3.0/4);
        System.out.println("3/(float)4 = " + 3/(float)4);
        System.out.println("3/4.0 = " + 3/4.0);

        // typecasting format - int(variable_name)

        float x = 123.23432F;
        System.out.println("the value of x in float is: " + x);
        System.out.println("the value of x in int is: " + (int)x);

        //  type casting is not applicable on string to int or from int to string
    }
}
