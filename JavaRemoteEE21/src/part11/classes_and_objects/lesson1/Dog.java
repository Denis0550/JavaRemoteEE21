package part11.classes_and_objects.lesson1;

// Default instance variables' values:
// (values provided by Java if you haven't assigned any values by yourself)
// Integers: 0
// Floating point values: 0.0
// char: nothing (\u0000)
// boolean: false
// Objects (String, Scanner and others): null

// Class is like a blueprint (for example: a blueprint of a house), which is used for creating an object
// (for example: building a house using that blueprint)

// This is a blueprint (class) of dog
public class Dog {
    // Attributes/fields/instance variables:
    // State:
    String breed;
    int age;

    // Methods:
    // Behavior:
    void run() {
        System.out.println("Dog is running");
    }

    void bark() {
        int woofTimes = 3;
        for (int i = 0; i < woofTimes; i++) {
            System.out.println("Woof");
        }
    }

    void fetchStick() {
        System.out.println("Here's the stick");
    }
}
