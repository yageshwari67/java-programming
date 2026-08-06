public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical AND (&&)
        System.out.println("a > 5 && b > 15 : " + (a > 5 && b > 15));

        // Logical OR (||)
        System.out.println("a > 15 || b > 15 : " + (a > 15 || b > 15));

        // Logical NOT (!)
        System.out.println("!(a > b) : " + !(a > b));
    }
}