package part8.arrays;

public class Demo2TwoDimensionalArrays {
    public static void main(String[] args) {

        int[][] mas = new int[2][2];

        mas[0][0] = 1;
        mas[0][1] = 2;
        mas[1][0] = 3;
        mas[1][1] = 4;

        System.out.println("####");
        System.out.print(mas[0][0] + " ");
        System.out.println(mas[0][1]);
        System.out.print(mas[1][0] + " ");
        System.out.println(mas[1][1]);
        System.out.println("####");

        int[][] arr = new int[4][];
        arr[0] = new int[3];
        arr[1] = new int[]{58, 78, 74};
        arr[2] = new int[3];
        arr[3] = new int[5];

        // Individual value of element is taken like this:
        System.out.println(arr[1][0]);


        // Trying to access non-existent element (throws java.lang.ArrayIndexOutOfBoundsException):
//         System.out.println(arr[2][3]);


        // We can initialize 2D array like that:
        int[][] arr2 = {{1,2}, {3,4}};

        // Also, we can declare 2D array like that:
        int[] arr3[];
        int arr4[][];

        System.out.println("In the \"arr\" array there are " + arr.length + " lines");
        System.out.println("In the \"arr\" 4th line there are " + arr[3].length + " elements");
    }
}
