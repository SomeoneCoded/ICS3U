/* Name: Dailiang Chen
 * Date: April 9, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that gets the distance of two points
 * Major skills: Methods
 */

// import scanner
package methods;

import java.util.Scanner;

// class
public class PointsDistance {
	
	// global scanner
	static Scanner input = new Scanner(System.in);
	
	// main method
	public static void main(String[] args) {
		// get (x1, y1)
		double x1 = getX1(); double y1 = getY1();
		// get (x2, y2)
		double x2 = getX2(); double y2 = getY2();
		// calculate distance
		double distance = getDistance(x1, y1, x2, y2);
		// display result
		displayDistance(x1, y1, x2, y2, distance);
	}
	
	// x1 method
	private static double getX1() {
		System.out.print("Enter the X-coordinate of point 1: ");
		return input.nextDouble();
	}
	
	// y1 method
	private static double getY1() {
		System.out.print("Enter the Y-coordinate of point 1: ");
		return input.nextDouble();
	}
	
	// x2 method
	private static double getX2() {
		System.out.print("Enter the X-coordinate of point 2: ");
		return input.nextDouble();
	}
	
	// y2 method
	private static double getY2() {
		System.out.print("Enter the Y-coordinate of point 2: ");
		return input.nextDouble();
	}
	
	// distance formula
	private static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.hypot(x2-x1, y2-y1);
	}
	
	// display result
	private static void displayDistance(double x1, double y1, double x2, double y2, double distance) {
		System.out.printf("The distance between (%.1f ,%.1f) and (%.1f ,%.1f) is %.1f", x1,y1,x2,y2,distance);	
	}

}
