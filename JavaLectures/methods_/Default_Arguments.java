package methods_;

import java.util.Scanner;

public class Default_Arguments {

    public static void main(String[] args) {

        int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        String returnValue = voteEligibility(age);
        System.out.println(returnValue);
    }

    public static String voteEligibility(int age) {
        // here 18 is the default value of this argument number is a constant argument.
        if(age >= 18) {
            return "can vote";
        }
        else {
            return "can't vote";
        }
    }
}
