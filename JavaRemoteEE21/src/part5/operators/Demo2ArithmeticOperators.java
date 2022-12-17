package part5.operators;

public class Demo2ArithmeticOperators {
    public static void main(String[] args) {
        int int1 = 5;
        int int2 = 2;

        int intResult = 0;

        double double1 = 5;
        double double2 = 2;

        double doubleResult = 0;

        //Arithmetic operators:

        // Addition:
        intResult = int1 + int2;
        System.out.println("int1 + int2 = " + intResult);
        System.out.println("25 + 30 = " + (25 + 30));
        intResult = 1 + 2;
        System.out.println("1 + 2 = " + intResult);

        // Subtraction:
        intResult = int1 - int2;
        System.out.println("int1 - int2 = " + intResult);

        // Multiplication:
        intResult = int1 * int2;
        System.out.println("int1 * int2 = " + intResult);

        // Division:

        // Division with integers (it returns whole/integer part of the
        // division result):
        intResult = int1 / int2;
        System.out.println("int1 / int2 = " + intResult);

        // Division with floating point numbers:
        doubleResult = double1 / double2;
        System.out.println("double1 / double2 = " + doubleResult);

        // Division with integer and floating point number:
        // Note: During the arithmetic operation with integer
        // and floating point number, the integer is converted to
        // floating point number
        doubleResult = int1 / double2;
        System.out.println("int1 / double2 = " + doubleResult);

        // When operation is done with integers and the result
        // of that operation is assigned to floating point variable,
        // the result is converted to floating point number data type
        // of that variable:
        doubleResult = int1 / int2;
        System.out.println("int1 / int2 = " + doubleResult);

        // Modulus operator (it returns the remaining part of division result)
        // Note: this operator can be used with negative value too.
        intResult = int1 % int2;
        System.out.println("int1 % int2 = " + intResult);
    }
}
