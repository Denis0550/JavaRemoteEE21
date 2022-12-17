package part11.classes_and_objects.lesson3;


public class Dog {
    // Attributes/fields/instance variables:
    // State:
    private String breed;
    private int age;

    // Constructors:

    // Constructors are special methods that starts the process
    // of object creation
    //
    // If class does not hae any constructors, the default (empty)
    // constructor will be created.
    //
    // Constructor does not have a return type
    //
    // Constructor name matches the name of the class
    //
    // Usually, we add initialization code in the constructors
    public Dog() {
//        this.breed = "Pinscher";
//        this.age = 5;
        //
        // We are calling another constructor
        //
        // Note: there cannot be another code before calling
        // another constructor by using this keyword
        this("Pinscher", 5);
    }

    // Constructors with parameters:
    //
    // NOTE: If we create constructor with parameters in the class without constructors
    // , the default constructor will not be generated automatically.
    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }
    // When there are multiple constructors in the same class, this situation is called
    // constructor overloading

    // Methods:
    // (Behavior)

    // Setters:
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("EXCEPTION: dog cannot have negative age");
        }
    }

    // Getters:
    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }


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
