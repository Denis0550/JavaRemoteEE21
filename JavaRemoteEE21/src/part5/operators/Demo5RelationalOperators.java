package part5.operators;

public class Demo5RelationalOperators {
    public static void main(String[] args) {
        // #####################
        // Relational operators
        // #####################

        // Equality operator ==

        int varr = 2,
            varr2 = 3;

        System.out.println("varr == varr2: "  +  (varr == varr2));

        int varr3 = 4,
            varr4 = 4;

        System.out.println("varr3 == varr4: "  +  (varr3 == varr4));

        // Inequality operator !=

        System.out.println("varr != varr2: "  +  (varr != varr2));
        System.out.println("varr3 != varr4: "  +  (varr3 != varr4));

        // Greater than > and greater than or equal to >= operators

        System.out.println("varr > varr2: "  +  (varr > varr2));
        System.out.println("varr3 >= varr4: "  +  (varr3 >= varr4));

        // Less than < and less than or equal to <= operators

        System.out.println("varr < varr2: "  +  (varr < varr2));
        System.out.println("varr3 <= varr4: "  +  (varr3 <= varr4));
    }
}
