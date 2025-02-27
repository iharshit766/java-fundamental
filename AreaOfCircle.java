import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Radius as input
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculate area logic
        double area = Math.PI * Math.pow(radius, 2);
        
        // Display result
        System.out.println("The area of the circle is: " + area);
        
        scanner.close();
    }
}
