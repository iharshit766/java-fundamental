import java.util.Scanner; // Import Scanner for user input

public class AverageofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // user for three numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // calculate average
        double average = (num1 + num2 + num3) / 3;

        // printing result
        System.out.println("The average is: " + average);

        scanner.close(); // Close Scanner
    }
}
