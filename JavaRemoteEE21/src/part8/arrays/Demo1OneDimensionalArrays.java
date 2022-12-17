package part8.arrays;

// Array - data structure containing indexed data of the same type
// The size of arrays fixed (in other words, the size cannot be changed)
// Remember the example with 1 level indexed gym shoe racket
public class Demo1OneDimensionalArrays {
    public static void main(String[] args) {
        // int array declaration
        // NOTE: If we do not assign any values to the elements of arrays, the elements will hold
        // default values
        int[] arr = new int[10];

        int firstElementValue = arr[0];

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);


        System.out.println("######################");

        // Default values
        // (values provided by Java if you haven't assigned any values by yourself)
        // Integers: 0
        // Floating point values: 0.0
        // char: nothing (\u0000)
        // boolean: false
        // Objects (String, Scanner and others): null


        // declaration and initialization of array (other way)
        // NOTE: the index of the last element is the size of the array minus 1
        String[] gymShoesRacket = new String[]{"Adidas", "Nike", "Puma"};


        System.out.println(gymShoesRacket[0]);
        System.out.println(gymShoesRacket[1]);
        System.out.println(gymShoesRacket[2]);


        System.out.println("##### Content of arr3: ");

        // You can assign values to the elements of array just like that: arr3[0] = 10;
        long[] arr3 = new long[10];

        arr3[0] = 10;
        arr3[2] = 123;

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);
        System.out.println(arr3[5]);
        System.out.println(arr3[6]);
        System.out.println(arr3[7]);
        System.out.println(arr3[8]);
        // the index of the last element is the size of the array minus 1:
        System.out.println(arr3[9]);

        // We get java.lang.ArrayIndexOutOfBoundsException exception.
        // Because we are trying to access the element which does not exist:
//        System.out.println(arr3[10]);


        System.out.println("######################");

        String[] words = new String[]{"zodis1", "zodis2"};

        System.out.println(words[0]);
        System.out.println(words[1]);

        // You can declare array by adding square brackets after
        // the name of the variable (after identifier):
        int mas[];

        // Also, we can initialize the array like that:
        int[] mas2 = {1, 2, 3};


        // We can get the size of an array by using length attribute:
        System.out.println("The size of \"words\" array: " + words.length);
        System.out.println("The size of \"arr3\" array: " + arr3.length);


        System.out.println("######################");

        int[] numbers = new int[10];
        System.out.println(numbers[2]);

        String[] skyBinSky = new String[2];
        System.out.println(skyBinSky[1]);


    }
}
