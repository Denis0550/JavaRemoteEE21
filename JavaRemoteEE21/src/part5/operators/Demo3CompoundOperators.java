package part5.operators;

public class Demo3CompoundOperators {
    public static void main(String[] args) {
        // Compound operators
        // Compound operator performs arithmetic operation with current value
        // and new value
        int a = 5;

        // Compound addition operator:
        a += 10;
        // It's the same as "a = a + 10;"
        System.out.println("a += 10 result: " + a);


        int b = 10;

        // Compound subtraction operator:
        b -= 2;
        // It's the same as "b = b - 2;"
        System.out.println("b -= 2 result: " + b);


        int c = 10;

        // Compound multiplication operator:
        c *= 2;
        // It's the same as "c = c * 2;"
        System.out.println("c *= 2 result: " + c);


        int d = 10;

        // Compound division operator:
        d /= 2;
        System.out.println("d /= 2 result: " + d);


        int e = 9;

        // Compound modulus operator:
        e %= 2;
        System.out.println("e %= 2 result: " + e);
    }
}
