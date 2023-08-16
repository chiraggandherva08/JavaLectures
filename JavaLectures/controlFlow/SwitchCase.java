package controlFlow;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        sc.close();

        switch (name) {
            case "chirag":
                System.out.println("Your name is chirag gandherva");
                break;
            case "vivek" :
                System.out.println("Your name is vivek dahiya");
                break;
            case "ayush" :
                System.out.println("Your name is ayush kumar singh");
                break;
            case "saurav" :
                System.out.println("Your name is saurav raj");
                break;
            default :
                System.out.println("fuck off!..............");
        }
    }
}
