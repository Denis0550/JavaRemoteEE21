package part3.variables;

public class Demo3LocalAndInstanceVariables {

    // NOTE: We will learn about instance variables LATER. Right now just understand these points:
    // 1) Instance variable are declared in the block (body) of the class
    // 2) Instance variable can be reached in any method (except static methods) inside the class where
    // this instance variable was declared.

    // Declaration and initialization of instance variable / field / attribute:
    int instanceVariable = 5;

    public static void main(String[] args) {

        // The declaration and initialization of local variable.
        // Local means declared inside of the method block (body)
        int var1 = 215;
        // Variable are accessible only within that block it is declared in.
        // Also, variables are accessible in the blocks existing inside the block they
        // declared in. For example, instanceVariable
        var1 = 4;

        // It will not compile. Because you are to access instance variable from static method:
//        instanceVariable = 5;
    }

    void doSth() {
        // Will not compile. Because kint1 is declared in the block of other method:
//        var1 = 2;

        // Instance variable can be reached in any method (except static methods) inside the class where
        // this instance variable was declared. Even though instanceVariable is declared in the block of the class,
        // the block of doSth() method is inside the class block. Therefore, it works.
        instanceVariable = 5;
    }

    void doSth2() {
        // Instance variable can be reached in any method (except static methods) inside the class where
        // this instance variable was declared.
        instanceVariable = 6;
    }
}
