/* Name: Dailiang Chen
 * Date: Mar 28, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to create a diamond pattern
 * Major skills: Math, Algorithm, for loops
 */

// class
public class Diamond {
	// main method
	public static void main(String[] args) {
		
		// top half
		for(int row = 1, reverseRow = 4; row <= 4; row++, reverseRow--) {
			for(int spaces = reverseRow; spaces >= 1; spaces--) { // spaces
				System.out.print(" ");
			}
			for(int stars = 1; stars <= 2*row - 1; stars++) { // stars
				System.out.print("*");
			}
			// new row
			System.out.println();
		}
		// middle
		for(int stars = 1; stars <= 9; stars++) {
			System.out.print("*"); // stars
		}
		// new row
		System.out.println();
		
		// bottom half
		for(int row = 1, reverseRow = 4; row <= 4; row++, reverseRow--) {
			for(int spaces = 1; spaces <= row; spaces++) { // spaces
				System.out.print(" ");
			}
			for(int stars = reverseRow*2-1; stars >= 1; stars--) { // stars
				System.out.print("*");
			}
			// new row
			System.out.println();
		}
	}

}
