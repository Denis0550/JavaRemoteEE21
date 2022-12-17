package part5.operators;

public class Demo6LogicalOperators {
    public static void main(String[] args) {
        // Logical operators (keep in mind that these are short-circuit logical operators)

        // AND (Conjuction) operatorius (&&)
        // If at least one value is false, the result is false

        System.out.println("true && false: " + (true && false));

        System.out.println("true && true: " + (true && true));

        // Scenario:
        // Player takes two cubes from box. If both of these cubes are black - he wins the prize.
        boolean isFirstCubeBlack = true,
                isSecondCubeBlack = false;

        System.out.println("Have the player won the game? "
            + (isFirstCubeBlack && isSecondCubeBlack));
        // ---------------------------------------------------------------------------------



        // OR (Disjunction/Logical sum) operator (||)
        // If two values are false, the result is false.
        // If only one value is true, the result will be true.

        System.out.println("true || false: " + (true || false));

        System.out.println("true || true: " + (true || true));

        System.out.println("false || false: " + (false || false));

        // Second scenario:
        // The player takes two cubes from the box. If at least one cube is black - the player wins.
        boolean isFirstCubeBlack1 = false,
                isSecondCubeBlack1 = true;

        System.out.println("Have the player won in the second game? "
                + (isFirstCubeBlack1 || isSecondCubeBlack1));

        // ---------------------------------------------------------------------------------

        // Negation operator (!)
        // It returns the opposite value

        System.out.println("!true: " + !true);
        System.out.println("!false: " + !false);
        System.out.println("!(true && true): " + !(true && true));

        // Third scenario:
        // Player takes two cubes from the box. If BOTH OF THESE CUBES ARE NOT BLACK, the player wins the prize.
        boolean isFirstCubeBlack2 = false,
                isSecondCubeBlack2 = true;

        System.out.println("Have the player won the prize? "
                + !(isFirstCubeBlack2 || isSecondCubeBlack2));
        // ---------------------------------------------------------------------------------
    }
}
