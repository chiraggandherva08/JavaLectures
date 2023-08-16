package controlFlow;

import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        sc.close();

        switch (name) {
            case "chirag" -> {
                System.out.println("Your name is chirag gandherva");
            }
            case "vivek" -> {
                System.out.println("Your name is vivek dahiya");
            }
            case "ayush" -> {
                System.out.println("Your name is ayush kumar singh");
            }
            case "saurav" -> {
                System.out.println("Your name is saurav raj");
            }
            default -> {
                System.out.println("fuck off!..............");
            }
        }
    }
}