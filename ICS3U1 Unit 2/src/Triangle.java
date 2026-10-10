/* Name: Dailiang Chen
 * Date: Mar 19, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to determine whether three sides form a triangle (and if it does, whether it forms a right triangle)
 * Major skills: Math, Algorithm, nested loops, arrays
 */

// import arrays, scanner
import java.util.Arrays;
import java.util.Scanner;

// class

public class Triangle {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		
		// create array to store the three sides
		int[] sides = new int[3];
		for (int i = 0; i < 3; i++) {
			// Prompt user input
			System.out.print("Enter side " + (i + 1) + ": ");
			sides[i] = input.nextInt();
		}
		
		// sort the sides
		Arrays.sort(sides);
		
		// check to see if the sides can make a triangle
		if (sides[0] + sides[1] > sides[2]) {
			if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) { // check if the triangle is a right triangle
				System.out.println("This is a right triangle.");
			} else {
				System.out.println("This is a triangle, but not a right triangle.");
			}
		} else // sides do not form a triangle
			System.out.println("This is not a triangle");
	}

}
