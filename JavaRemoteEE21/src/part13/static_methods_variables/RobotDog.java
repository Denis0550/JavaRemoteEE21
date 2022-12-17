package part13.static_methods_variables;


public class RobotDog {
    // Attributes/fields/instance variables:
    // State:
    private String breed;
    private int age;

    // Class variables:
    // The values of class variables are dedicated to a class and
    // NOT to objects. The value of class variable will be the same
    // for all objects
    // IT IS HIGHLY RECOMMENDED NOT TO USE CLASS VARIABLES
    public static boolean updateActivated = false;

    // However, it is normal to create constants
    // using static keyword
    // The naming convention of constants is to user
    // all capital letters and separate each word with _
    public static final int LEG_NUMBER = 4;

    public RobotDog() {
        this("Pincher", 5);
    }

    public RobotDog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    // Setters:
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("KLAIDA: šuniui buvo bandoma priskirti minusinį amžių");
        }
    }

    // Getters
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
