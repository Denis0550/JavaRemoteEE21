package part5.operators;

public class Demo7OperatorPrecedence {
    // NOTE: There are more operators in Java. We haven't covered all of them.
    // We have covered only the most used ones.
    public static void main(String[] args) {
        // During the Operator Precedence process the parenthesis are added implicitly
        // in the expression.
        // For example:
        // Programmer writes down this expression: 2+2*2
        // Behind the curtain computer will implicitly add parenthesis like this:
        // 2+(2*2) and only then the will solve the expression (from left to right)

        // Operator Precedence:
        // 1) Post-unary operators (Example: 2++ + 2 * 2, then: (2++) + (2 * 2) )
        // 2) Pre-unary operators
        // 3) Other unary operators: + (it's not addition, it's just
        // positive number sign), - (this is not a subtraction), !
        // 4) Multiplication/Division/Modulus: *, /, %
        // 5) Addition/Subtraction: +, -
        // 6) <, <=, >, >=
        // 7) Equality, inequality: ==, !=
        // 8) Short-circuit logical operator AND &&
        // 9) Short-circuit logical operator OR ||
        // 10) Assignment and compound assignment operators: =, +=, -=, *=, /=, %=

        // If we want to override the operator precedence,
        // we have to add parenthesis EXPLICITLY
        System.out.println((2+2)*2);

        // Complicated example:
        int x = 3;
        int expression = ++x * 5 / x-- + --x; // ((((++x) * 5) / (x--)) + (--x))    4 * 5 / 4 + 2;

        // Expression evaluation step by step (in the first computer adds parenthesis,
        // in other words: operator precedence process happens in the first step):
        // 1) ((((++x) * 5) / (x--)) + (--x))  (in the computer memory: x = 3)
        // 2) (((4 * 5) / (x--)) + (--x))      (in the computer memory: x = 4)
        // 3) ((20 / (x--)) + (--x))           (in the computer memory: x = 4)
        // 4) ((20 / 4) + (--x))               (in the computer memory: x = 3)
        // 5) (5 + (--x))                      (in the computer memory: x = 3)
        // 6) (5 + 2)                          (in the computer memory: x = 2)
        // 7) 7                                (in the computer memory: x = 2)

        System.out.println(expression);
        System.out.println("x value: " + x);
    }
}
