
//Name: Dailiang Chen
//Date: February 12, 2024
//Course: ICS3U1-04 - Mr.Fernandes
//Description: Write an application that inputs three integers from the user and displays the sum, average, product, smallest and largest of the numbers. (Calculate3)

// import all utilities
import java.util.*;

// Make class name Calculate3
public class Calculate3 {

	// Make main method
	public static void main(String[] args) {

		// Implement scanner
		Scanner sc = new Scanner(System.in);

		// State variables
		double num1, num2, num3;

		// Implement array for sorting 3 numbers
		double[] arr = new double[3];

		// Input first number
		System.out.print("Input first number: ");
		num1 = sc.nextDouble();
		arr[0] = num1;
		// Input second number
		System.out.print("\nInput second number: ");
		num2 = sc.nextDouble();
		arr[1] = num2;
		// Input third number
		System.out.print("\nInput third number: ");
		num3 = sc.nextDouble();
		arr[2] = num3;

		// Variables to state sum, difference, product, and average
		double sum, difference, product, average;

		// Output
		sum = num1 + num2; // sum
		difference = num1 - num2; // difference
		product = num1 * num2; // product
		average = (num1 + num2 + num3) / 3; // average

		// sort array in ascending order
		Arrays.sort(arr);

		// Print output
		System.out.printf("\n%.1f + %.1f = %.1f", num1, num2, sum); // Print sum
		System.out.printf("\n%.1f - %.1f = %.1f", num1, num2, difference); // Print difference
		System.out.printf("\n%.1f * %.1f = %.1f", num1, num2, product); // Print product
		System.out.printf("\nThe average of the three numbers is %.2f", average); // Print average
		System.out.printf("\nSmallest number is %.1f. The largest is %.1f", arr[0], arr[2]); // Print smallest, Print
																								// largest

	}
}
