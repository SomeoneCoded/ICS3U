/* Name: Dailiang Chen
 * Date: Mar 28, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to create a triangle tiled patter
 * Major skills: Math, Algorithm, for loops
 */

// class
public class Triangles2 {
	// main method
	public static void main(String[] args) {
		// rows
		for (int row = 1, reverseRow = 10; row <= 10; row++, reverseRow--) {
			// Triangle 1
			for (int stars = 1; stars <= row; stars++)
				System.out.print("*");

			// Triangle 2
			for (int spaces = reverseRow - 1; spaces >= 1; spaces--)
				System.out.print(" ");

			// Triangle 3
			for (int stars = reverseRow; stars >= 1; stars--)
				System.out.print("*");

			// Triangle 4 Left
			for (int spaces = row - 1; spaces >= 1; spaces--)
				System.out.print(" ");

			// Triangle 4 Right
			for (int spaces = row - 1; spaces >= 1; spaces--)
				System.out.print(" ");

			// Triangle 5
			for (int stars = reverseRow; stars >= 1; stars--)
				System.out.print("*");

			// Triangle 6
			for (int spaces = reverseRow - 1; spaces >= 1; spaces--)
				System.out.print(" ");

			// Triangle 7
			for (int stars = 1; stars <= row; stars++)
				System.out.print("*");

			// new row
			System.out.println();
		}

	}

}
