// Parent class
class GradePerformance {

    // This method can be overridden by child classes
    void gradePerformanceScore() {
        System.out.println("Calculating grade performance...");
    }
}


// Child class 1
class MathsGrades extends GradePerformance {

    // Overriding the parent method
    @Override
    void gradePerformanceScore() {
        int score = 85;

        System.out.println("Maths Score: " + score);
        System.out.println("Maths Grade: A");
    }
}


// Child class 2
class JavaGrades extends GradePerformance {

    // Overriding the parent method
    @Override
    void gradePerformanceScore() {
        int score = 75;

        System.out.println("Java Score: " + score);
        System.out.println("Java Grade: B");
    }
}


// Child class 3
class EnglishGrades extends GradePerformance {

    // Overriding the parent method
    @Override
    void gradePerformanceScore() {
        int score = 65;

        System.out.println("English Score: " + score);
        System.out.println("English Grade: C");
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        // The parent class reference can hold different child objects
        GradePerformance maths = new MathsGrades();
        GradePerformance java = new JavaGrades();
        GradePerformance english = new EnglishGrades();

        // The same method is called, but each class behaves differently
        maths.gradePerformanceScore();
        java.gradePerformanceScore();
        english.gradePerformanceScore();
    }
}


/*
QUESTION:
1. Which Behaviour does this ability show?

ANSWER:
This ability shows POLYMORPHISM.

Polymorphism means "many forms".

In this program, GradePerformance is the parent class,
while MathsGrades, JavaGrades and EnglishGrades are child classes.

All the child classes have the same method:
    gradePerformanceScore()

However, each child class gives the method its own implementation.

For example:
    MathsGrades -> calculates/displays Maths performance
    JavaGrades -> calculates/displays Java performance
    EnglishGrades -> calculates/displays English performance

This is called METHOD OVERRIDING because the child classes
override the gradePerformanceScore() method inherited from
the parent class.

The statement:

    GradePerformance maths = new MathsGrades();

shows runtime polymorphism because the reference is of type
GradePerformance, but the actual object is MathsGrades.

Therefore, when:

    maths.gradePerformanceScore();

is called, Java executes the MathsGrades version of the method.

CONCLUSION:
The behaviour demonstrated is POLYMORPHISM,
specifically RUNTIME POLYMORPHISM through METHOD OVERRIDING.
*/