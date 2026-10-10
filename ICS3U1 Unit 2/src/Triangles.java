/* Name: Dailiang Chen
 * Date: Mar 26, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to output 4 different triangular patterns
 * Major skills: Math, Algorithm, For Loops
 */

// class
public class Triangles {

	// main method
	public static void main(String[] args) {

		// Pattern A:
		System.out.println("Triangle A:\n");
		for (int row = 1; row <= 10; row++) { // use row number to determine number of stars that will be printed
			for (int stars = 1; stars <= row; stars++) {
				System.out.print("*"); // print stars
			}
			System.out.println(); // print a line for the next row
		}
		System.out.println(); // print a line for the next pattern

		// Pattern B:
		System.out.println("Triangle B:\n");
		for (int row = 10; row >= 1; row--) { // use row number to determine the number of stars that will be printed
			for (int stars = row; stars >= 1; stars--) {
				System.out.print("*"); // print stars
			}
			System.out.println(); // print a line for the next row
		}

		System.out.println(); // print a line for the next pattern

		// Pattern C:
		System.out.println("Triangle C:\n");
		for (int row = 1, rowReverse = 10; row <= 10; row++, rowReverse--) { // use row number to determine the number
																				// of spaces. use rowReverse number to
																				// determine the number of stars
			for (int spaces = 0; spaces < row - 1; spaces++) {
				System.out.print(" "); // print spaces
			}
			for (int stars = rowReverse; stars >= 1; stars--) {
				System.out.print("*"); // print stars
			}
			System.out.println(); // print a line for the next row
		}
		System.out.println(); // print a line for the next patter

		// Pattern D:
		System.out.println("Triangle D:\n");
		for (int row = 1, rowReverse = 10; row <= 10; row++, rowReverse--) { // use row number to determine the number
																				// of stars. use rowReverse number to
																				// determine the number of spaces
			for (int spaces = rowReverse - 1; spaces > 0; spaces--) {
				System.out.print(" "); // print spaces
			}
			for (int stars = 1; stars <= row; stars++) {
				System.out.print("*"); // print stars
			}
			System.out.println(); // print a line for the next row
		}
		System.out.println(); // print a line for the next triangle (if there is any more)
	}

}
