package part9.loops;

// Break statement escapes the closest loop
public class Demo5BreakStatement {
    public static void main(String[] args) {
        String[] vegetables = new String[]{"Tomatoes", "Pickles", "Pepper bells", "Iceberg salad"};
        for (int i = 0; i < vegetables.length; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("Vegetable Nr. " + (i+1) + ": " + vegetables[i]);
        }
        System.out.println("After break");
    }
}
