/* Name: Dailiang Chen
 * Date: April 9, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that uses Euclidean method
 * Major skills: Methods
 */

// import scanner
package methods;

import java.util.Scanner;
// class
public class EuclidGCD {
	
	// global scanner
	static Scanner input = new Scanner(System.in);
	
	// main method
	public static void main(String[] args) {
		// get value 1
		int value1 = getDividend();
		// get value 2
		int value2 = getDivisor();
		// get the GCD
		int remainder = gcd(value1, value2);
		// display the GCD
		displayGCD(remainder);

	}
	
	// dividend method
	private static Integer getDividend() {
		System.out.print("Enter value 1: ");
		return input.nextInt();
	}
	
	// divisor method
	private static Integer getDivisor() {
		System.out.print("Enter value 2: ");
		return input.nextInt();
	}
	
	// GCD method
	private static Integer gcd(int dividend, int divisor) {
		int remainder = divisor;
		while(dividend % divisor != 0) {
			remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		
		return remainder;
	}
	
	// display GCD method
	private static void displayGCD(int remainder) {
		System.out.printf("The GCD of the two values is %d", remainder);

	}

}
