package array_ArrayList.ArrayList;

// All the ArrayList methods are inside this->
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        /*  Need of ArrayList ->
                    1 - arrays in java are of fixed length.
                    2 - arrayList in java are of variable length ( we can add more item at the end or in middle also ).
                    3 - forEach loop also works in ArrayList.

            Note :-
                    ArrayLists are slower than array.

            Working of an ArrayList :
                    1. when 50 % of the initial size of the ArrayList is full it will create new
                        ArrayList internally of double the initial length and copy all the values
                        to it this goes on and on.
                    2. The old ArrayList will be deleted.
        */

        // 1*   Declaring an ArrayList :-->
        ArrayList<Integer> list = new ArrayList<>();
        // we can also specify the initial size while creating ArrayList :-->
        ArrayList<String> StringArrayList = new ArrayList<>(12);
        System.out.println( StringArrayList );

        // 2*   AL.add( value ) :--> Adds new element at the end of the ArrayList.
        list.add(1);

        // 3*   AL.set( index , value ) :--> Change existing value at a given index if exists ( else an error ).
        list.set( 0 , 18000);
        System.out.println(list);

        // 4*   AL.clear() :--> deletes all the elements of the ArrayList.
        list.clear();
        System.out.println(list);

        // 5*   Printing an ArrayList :->
        System.out.println( list );

        // 6*   AL.clone() :--> will return exact same ArrayList.
        System.out.println( list.clone() );

        // 7*   AL.contains( value ) :--> returns true if it contains else false.
        System.out.println( list.contains(100) );

        // 8*   AL.get( index ) :--> returns the element at the given index.
        // we cannot do like this :- AL[0] = 12 or int x = AL[6];
        list.add(8264);
        System.out.println(list.get( 0 ));

        // 9*   AL.remove() :--> removes the element at the given index.
        list.remove( 0 );

        // 10*  AL.sublist() :--> returns sublist from starting-index to end-index ( last index is excluded).
        list.add(0); list.add(1); list.add(2); list.add(4); list.add(4); list.add(5);
        System.out.println( list.subList(0, 5) );

        // 11*  AL.indexOf( element ) :--> returns the index of the first occurrence of the given element ( if not found returns -1).
        System.out.println( list.indexOf( 4 ) );

        // 12*  AL.isEmpty() :--> returns false is not empty & true if empty.
        System.out.println( list.isEmpty() );

        // 13*  AL_1.equals(Al_2) :--> compares two ArrayLists and return true if equal and false if not equal.
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(1);
        lst.add(2);
        lst.add(5);
        lst.add(4);
        lst.add(5);
        System.out.println( list.equals( lst ) );

        // 14*  AL.lastIndexOf( element ) :--> returns the last index of the element given.
        System.out.println( list.lastIndexOf(4) );

        // 15* AL.addAll(AL2) :--> used to add all the elements of another ArrayList into initial ArrayList.
        ArrayList<Integer> initialList = new ArrayList<>();
        initialList.addAll(lst);


        // AL.sort()
        // AL.removeAll();
        // list.forEach();
        // list.toArray();
        // list.replaceAll();
        // list.toString()
    }
}
