package JA;

public class FSI {

    final int finalNumber = 10; // Declared the final variable
    static int staticNumber = 0; // Declared the static variable
    int instanceNumber = 0; // Declared the instance variable

    void showFinal() {
        System.out.println("Final number: " + finalNumber);
        // finalNumber = 20; //it would give a compile error if not commented out because final variable cannot be reassigned
    }

    void addStatic() {
        staticNumber++; //inceases the static variable by 1
    }

    void addInstance() {
        instanceNumber++; //increases the instance variable by 1
    }

    public static void main(String[] args) { //main method
        // one is a variable that refers to a new FSI object.
        FSI one = new FSI();

        // two is another variable that refers to a different FSI object.
        FSI two = new FSI();

        // Prints the heading for the final variable section.
        System.out.println("FINAL VARIABLE");
        // Calls the showFinal method using the one object.
        one.showFinal();

        // Prints the heading for the static variable section.
        System.out.println("\nSTATIC VARIABLE");
        one.addStatic();
        two.addStatic();
        // Prints the shared static value.
        System.out.println("Static number: " + staticNumber);

        // Prints the heading for the instance variable section.
        System.out.println("\nINSTANCE VARIABLE");
        one.addInstance();
        one.addInstance();
        two.addInstance();
        // Prints the separate value belonging to the one object.
        System.out.println("One's instance number: " + one.instanceNumber);
        // Prints the separate value belonging to the two object.
        System.out.println("Two's instance number: " + two.instanceNumber);
    }
}