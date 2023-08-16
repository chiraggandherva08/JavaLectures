package array_ArrayList.Array;

public class EqualArrays {

    public static void main(String[] args) {

        int[] x = new int[]{1, 2, 3};
        int[] y = new int[]{1, 2, 3};
        System.out.println(x.equals(y)); // they are not equal.

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(b == a); // they are not equal.
    }
}
