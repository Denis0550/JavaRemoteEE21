package part14.varargs;

public class VarargsDemo {

    public static void main(String[] args) {
        displayNumbers(5, 4, 5, 1, 2, 2);

        System.out.println("###########");
        // Varargs allows you to pass array instead of individual values
        displayNumbers(new int[] {1, 1, 5, 8});


        // Varargs does not require to pass values at all:
        displayNumbers();


        System.out.println("###########");
        displayNumbersLessThanProvidedNumber(5, 4, 5, 1, 2, 2, 45, 897, 7, 8);
    }

    // varargs is such a parameter that takes unlimited amount (from ZERO to INFINITY)
    // arguments of declared type. In this case, it takes int type values (from zero to infinity
    // values)
    public static void displayNumbers(int... nr) {
        // varargs works in the very similar fashion as array. It uses the
        // same syntax. We access individual element by using this array syntax:
        // nr[i]. And we can even use the same length parameter, as we used
        // with arrays
        for (int i = 0; i < nr.length; i++) {
            System.out.println(nr[i]);
        }
    }

    // There can be more parameters before varargs in the varargs method
    public static void displayNumbersLessThanProvidedNumber(int number, int... sk) {
        for (int i = 0; i < sk.length; i++) {
            if (sk[i] < number) {
                System.out.println(sk[i]);
            }
        }
    }

    // NOTE: varargs parameter can be only THE LAST parameter
    // WIll not compile:
//    public static void doSth(int... sk, float b) {}

    // NOTE: Method can have only ONE varargs parameter
    // Will not compile:
//     public static void doSth(int... sk, float... sk2) {}

}
