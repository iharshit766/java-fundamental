import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input from the user
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // simple interest logic
        double simpleInterest = (principal * rate * time) / 100;

        // printing the result
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}
