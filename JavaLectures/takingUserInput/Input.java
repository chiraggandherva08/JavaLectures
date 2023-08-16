package takingUserInput;

import java.util.Scanner;

// Step 1. import java.util.Scanner;
// Step 2. creating object of Scanner.
// Step 3. taking input.

public class Input {

    public static void main(String[] args) {

        Scanner scannerObj= new Scanner(System.in); // creating Scanner object.

        int integer = scannerObj.nextInt(); // Taking integer input.
        double dou = scannerObj.nextDouble();
        float flo = scannerObj.nextFloat();
        long longInt = scannerObj.nextLong();
        short sh = scannerObj.nextShort();
        byte by = scannerObj.nextByte();

        System.out.println(
            integer + " , " + dou + " , " + flo + " , " + longInt + " , " + sh + " , " + by + " , "
        );


        char character = scannerObj.nextLine().charAt(0); // Taking char input.
        String string = scannerObj.nextLine();
        boolean bool = scannerObj.nextBoolean(); // Taking boolean input.

        System.out.println(character + " , " + string + " , " + bool);

        scannerObj.close();
    }
}
