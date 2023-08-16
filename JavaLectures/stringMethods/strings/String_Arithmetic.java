package stringMethods.strings;

public class String_Arithmetic {

    public static void main(String[] args) {
        /*  we can add two or more string by the use of addition operator.
               no other operation can be performed on a string.

                acceptable operation: +
                not acceptable operation: - , / , * , % .                   */

        String firstWord = "Hello";
        String separator = " ";
        String lastWord = "World";

        String fullWord = firstWord + separator + lastWord;

        System.out.println(fullWord);
    }
}
