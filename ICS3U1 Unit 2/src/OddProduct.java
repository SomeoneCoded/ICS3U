/* Name: Dailiang Chen
 * Date: Mar 25, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to output the product of 1*3*5*7*...*11*13*15
 * Major skills: Math, Algorithms, For Loops
 */

// class
public class OddProduct {
	// main method
	public static void main(String[] args) {
		// initial product of 1
		int product = 1;
		for(int i = 1; i <= 15; i+=2) {
			product*=i; // product *= oldProduct * i
		}
		// output
		System.out.printf("1*3*5*7*9*11*13*15 = %d", product); 
	}

}
