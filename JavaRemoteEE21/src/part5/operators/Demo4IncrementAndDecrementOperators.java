package part5.operators;

public class Demo4IncrementAndDecrementOperators {
    public static void main(String[] args) {
        // Increment and decrement operators

        // Pre-increment and pre-decrement (pre-unary)
        // How it works:
        // 1. It increases(pre-increment)/decreases(pre-decrement) the value by one
        // 2. It returns the value

        int inc = 2,
            dec = 2;

        // Pre-increment operator
        System.out.println("++inc = " + ++inc);
        System.out.println("inc value after ++inc = " + inc);

        // Pre-decrement operator
        System.out.println("--dec = " + --dec);
        System.out.println("dec value after --dec = " + dec);

        // Post-increment and post-decrement (post-unary)
        // How it works:
        // 1. It returns the value
        // 2. It increases (post-increment)/decreases(post-decrement) the value by one

        int inc2 = 2, dec2 = 2;

        // Post-increment operator
        System.out.println("inc2++ = " + inc2++);
        System.out.println("inc2 value after inc2++ = " + inc2);

        // Post-decrement operator
        System.out.println("dec2-- = " + dec2--);
        System.out.println("dec2 value after dec2-- = " + dec2);
    }
}
