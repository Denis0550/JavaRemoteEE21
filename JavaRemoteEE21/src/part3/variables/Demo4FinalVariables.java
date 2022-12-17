package part3.variables;

public class Demo4FinalVariables {

    public static void main(String[] args) {

        // final variable is variable, which can only be initialized.
        // In other words, you can assign value to the final variable ONE TIME ONLY.

        final int finalVariable;
        finalVariable = 5;
        // Will not compile. Because you can assign value to the final variable only ONE TIME
        // finalVariable = 10;

        // final variables exist because there can be necessity to avoid changes in
        // the value of variable. Also, when you read code, it is easier for you
        // when you can be sure that the variable has some specific unchangeable
        // value.

    }
}
