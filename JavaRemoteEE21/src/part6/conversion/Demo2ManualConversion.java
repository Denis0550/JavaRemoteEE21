package part6.conversion;

public class Demo2ManualConversion {
    public static void main(String[] args) {
        // Casting (The changing the data type of value by hand)

        // When we need to go around the rules of automatic conversion
        // we use casting

        // Casting the value from bigger data type to smaller data type
        // We walk around this rule: "automatic narrowing conversion (it means conversion from
        // bigger type value to smaller type value) exists only with byte, short and char"
        long varLong1 = 10;
        int varInt1 = (int)varLong1;

        // Casting from floating point number to integer
        // We walk around this rule: "Java automatically DOES NOT TAKE CARE OF converting floating point
        // number to integer number"
        float num1 = 10.6f;
        int num2 = (int)num1;


        // Pay attention that when you cast some value, it has to
        // get into the range of possible values. Otherwise,
        // the Overflow can happen:
        short varShort = (short)1921222;
        // We get overflowed value:
        System.out.println(varShort);
    }
}
