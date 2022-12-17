package part9.loops;

// In general, loop is a special structure in programming
// which lets you to execute the same code MULTIPLE TIMES
public class Demo1WhileLoop {
    public static void main(String[] args) {
        int a = 0;

        // While loop (step by step):
        // 1) Checks if condition equals to true (in this case: a < 5)
        // 2) If condition equals to true, the block (the code between
        // braces) of while loop is executed and everything starts from
        // the first step. If condition equals to false the block IS
        // NOT EXECUTED
        while (a < 5) {
            System.out.println("a is less than 5 (a value: " + a + ")");
            a++;
        }
        System.out.println("a equals to 5 now....");


        // Iteration through array
        String[] vegetables = new String[]{"Tomatoes", "Pickles", "Pepper bells", "Iceberg salad"};
        // Printing out the content of array
        int i = 0;
        while (i < vegetables.length) {
            System.out.println(vegetables[i]);
            i++;
        }
    }
}
