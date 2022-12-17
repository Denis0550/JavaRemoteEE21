package part3.variables;

public class Demo2VariablesInitialization {

    public static void main(String[] args) {
        // The declaration and initialization of local variables:

        // Initialization is the process of assigning the value to the variable
        // for the FIRST TIME.
        int var1 = 215;

        int var2 = 247, var3 = 452;

        int var4 = 50,
            var5 = 6;

        // Only declaration:
        int var6;

        // Only intialization:
        var6 = 101;


        // Assignment (priskyrimas), tai reikšmės kintamajam priskirimas, jau ne
        // pirmajį kartą (jau šis kintamasis buvo inicializuotas):
        var6 = 102;
    }
}
