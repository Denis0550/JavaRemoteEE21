package part11.classes_and_objects.lesson2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // These two lines will not work because age and breed
        // instance variables are marked with private keyword
//        dog.age = 10;
//        dog.breed = "Taksas";
        dog.setBreed("Taksas");
        dog.setAge(12);

        System.out.println("Dog data:");
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Age: " + dog.getAge());

        dog.setAge(-5);
        System.out.println("Age (after trying to assign negative value to it): " + dog.getAge());
    }
}
