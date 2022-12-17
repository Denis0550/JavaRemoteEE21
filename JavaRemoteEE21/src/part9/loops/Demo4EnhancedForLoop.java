package part9.loops;

// Enhanced for loop
public class Demo4EnhancedForLoop {
    public static void main(String[] args) {
        String[] vegetables = new String[]{"Tomatoes", "Pickles", "Pepper bells", "Iceberg salad"};

        // On the left side of a colon (:) we declare a variable of the same type as elements
        // of array.
        // On the right side we provide the array we want to iterate through
        for(String vegetable: vegetables) {
            System.out.println(vegetable);
        }
    }
}
