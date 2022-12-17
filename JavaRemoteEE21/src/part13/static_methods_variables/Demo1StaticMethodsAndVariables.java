package part13.static_methods_variables;


public class Demo1StaticMethodsAndVariables {
    public static void main(String[] args) {

        RobotDog rDog1 = new RobotDog();
        RobotDog rDog2 = new RobotDog("Golden retriever", 2);

        System.out.println("Robotic dogs' data:");
        RobotDog.updateActivated = true;
        System.out.println("Breed: " + rDog1.getBreed() + "; Age: " + rDog1.getAge() + "; Update activated: "
            + RobotDog.updateActivated + "; Number of legs: " + RobotDog.LEG_NUMBER);
        System.out.println("Breed: " + rDog2.getBreed() + "; Age: " + rDog2.getAge() + "; Update activated: "
            + RobotDog.updateActivated + "; Number of legs: " + RobotDog.LEG_NUMBER);
        System.out.println();


        Ball.createBall();
        Ball.createBall();
        Ball.createBall();
        Ball.createBall();
        Ball.createBall();

        System.out.println("The number of balls: " + Ball.ballNumber);


        System.out.println(Calculator.addTwoNumbers(2,5));
        System.out.println(Calculator.subtractTwoNumbers(10,5));

    }
}
