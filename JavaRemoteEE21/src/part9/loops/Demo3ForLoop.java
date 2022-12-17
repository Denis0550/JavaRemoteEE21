package part9.loops;

public class Demo3ForLoop {
    public static void main(String[] args) {
        // For loop (step by step):
        // 1) The variable is initialized (in this case, this statements is executed: int i = 0)
        // 2) The boolean expression is executed (in this case, this statements is executed: i < 3)
        // 3) If the result of boolean expression is true, the block of for loop is executed.
        // If the result of boolean expression is false, the for loop is ended and other code will
        // executed (if that code exist) after for loop.
        // 4) If the block of for loop is executed, the update statement is executed (in this
        // case: i++)
        // 5) If update statement is executed, the execution for loop returns to the 2nd step.
        for (int i = 0; i < 3; i++) {
            System.out.println("i value: " + i);
        }

        // NOTE: Will not compile because i is only accessible within for loop, if this variable
        // is declared between parenthesis of for loop
//         System.out.println(i);

        // Loop inside of loop:
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + " iteration of parent loop:");
            for (int j = 0; j < 3; j++) {
                System.out.println("Loop in the loop! i value: " + i + "; j value: " + j);
            }
            System.out.println();
        }

        // For loop can have multiple declaration and initialization between
        // parenthesis. Also, there can be multiple update statements divided
        // by commas:
        for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
            System.out.println("i value: " + i + "; j value: " + j);
        }

        // ########################
        // Iteration through array
        // ########################
        String[] vegetables = new String[]{"Tomatoes", "Pickles", "Pepper bells", "Iceberg salad"};
        // Printing out the content of array without loop:
        System.out.print(vegetables[0] + ", ");
        System.out.print(vegetables[1] + ", ");
        System.out.print(vegetables[2] + ", ");
        System.out.println(vegetables[3]);
        //  Printing out the content of array WITH loop:
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("Vegetable Nr. " + (i+1) + ": " + vegetables[i]);
        }

        int[][] arr2 = {{1,2}, {3,4}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
