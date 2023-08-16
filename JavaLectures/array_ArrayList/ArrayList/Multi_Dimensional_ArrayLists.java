package array_ArrayList.ArrayList;

import java.util.ArrayList;

public class Multi_Dimensional_ArrayLists {

    public static void main(String[] args) {

        // Creating a multi-dimensional ArrayList.
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // adding new ArrayList at the end of the original ArrayList.

        for (int i=0 ; i < 10 ; i++) {
            list.add( new ArrayList<>() ); // Here giving the datatype is not mandatory.
        }

        for (int i=0 ; i < 10 ; i++) {
            for (int j=0; j< i; j++) {
                list.get(i).add(i);
            }
        }

        System.out.println(list);
    }
}
