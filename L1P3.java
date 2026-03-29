import java.util.Scanner;

public class    L1P3 {

    // Method to calculate rounds
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter side 1 (meters): ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2 (meters): ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3 (meters): ");
        double c = sc.nextDouble();

        // Calculation
        double rounds = calculateRounds(a, b, c);

        // Output
        System.out.println("Number of rounds required to complete 5 km: " + rounds);

        sc.close();
    }
}
    

