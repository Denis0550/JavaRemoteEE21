package part11.classes_and_objects.lesson3;

public class Main {
    public static void main(String[] args) {
        // The constructor without parameters is called:
        Dog dog = new Dog();

        // What happens when "new Dog()" is executed
        // 1) The object of Dog type is created in the
        // computer memory
        // 2) The reference of that object is created
        // 3) The reference is used inside of default constructor
        // by using keyword this. If we are talking about this implementation
        // of default constructor, of course:
        //        public Dog() {
        //            this.breed = "Pinscher";
        //            this.age = 5;
        //        }
        // 4) The values of breed and age variables (of that newly created object)
        // are assigned

        System.out.println("Dog data:");
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Age: " + dog.getAge());
        System.out.println();

        // The constructor with parameters is called
        Dog dog2 = new Dog("Golden retriever", 4);

        System.out.println("Dog data:");
        System.out.println("Breed: " + dog2.getBreed());
        System.out.println("Age: " + dog2.getAge());

    }
}
