import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	//Scanner Object

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();		//Taking First Input

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();		//Taking Second Input

        int sum = num1 + num2;			//Addition Logic

        System.out.println("The sum is: " + sum);	//Result Printing

        sc.close();				//Scanner Object Closing
    }
}
