package methods_;

import java.util.Arrays;

public class VarArgs {

    // method ambiguity - when a method of varargs gets no arguments in the call
    // (during method overloading).

    // varargs are used when we don't know the number of arguments the function will
    // be needing.
    // example :-> sum of n number entered by the user.
    // Syntax: <function_name> (<datatype> ...x) {}
    // note that varArgs must be the end arguments.
    static void variableArgumentsInt(int... integers) {
        System.out.println(Arrays.toString(integers));
    }

    static void variableArgumentsString(String... strings) {
        System.out.println(Arrays.toString(strings));
    }

    static void addMultipleArgs(int year, int month, String name, int... randomNumber) { // can only be the end
                                                                                         // argument.
        System.out.println(year + "." + month + name + Arrays.toString(randomNumber));
    }

    public static void main(String[] args) {
        variableArgumentsInt(2, 3, 5, 5, 10, 11);
        variableArgumentsString("Hello", " ", "World");
        addMultipleArgs(2002, 12, "Chiraggandherva", 2002, 322, 23, 23);
    }
}
