package part3.variables;

public class Demo7Overflow {
    public static void main(String[] args) {
        // Overflow example:
        int abc = 2147483647 + 1;
        System.out.println(abc);
    }
}
