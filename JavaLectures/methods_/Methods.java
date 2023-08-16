/*      SYNTAX :-->
            <access-modifier> <static / non-static> <return-type> <name>(arguments) {
                // return statement
            }
*/
package methods_;

public class Methods {

    // Returning String Array from a function.
    static String[] returnName() {
        return new String[]{"zero", "one" , "two", "three"};
    }

    public static void main(String[] args) {
        String[] names = returnName();

        for (String x : names) {
            System.out.println(x);
        }

    }
}
