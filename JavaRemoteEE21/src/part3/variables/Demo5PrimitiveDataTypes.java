package part3.variables;

public class Demo5PrimitiveDataTypes {

    // #####################
    // Primitive data types:
    // #####################

    // Bit - the smallest measuring unit of data
    // 8 bit equals 1 byte

    public static void main(String[] args) {

        // Integral/Integers numbers:
        byte varByte;   // size: 8 bit [-128 to 127]
        short varShort; // size: 16 bit [–32768 to 32767]
        int varInt;     // size: 32 bit [–2147483648; 2147483647]
        long varLong;   // size: 64 bit [–9223372036854775808; 9223372036854775807]

        // Floating point numbers:
        float varFloat;   // size: 32 bit
        double varDouble; // size: 64 bit

        // Characters:
        char varChar; // size: 16 bit

        // Boolean (can store logical value true or false):
        boolean varBoolean;

        //###########################################################################
        //######### Information about primitive data types #############
        //###########################################################################

        // When you use integer/integral value (literal) anywhere in the code
        // - Java sees that value as the value of int type
        // In this line the value 10 of int type is assigned to the
        // variable var2 of long type:
        long var2 = 10;

        // This code will not compile, because
        // it does not belong to the range of int numbers ([–2147483648; 2147483647])
//        long var3 = 2147483648;

        // We have to add capital (uppercase) L letter to inform JAVA that provided
        // integer value has the type of long:
        long var4 = 2147483648L;

        //############################################################
        //############################################################

        // Java does not let to assign numbers of larger type
        // to the variable of smaller type:
//        int var5 = 10L;

        // This is the exception of rule (compiler converts int to
        // byte, short and char AUTOMATICALLY):
        byte var6 = 10;
        short var7 = 10;
        char var8 = 10;

        //############################################################
        //############################################################

        // When you use literal floating point value
        // in the code, Java sees this value as value of double type.
        // Therefore, this code will not compile:
//        float var88 = 2.5;

        // f letter informs Java that you have provided value of float type
        float var9 = 2.5f;

        //############################################################
        //############################################################

        // NOTE: char is provided between apostrophes

        // char variable can hold characters:
        char var10 = ' ';
        char var11 = 'a';

        // char variable can hold decimal representation of character
        // (you can find decimal values of symbols here: https://en.wikipedia.org/wiki/List_of_Unicode_characters):
        char var12 = 75;

        // char variable can hold Unicode value
        // (you can find decimal values of symbols here: https://en.wikipedia.org/wiki/List_of_Unicode_characters):
        char var13 = '\u00A9';

        //############################################################
        //############################################################

        boolean isMyShirtRedAndWhite = true;

        boolean isMyShirtBlack = false;
    }
}
