package part7.conditional_statements;

import java.util.Random;
import java.util.Scanner;

public class Demo1IfStatement {

    public static void main(String[] args) {
        // Scenario:
        // There are two settlements on two separate hills.
        // When the enemies attack one of those settlements,
        // the torch is raised in the attacked settlement in order
        // to inform other settlement that enemies are here.
        // When the other settlement sees the torch they have to prepare
        // for siege.

//        Scanner scanner = new Scanner(System.in);
//
//        boolean torchIsLit = scanner.nextBoolean();

//        if (torchIsLit) {
//            System.out.println("Preparing for siege");
//        }

        // ###################################

//        if (torchIsLit) {
//            System.out.println("Preparing for siege!");
//        } else {
//            System.out.println("We can calmly go to sleep.");
//        }

        // Scenario:
        // Lottery is taking place. You have to take a ball with number
        // from the bucket. If that number equals to 5 - you win a pen.
        // If that number equals to 8 - you win eraser. If that number
        // equals to 9 - you win a mug. If that number does not equal to any
        // numbers mentioned before - you don't win anything :(((

//        Scanner scanner = new Scanner(System.in);
//
//        int ballNumber = scanner.nextInt();

        int min = 5;
        int max = 10;
        int ballNumber = (int)Math.round(Math.random()*(max-min+1)+min);

        System.out.println("Your number is: " + ballNumber);

        if (ballNumber == 5) {
            System.out.println("You won pen.");
        } else if (ballNumber == 8) {
            System.out.println("You won eraser.");
        } else if (ballNumber == 9) {
            System.out.println("You won a mug.");
        } else {
            System.out.println("You haven't won anything :((");
        }

        // Scenario:
        // If the body temperature of a person is higher than 36,6
        // - the person has fever. If not - the person is healthy.

//        double personTemp = 36.8;
//
//        if (personTemp > 36.6) {
//            System.out.println("The person has fever.");
//        } else {
//            System.out.println("The person is healthy.");
//        }


        // If you want to comment out multiple lines, you can mark those lines and
        // press CTRL+/

        // If you want to change the name of the variable in all code, you press on the
        // variable name and press shift+F6
    }
}
