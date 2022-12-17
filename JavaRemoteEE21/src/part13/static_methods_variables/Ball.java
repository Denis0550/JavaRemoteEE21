package part13.static_methods_variables;

public class Ball {

    private String color;

    public static int ballNumber = 0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Ball() {
        ballNumber++;
    }

    // Static method:
    // - it can be accessed using class name
    // - it is not recommended to use variables to access
    // static methods/variables (it will work but it does
    // not make sense to access such a way)

    public static Ball createBall() {
        // You cannot use non static variables/methods in
        // the static method:
        // It does not compile:
//         setColor("Green");
//         Will not compile:
//         color = "";
        return new Ball();
    }


    public void doSth() {
        // However, we can access static methods and variables
        // in non static methods:
        createBall();
    }

}
