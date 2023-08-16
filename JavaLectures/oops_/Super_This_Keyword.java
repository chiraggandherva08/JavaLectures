package oops_;

/*      In intended classes , super function will return the value of variable passed in the outermost class.
            Syntax :-->     super(a);
*/

// Outer Class
class FirstClass {

    String name;
    int age;
    float boardsPercentage;

    public void printInfo () {
        System.out.println("Name: " + this.name + " , Age: " + this.age + " , Boards percentage: " + this.boardsPercentage);
    }
    FirstClass (String name, int age, float boardsPercentage) {
        this.name = name;
        this.age = age;
        this.boardsPercentage = boardsPercentage;
    }

    // Inner Class
    static class SecondClass {

        String name;
        int age;
        float boardsPercentage;

        public void printInfo () {
            System.out.println("Name: " + this.name + " , Age: " + this.age + " , Boards percentage: " + this.boardsPercentage);
            // System.out.println("Name: " + super(name) + " , Age: " + this.age + " , Boards percentage: " + this.boardsPercentage);
        }

        SecondClass (String name, int age, float boardsPercentage) {
            this.name = name;
            this.age = age;
            this.boardsPercentage = boardsPercentage;
        }
    }
}

public class Super_This_Keyword {
    public static void main(String[] args) {

        FirstClass fc = new FirstClass("Chirag Gandherva", 20, 80.124f);
        fc.printInfo();

        FirstClass.SecondClass sc = new FirstClass.SecondClass("Vivek Dahiya", 19, 93.5f);
        sc.printInfo();
    }
}
