/* Name: Dailiang Chen
 * Date: April 6, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that gets the minimum of three values
 * Major skills: Methods
 */

// import scanner
package methods;

import java.util.Scanner;

// class
public class Min3 {
	
	// global variable
	static Scanner input = new Scanner(System.in);
	
	// main method
	public static void main(String[] args) {
		// get three values
		System.out.print("Enter value #1: ");
		double value1 = input.nextDouble();
		System.out.print("Enter value #2: ");
		double value2 = input.nextDouble();
		System.out.print("Enter value #3: ");
		double value3 = input.nextDouble();
		
		// find the minimum
		minimum3(value1, value2, value3);
		

	}
	
	// minimum of three method
	private static void minimum3(double v1, double v2, double v3) {
		System.out.printf("Math.min(%.2f, %.2f, %.2f) => %.2f", v1, v2, v3, Math.min(v1, Math.min(v2, v3)));
		
	}

}
