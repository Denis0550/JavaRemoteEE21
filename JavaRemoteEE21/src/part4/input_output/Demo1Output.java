package part4.input_output;

public class Demo1Output {

    public static void main(String[] args) {
        // println method writes argument value you have passed to it
        // AND prints \n (new line) after your argument
        System.out.println("Hello World!");
        // print method writes argument value you have passed to it
        // AND DO NOTHINGS ELSE
        System.out.print("abc");
        System.out.println("Abc");
        System.out.println(52);
        System.out.println("Skaičius: " + 52);

        // If you need learn about printf
        // https://www.baeldung.com/java-printstream-printf
        System.out.printf("Integer type numbers: %d, %d. Floating type number: %.2f", 10, 1, 25.506);
    }

}
