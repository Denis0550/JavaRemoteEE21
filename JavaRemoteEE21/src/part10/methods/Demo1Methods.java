package part10.methods;

import java.time.LocalDateTime;

public class Demo1Methods {
    // NOTE: Before the name of method you have provide the data type of value
    // which will be returned by that method (for example: int, float, double, boolean, etc.).
    // Or you provide the special keyword void meaning that the method does not return anything

    // Why do we need to divide code into different methods?
    // 1) It helps to avoid duplication
    // 2) It makes code easier to read

    // NOTE: as names of variables and all other names in programming, the names of methods
    // HAVE to be meaningful (they should convey the reason why those methods exist)


    // NOTE: we will learn about static method later. Right now, know just this fact: If main method
    // will call that other method directly, the method has to have static keyword before return type
    public static void main(String[] args) {
        // The values passed to method are called arguments
        greet(13);

        // This is just request code. LocalDateTime will covered later or learned individually
        // (it depends on if we will have enough time)
        greet(LocalDateTime.now().getHour());

        int currentHour = 21;
        System.out.println("Current hour is: " + currentHour + "\nThe greeting is: " + returnTheGreeting(currentHour));

        System.out.println(multiplyTwoNumbers(5, 8));

        // Java is pass-by-value language
        // That means that when we pass some variable as an argument to the
        // method, the value of that variable will not change even if the value
        // of parameter was changed inside of the method
        int number = 5;
        System.out.println("'number' value before 'raiseByTwo()' call: " + number);
        raiseByTwo(number);
        System.out.println("'number' value before 'raiseByTwo()' call: " + number);

    }

    // void means that this method does not return any value
    static void greetInEnglish() {
        System.out.println("Good morning");
        System.out.println("Good afternoon");
        System.out.println("Good evening");
    }


    static void greetInLithuanian() {
        System.out.println("Labas rytas");
        System.out.println("Laba diena");
        System.out.println("Labas vakaras");
    }

    // The example of method with a one parameter
    // The parameter is very similar to local variable. Except, it is declared between
    // the parenthesis of method and it initialized when the argument is passed to
    // the method.
    // NOTE: Do not forget that parameter is accessible only inside of the body of its method
    // NOTE: If you want to call a method with parameters, you have to pass all arguments with
    // matching types to that method. Other way, you will not be able to call that method
    static void greet(int hour) {
        if (hour < 12) {
            System.out.println("Good morning");
            // return; statement just exists the method and returns to the method which the
            // exited method
            return;
        } else if (hour < 18) {
            System.out.println("Good afternoon");
            return;
        } else if (hour < 22) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good night");
        }

        // This code is executed only when "Good evening" and "Good night" is printed out
        System.out.println("Do not disturb! It's too late!");
    }

    // NOTE: if you use data type instead void keyword, the return statement
    // is MANDATORY. There cannot be A SCENARIO WHEN THE RETURN STATEMENT IS NOT
    // EXECUTED when method has other return data type than void.
    static String returnTheGreeting(int hour) {
        if (hour < 12) {
            return "Good morning";
        } else if (hour < 18) {
            return "Good afternoon";
        } else if (hour < 22) {
            return "Good evening";
        } else {
            return "Good night";
        }
    }

    static int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    static void raiseByTwo(int nr) {
        nr = nr * nr;
    }
}
