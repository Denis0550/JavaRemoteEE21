package part6.conversion;

public class Demo1AutomaticConversion {
    public static void main(String[] args) {
        // Rule: conversion from integer number to floating point number
        // is taken care of by the Java itself
        int a = 10;
        float b = a;
        double c = 20;

        // Rule: Java automatically DOES NOT TAKE CARE OF converting floating point
        // number to integer number:
        // Will not compile:
//         int num2 = 10.0;

        // Rule: automatic narrowing conversion (it means conversion from
        // bigger type value to smaller type value) exists only in these
        // cases:
        byte varByte = 10;
        short varShort = 10;
        char varChar = 10;

        // Rule: widening conversion (it means conversion from
        // smaller type value to bigger type value) happens
        // automatically in java:
        varShort = varByte;
        a = varShort;
        double abc = 25.5f;


        // Note: The data loss is possible during data type conversion:
        // int -> float
        // long -> float
        // long -> double

        int varInt = 2147483647;
        float varFloat = varInt; // varFloat variable will have
                                 // 2.14748365E9 (2147483650) value

        System.out.println("varFloat: " + varFloat);

        System.out.println(varInt == varFloat);

        // ################################################

        // ############################################################
        // Automatic conversion (Numeric promotion) rules
        // #############################################################

        // 1) If two values has different data types, Java automatically
        // changes the type of value from smaller type to bigger type (widening conversion)
        int varrInt = 10;
        long varrLong = 10;

        System.out.println("The value of int type is converted to long type automatically: "
                + (varrInt + varrLong));

        // 2) If one value has integer type, other value has floating point type, the
        // integer type will be converted to floating point type

        int varrInt2 = 10;
        float varrFloat = 10.0f;

        System.out.println("The value of int type is converted into float type: "
                + (varrInt2 + varrFloat));

        // 3) byte, short and char values will be converted to int type automatically
        // when they are in the arithmetic operation (even if there is no int operands
        // in operation)
        byte varrByte1 = 10;
        byte varrByte2 = 11;

        System.out.println("All operands was converted to int here: " + (varrByte1 + varrByte2));

        // 4) When all conversions happened and all operands become the same type, the result
        // will also have the same type
        byte varrByte3 = 10;
        byte varrByte4 = 10;
        byte varrByte5 = 10;

        System.out.println("The result will have int type: " + (varrByte3 + varrByte4 + varrByte5));


        // ################################################
        // ################################################
        // ################################################

        // Example, where all these 4 rules are used

        short x = 14;
        float y = 14;
        double z = 30;

        System.out.println(x*y/z);

        // 1) (x converted to int'ą according to 3rd rule)
        // 2) (x converted to float'ą according to 2nd rule)
        // 3) ((x*y) converted to double according to 1st rule)
        // 4) (((x*y)*z) result will be double according to 4th rule)

        // ################################################
        // ################################################
        // ################################################

        // ###############################
        // Similar rules in the slides (The purpose of existence of these rules is the same. However,
        // the formulation of these rules are completely):
        // If one of the operands is of the double type, the other will also be converted to the double type.
        // Otherwise, if an operand is of float type, the other will also be converted to float type.
        // Otherwise, if an operand is of the long type, the other will also be converted to the long type.
        // Otherwise both operands will be converted to the int type.
    }
}
