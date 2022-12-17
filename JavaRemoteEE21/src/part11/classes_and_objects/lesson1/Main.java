package part11.classes_and_objects.lesson1;

public class Main {
    public static void main(String[] args) {

        // What happens here?
        // 1) The object is created in the memory by using
        // the "Dog" class (in the same fashion as a house is built
        // by using the blueprint of that particular house)
        // 2) This code ("new Dog();") returns the reference to that
        // newly created object
        new Dog(); // () means that the constructor without parameters of Dog class is called
        // What is the reference?
        // Reference is like a remote control for TV. In this example, the remote control
        // is a reference and the TV is a object.

        // If the object does not have any references to it (If there are no variables
        // containing a reference ("remote control") of that object ("TV")), the object is
        // prepared for removal or removed by Garbage Collector.

        System.out.println("The object created in the previous line is already removed" +
                "or prepared for removal by Garbage Collector");

        // By creating a class, we are creating not only a blueprint of a object, we also
        // create a new reference type
        // This is a variable of Dog type. It's no longer a PRIMITIVE data type.
        // The types as String, Scanner etc. are types just like a Dog type
        // created by us.
        // The reference to the object is put in the variable of
        // reference data type. Meanwhile, the primitive data type variable holds only
        // a simple value

        Dog dog = new Dog();

        dog.run();
        dog.bark();
        dog.fetchStick();

        // The getters and setters (you will learn about them later) should be used in this case:
        // (Do not use instance variables DIRECTLY, they are used directly for teaching purposes)
        System.out.println("Dog age: " + dog.age);
        System.out.println("Dog breed: " + dog.breed);
        dog.age = 10;
        dog.breed = "Sausage dog";

        System.out.println("Dog age (after change): " + dog.age);
        System.out.println("Dog breed (after change): " + dog.breed);

        // We have added the same reference as "dog" variable has to the
        // the "dog2" variable. As the result of that, "dog2" has the
        // "remote control" (reference) pointing to the same "TV" (object)
        Dog dog2 = dog;
        System.out.println("Dog2 age: " + dog2.age);
        System.out.println("Dog2 breed: " + dog2.breed);

        Dog dog3 = new Dog();
        System.out.println("Dog3 age: " + dog3.age);
        System.out.println("Dog3 breed: " + dog3.breed);
    }
}
