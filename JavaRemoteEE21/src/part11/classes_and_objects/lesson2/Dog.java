package part11.classes_and_objects.lesson2;


public class Dog {
    // Attributes/fields/instance variables:
    // State:
    private String breed;
    private int age;

    // Access modifiers defines where variables/
    // methods/ classes can be accessed

    // private keyword means that the variable or method
    // (marked with this keyword) can be accessed in the
    // same class where that variable or method was created

    // The convention was established in order to avoid
    // assignment of unexpected or invalid values
    // (or even do not allow to access or change values at all)
    // to instance variables. That convention requires to use
    // methods called getters and setters in order to access
    // or modify the instance variables.

    // Example of one of the reason why setters are used:
    // we do not want negative value to be assigned to the
    // instance variable

    // The process of assigning private
    // access modifiers to instance variables
    // is called Encapsulation

    // Setters (mutators):

    // Setter naming convention:
    // the word "set" + the name of
    // instance variable starting
    // with a capital letter

    // public is another access modifier. It allows the
    // variable or method to be access anywhere in the project
    public void setBreed(String breed) {
        // this keyword is a reference to the
        // current object
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("EXCEPTION: dog cannot have negative age");
        }
    }

    // Getter naming convention:
    // the word "get" + the name of
    // instance variable starting
    // with a capital letter

    // Getters (they are also called accessors)

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    // If we do not assign any access modifiers (private, public or protected
    // (you will learn about protected later)), then default access (also called
    // package-private) modifier will be assigned. Default access modifier
    // allows variable/method/class to be accessed only in the package they are created in

    // Methods:
    // (Behavior)
    public void run() {
        System.out.println("Dog is running");
    }

    public void bark() {
        System.out.println("Woof");
    }

    public void fetchStick() {
        System.out.println("Here's the stick");
    }
}
