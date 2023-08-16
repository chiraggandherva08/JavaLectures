package exceptionHandling;

import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int num = input.nextInt();
            System.out.println(num);
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
