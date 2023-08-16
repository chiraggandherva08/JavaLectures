package outputFormatting;

public class Formatting {

    public static void main(String[] args) {

        /*  • Int ("%d"): 32 Bit integer
            • Long ("%ld"): 64 bit integer
            • Char ("%c"): Character type
            • Float ("%f"): 32 bit real value
            • Double ("%lf"): 64 bit real value     */

        int a = 20;
        float b = 9.125f;
        char c = 'i';

        // formatting using System.out.printf() method.
        // System.out.printf() do not add \n at the end by default.
        System.out.printf("%c am chirag gandherva\n", c);
        System.out.printf("my age is %d\n", a);
        // System.out.format() is same as System.out.printf() method.
        System.out.format("i got %f cgpa\n ", b);
    }
}
