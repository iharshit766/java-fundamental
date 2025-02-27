import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // enter base value
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();

        // enter exponent value
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();

        // print result
        System.out.println("Result: " + Math.pow(base, exponent));

        scanner.close(); // Close Scanner
    }
}

