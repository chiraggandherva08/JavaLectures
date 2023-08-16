package methods_;

public class MethodOverloading {

    // when function of same names are defined in the same scope we use method overloading.
    // the function must have different types or number of argument.
    static void function(String name) {
        System.out.println( "Your name is " + name );
    }
    static void function(int age) {
        System.out.println( "Your age is " + age );
    }

    public static void main(String[] args) {
        function("Java"); // this will call the method which will print name.
        function(27); // this will call the method which will print age.
    }
}
