/* Name: Dailiang Chen
 * Date: April 9, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that makes a sqare with any character
 * Major skills: Methods
 */

// import scanner
package methods;

import java.util.Scanner;
// class
public class CharacterSquare {
	
	// global scanner
	static Scanner input = new Scanner(System.in);
	
	// main method
	public static void main(String[] args) {
		// get side length
		int side = getSide();
		// get character
		String character = getCharacter();
		// display square
		squareOfCharacters(side, character);
		

	}
	
	// side method
	private static int getSide() {
		System.out.print("Enter the side length: ");
		return input.nextInt();
	}
	
	// character method
	private static String getCharacter() {
		System.out.print("Enter the character you want to display: ");
		return input.next();
	}
	
	// display square
	private static void squareOfCharacters(int side, String character) {
		for(int row = 1; row <= side; row++) {
			for(int column = 1; column <= side; column++) {
				System.out.printf("%s ", character);
			}
			System.out.println();
		}
		
	}

}
