package controlFlow;

public class Switch_Continue {

    public static void main(String[] args) {
        // break; will stop all the iteration if the condition satisfied
        for (int i = 0; i < 40; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }

        // continue; will stop current iteration if the condition is satisfied and jump to the next iteration
        for (int i = 0; i < 40; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
