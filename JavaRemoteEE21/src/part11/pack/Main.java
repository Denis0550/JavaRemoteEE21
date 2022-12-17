// package declaration has to be in the beginning of Java file
// However, we can add comments or empty space before package
// declaration
package part11.pack;

// NOTE: convention of package name requires to create
// packages in the similar fashion as reverse website address

// When we add * in the import statement, all classes in that package
// will be accessible
import lt.ignascorp.*;
import lt.petrascorp.DvdPlayer;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        dvdPlayer.play();

        // If we need to use different classes with the same name,
        // We can define the full path to those classes in the declaration
        // and initialization. Or one class can be imported using import keyword,
        // others using full names:
        lt.dominykascorp.DvdPlayer dvdPlayer2 = new lt.dominykascorp.DvdPlayer();
        dvdPlayer2.play();

        Player player = new Player();
        Calculator calculator = new Calculator();

        // import static allows us to import
        // static methods and variables (not the class). This way
        // we do not have to provide the name of the class each time
        // we use that static variable/method. Example (we do not
        // have to access PI like that: Math.PI):
        System.out.println(PI);
        System.out.println(PI);
        System.out.println(PI);
        System.out.println(PI);
        System.out.println(PI);
    }

}
