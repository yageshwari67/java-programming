import java.util.Scanner;

public class DecisionMakingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter your attendance percentage: ");
        double attendance = sc.nextDouble();

        if (marks >= 75 && attendance >= 75) {
            System.out.println("Decision: Eligible for the course.");
        } 
        else if (marks >= 50 && attendance >= 60) {
            System.out.println("Decision: Conditionally eligible.");
        } 
        else {
            System.out.println("Decision: Not eligible for the course.");
        }

        sc.close();
    }
}3:13 PM 9/22/2026