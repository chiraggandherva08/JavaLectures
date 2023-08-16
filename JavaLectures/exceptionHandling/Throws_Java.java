package exceptionHandling;

public class Throws_Java {

    // a method can throw an exception.
    public static void printX (char x) throws Exception {
        if (x == 'x') {
            System.out.println('X');
        } else {
            throw new Exception("Entered value is not 'x'");
        }
    }

    public static void main(String[] args) {
    }
}
