package operators;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1");
        int num1 = sc.nextInt();
        System.out.print("Enter num2");
        int num2 = sc.nextInt();

        int res = (num1 > num2) ? (num1 + num2) : (num1 - num2);

        // Since num1<num2
        // the second operation is performed
        // res = num1-num2 = -10

        System.out.println("The value of res is: " + res);
    }
}
