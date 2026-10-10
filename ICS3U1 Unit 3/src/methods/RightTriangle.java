/* Name: Dailiang Chen
 * Date: April 9, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that finds the hypotenuse of a right triange
 * Major skills: Methods
 */

// import scanner
package methods;

import java.util.Scanner;

// class
public class RightTriangle {
	
	// global scanner
	static Scanner input = new Scanner(System.in);
	
	// main method
	public static void main(String[] args) {
		// 1. Get user input
		// 1.1. Get side 1
		double side1 = getSide1();
		// 1.2. Get side 2
		double side2 = getSide2();
		// 1.3. Calculate the hypotenuse
		double hypo = hypotenuse(side1, side2);
		// 2. Display the hypotenuse
		displayHypotenuse(hypo);

	}
	
	// side 1 method
	private static double getSide1() {
		System.out.print("Enter side 1: ");
		return input.nextDouble();
	}
	
	// side 2 method
	private static double getSide2() {
		System.out.print("Enter side 2: ");
		return input.nextDouble();
	}
	
	// hypotenuse method
	private static double hypotenuse(double side1, double side2) {
		return Math.hypot(side1, side2);
	}
	
	// display hypotenuse
	private static void displayHypotenuse(double hypo) {
		System.out.printf("The hypotenuse of the right triangle is %.1f", hypo);

	}
}
