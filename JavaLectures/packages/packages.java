package packages;

public class packages {

    public static void main(String[] args) {
        /*  Packages are used to group similar classes into one directory.
            we can use one class inside another class as long as they are the part same package.    */

        methods_in_other_class obj = new methods_in_other_class();
        obj.printNames();
        obj.printAges();
    }
}
