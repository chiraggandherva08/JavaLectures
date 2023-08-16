package operators;

public class operatorPrecedence {

    public static void main(String[] args) {
        // Precedence is the order of preference of the operator (higher to lower).
        // order :--> * / % (higher)
        // order :--> - + (lower)

        int precedence_associativity = 5*4 - 20*10 + 12%5;
        /*               -----------------> (direction of associativity)
         step 1. 5*4 will be calculated.
                = 20 - 20 * 10 + 12 % 5
                = 20 - 200 + 12 % 5
         step 2. 12%5 will be calculated.
                = 20 - 200 + 2
         step 3. 20-200 will be calculated.
                = -180 + 2
         step 4. -180+2 will be calculated.
                = -178                  */
        System.out.println("The sum will be -178 according to operator precedence and associativity");
        System.out.println(precedence_associativity);
    }
}
