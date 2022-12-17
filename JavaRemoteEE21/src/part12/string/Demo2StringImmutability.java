package part12.string;

public class Demo2StringImmutability {

    public static void main(String[] args) {
        // String is immutable (unchangeable). That means once the String object
        // is assigned with some value - this value will never change.
        // When we use methods returning changed String values - those
        // methods do not change the value inside of the current object. Those
        // methods create new String object containing changed value and then
        // they return a reference to that new object.
        String str = "Good text";

        // The reference to new String object is returned in this line.
        // System.out.println prints out the value existing in that
        // new String object. However, str variable will hold reference to
        // the same String object with value of "Good text" as before:
        System.out.println("The value in new Object: " + str.replaceAll("Good", "Bad"));

        System.out.println("The value in the Object that str refers to: " + str);

        // What if we need to have a reference to the new object which has an new version of
        // our text? The solution is here:
        str = str.replaceAll("Good", "Bad");
        System.out.println("Now the str refers to new Object with updated value: " + str);
    }
}
