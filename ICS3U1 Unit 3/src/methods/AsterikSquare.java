/* Name: Dailiang Chen
 * Date: April 9, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: rite a program that creates a square with asteriks
 * Major skills: Methods
 */

// import scanner
package methods;

import java.util.Scanner;
// class
public class AsterikSquare {
	// main method
	public static void main(String[] args) {
		// get side length
		int side = getSide();
		// create square
		squareOfAsteriks(side);
	}
	
	// side length
	private static int getSide() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		return input.nextInt();
	}
	
	// print square
	private static void squareOfAsteriks(int side) {
		for(int row = 1; row <= side; row++) {
			for(int column = 1; column <= side; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
