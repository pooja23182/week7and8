
import java.util.Scanner;

public class L1P1 {

    // Method to calculate SI
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        // Calculation
        double si = calculateSI(p, r, t);

        // Output
        System.out.println("The Simple Interest is " + si +
                " for Principal " + p +
                ", Rate of Interest " + r +
                " and Time " + t);

        sc.close();
    }
}

