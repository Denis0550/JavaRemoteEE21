package part9.loops;

public class Demo2DoWhileLoop {
    // Do-while loop is almost the same as while loop. The only difference is
    // that do-while loop first executes the code inside the block of do-while loop
    // and only then it executes the expression between the parenthesis ()
    // NOTE: The block of do-while loop is always executes AT LEAST ONCE
    public static void main(String[] args) {
        int a = 5;

        do {
            System.out.println("Text");
        } while(a != 5);

        // Meanwhile, regular while loop will not output the text
        while(a != 5) {
            System.out.println("Text2");
        }
    }
}
