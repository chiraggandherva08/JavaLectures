package stringMethods.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Search_in_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print("Enter the character: ");
        char c =sc.next().charAt(0);

        // Using normal for-loop.
        for( int i=0; i<str.length(); i++) {
            if(c == str.charAt(i)){
                System.out.println("The index is: " + i);
            }
        }

        // Using Enhanced for loop.
        int count = 0;
        for(char elem : str.toCharArray()) {
            if(elem == c) {
                System.out.println("The index is: " + count);
            }
            count++;
        }
    }

}
