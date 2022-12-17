package part3.variables;

public class Demo9SubstituteSymbols {

    public static void main(String[] args) {
        System.out.println("########-Backspace demo-########");

        System.out.println("abcDEF");
        System.out.println("abc\bDEF");
        System.out.println("abc\b\bDEF");

        System.out.println("\n######-Horizontal tab demo-######");

        System.out.println("abc");
        System.out.println("\tabc");
        System.out.println("\t\tabc");

        System.out.println("\n#########-New line demo-#########");

        System.out.println("abcDEF");
        System.out.println("abc\nDEF");
        System.out.println("abc\n\nDEF");

        System.out.println("\n######-Cariage return demo-######");

        System.out.print("Hello cruel cruel\rWorld");

        System.out.println("\n########################");

        System.out.println("\n######-Double quote-######");

        System.out.println("Text: \"Some text\"");

        // This will not compile
//         System.out.println("Text: "Some text"");

        System.out.println("\n######-Single quote (apostrophe)-######");

        // \' is relevant for char literals. We can use ' (apostrophes)
        // as much as we want in the String without adding \ before them
        char singleQuote = '\'';

        System.out.println("Text: 'Some text'");


        System.out.println("\n######-Backslash-######");

        System.out.println("Text: backslash \\");

    }
}
