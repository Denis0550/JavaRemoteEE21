package part9.loops;

// Continue statement skips the iteration

// Iteration (in this case when we talk about loops) is a period of time when the block of loop is executed.
// When I say: "Something happens during the 1st iteration", I mean: "During the period of time when
// the block of loop is executed for the first time something happens"
public class Demo6ContinueStatement {
    public static void main(String[] args) {
        String[] vegetables = new String[]{"Tomatoes", "Pickles", "Bell peppers", "Iceberg salad", "Red pepper"};
        for (int i = 0; i < vegetables.length; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Vegetable Nr. " + (i+1) + ": " + vegetables[i]);
        }
        System.out.println("The printing of vegetables names is OVER.");
    }
}
