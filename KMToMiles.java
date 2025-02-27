import java.util.Scanner;

public class KMToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // conversion of km to miles
        double miles = kilometers * 0.621371;

        // printing result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        scanner.close(); 
    }
}
