package casting;

public class Main {
    //Upcasting
    Animal animal = new Dog(); 
    //9virtual method invocation
    animal.sound();
    //Downcasting
    Dog dog = (Dog) animal;
    dog.sound();
}
