//Name: Dailiang Chen
//Date: February 12, 2024
//Course: ICS3U1-04 - Mr.Fernandes
//Description: Write an application that asks the user to enter two numbers, obtains the numbers from the user and prints the sum, product, difference and quotient (division) of the numbers. 

// import all utilities
import java.util.*;

// Make class called Calculate
public class Calculate {

	// Make main method
	public static void main(String[] args) {

		// implement scanner
		Scanner sc = new Scanner(System.in);

		// variable for numbers
		double num1, num2;

		// input first number
		System.out.print("Input first number: ");
		num1 = sc.nextDouble();
		// input second number
		System.out.print("\nInput second number: ");
		num2 = sc.nextDouble();

		// variables to show results
		double sum, difference, product;
		double quotient;

		// results
		sum = num1 + num2; // sum
		difference = num1 - num2; // difference
		product = num1 * num2; // product
		quotient = num1 / num2; // quotient

		// print results
		System.out.printf("\n%.1f + %.1f = %.1f", num1, num2, sum); // print sum
		System.out.printf("\n%.1f - %.1f = %.1f", num1, num2, difference); // print difference
		System.out.printf("\n%.1f * %.1f = %.1f", num1, num2, product); // print product
		System.out.printf("\n%.1f / %.1f = %.2f", num1, num2, quotient); // print quotient

	}
}
