package controlFlow;

public class EnhancedForLoop {

    public static void main(String[] args) {

        String[] pairs = {"aA", "bB", "cC", "dD", "eE", "eE"};

        // Enhanced ForLoop for String
        for(String name: pairs) {
            System.out.println(name);
        }

        int[] num_s = {0, 1, 2, 3, 4, 5, 6, 7};
        // Enhanced ForLoop for integer
        for(int number: num_s) {
            System.out.println(number);
        }

        char[] characters = {'C', 'h', 'i', 'r', 'a', 'g', ' ', 'G', 'a', 'n', 'd', 'h', 'e', 'r', 'v', 'a'};
        // Enhanced ForLoop for char
        for(char ch: characters) {
            System.out.println(ch);
        }
    }
}
