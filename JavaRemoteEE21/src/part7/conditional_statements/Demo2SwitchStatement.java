package part7.conditional_statements;

import java.util.Scanner;

public class Demo2SwitchStatement {

    public static void main(String[] args) {
        // Scenario:
        // Lottery is taking place. You have to take a ball with number
        // from the bucket. If that number equals to 5 - you win a pen.
        // If that number equals to 8 - you win eraser. If that number
        // equals to 9 - you win a mug. If that number does not equal to any
        // numbers mentioned before - you don't win anything :(((

        // If we have the set of known values (as in the lottery scenario), it is
        // highly recommended to use switch statement.

//        Scanner scanner = new Scanner(System.in);
//
//        int ballNumber = scanner.nextInt();

        int min = 5;
        int max = 10;
        int ballNumber = (int)Math.round(Math.random()*(max-min+1)+min);

        System.out.println("Your number is: " + ballNumber);

        switch (ballNumber) {
            case 5:
                System.out.println("You won pen.");
            break;
            case 8:
                System.out.println("You won eraser.");
            break;
            case 9:
                System.out.println("You won a mug.");
            break;
            default:
                System.out.println("You haven't won anything :((");
        }

        // Switch uses these data types (between parenthesis):
        // int and Integer (you can learn about Integer by yourself)
        // byte and Byte (you can learn about Byte by yourself)
        // short and Short (you can learn about Short by yourself)
        // char and Character (you can learn about Character by yourself)
        // enum (you will learn about enum in Advanced Java Features)
        // String


    }
}
