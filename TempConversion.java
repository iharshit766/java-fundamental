import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        //Enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Display the result
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        
        // Close the scanner
        scanner.close();
    }
}

