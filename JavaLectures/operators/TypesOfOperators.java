package operators;

public class TypesOfOperators {

    public static void main(String[] args) {

        /*  type of arithmetic operators->
                * multiply
                + addition
                - subtraction
                / division
                % modulus - it gives the remainder (note that % operator can only be used with integers)

                x++ : post increment operator will first execute the line and the x will be increased by 1
                ++x : pre increment operator will first increase x by one
                x-- : post decrement operator
                --x : pre increment operator    */

        int a = 0;
        System.out.println("1 + 3 = " + (1+3));
        System.out.println("1 - 3 = " + (1-2));
        System.out.println("2 * 3 = " + 2*3);
        System.out.println("3 / 4 = " + 3/4);
        System.out.println("5 % 3 = " + 5%3);
        System.out.println("The value of a++ is " + a++);
        System.out.println("The value of a-- is " + a--);
        System.out.println("The value of ++a is " + ++a);
        System.out.println("The value of --a is " + --a);

        /*  Assignment Operators --> used to assign values to variables
            = , += , -= , *= , /= , %=
        */
        int x = 3;
        x += 12;
        System.out.println(x);


        /*  relational / comparison operators
                == , != , >= , <= , > , <
            they return 0 if false and 1 if true  */

        System.out.println("Following are the comparison operators in C++");
        System.out.println("The value of a == b is " + (a==x));
        System.out.println("The value of a != b is " + (a!=x));
        System.out.println("The value of a >= b is " + (a>=x));
        System.out.println("The value of a <= b is " + (a<=x));
        System.out.println("The value of a > b is " + (a>x));
        System.out.println("The value of a < b is " + (a<x));

        /*  Logical operators
                && , || , !    */
        System.out.println("Following are the logical operators in C++");
        System.out.println("The value of this logical and operator ((a==b) && (a<b)) is:" + ((a==x) && (a<x)));
        System.out.println("The value of this logical or operator ((a==b) || (a<b)) is:" + ((a==x) || (a<x)));
        System.out.println("The value of this logical not operator (!(a==b)) is:" + (!(a==x)));
    }
}
