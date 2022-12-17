package part3.variables;

public class Demo8StringConcatenation {

    // Right now, understand String as simple text which written between quotation marks
    // We learn about String much more deeply in the future
    public static void main(String[] args) {

        int result = 10;
        // Concatenation (the process of joining String value
        // with other value)
        System.out.println("Result: " + result);
        System.out.println("Result: " + result + ". Hooray" + ". Some Text");

        // When you do some calculation while printing, do not
        // forget to write such calculation between parenthesis
        System.out.println("Result: " + (2 + 3));
    }
}
