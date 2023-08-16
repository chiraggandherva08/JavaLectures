package stringMethods.stringBuilders;

public class StringBuilders {

    /*      Strings are immutable and slower than StringBuliders.
            StringBuilders are mutable and faster than Strings.

            * - no need to import StringBulider class in java file, it is builtin .
    */

    public static void main(String[] args) {

        // Creating a StringBuilder
        StringBuilder name = new StringBuilder("Chirag");

        // StringBuilder.length() :--> returns the length of the StringBuilder.
        System.out.println( name.length() );


        // StringBuilder.append( subString ) Appending substring at the end of the string , changes real string.
        name.append( " " + "Gandherva" );
        System.out.println( name );


        // StringBuilder.charAt( index ) :--> returns the character at that index.
        System.out.println( name.charAt(2) );

        // StringBuilder.setCharAt( index , new-char ) :--> replaces the char at the given index by the given char.
        name.setCharAt(0, 'h');

        // StringBuilder.deleteCharAt(0) :--> delete the character at the index in the original string.
        StringBuilder str = new StringBuilder("delete index");
        str.deleteCharAt(6);

        // StringBuilder.insert( index , subString ) :--> Inserting new subString inside an existing string.
        name.insert(0, "Hello from ");
        System.out.println(name);


        // StringBuilder.delete( starting-index , ending-substring ) :--> delete substring at a given index range from original string.
        // ending index is excluded.
        StringBuilder newString = new StringBuilder("Hello");
        newString.delete(0, 2);
        System.out.println(newString);


        // StringBuilder.isEmpty() :--> returns true if it is empty else false. ( empty form of an string is --> "" ,not this--> " ").
        StringBuilder emptyStr = new StringBuilder("");
        System.out.println(emptyStr.isEmpty());

        // StringBuilder.reverse() :--> reverses the original String.
        name.reverse();
        System.out.println(name);


        // name.equals(name)
        // name.compareTo(name)
        // name.indexOf(null)
        // name.lastIndexOf(null)
        // name.replace(0, 0, null)
        // name.setLength(0);
        // name.substring(0, 0)
        // name.trimToSize();

        // stringBuilder ----- into numbers.
        // stringBuilder ----- reverse.
    }
}
