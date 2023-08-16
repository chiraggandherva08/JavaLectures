package controlFlow;

public class Loops {

    public static void main(String[] args) {

        // forLoop
        for(int i=1; i<=100; i++) {
            System.out.print(i + " ");
        }

        // whileLoop
        int count = 0;
        while(count <100) {
            System.out.print(count + " ");
            count++;
        }

        // doWhileLoop
        count = 0;
        do {
            System.out.print(count + " ");
        }while (count < 100);
    }
}
