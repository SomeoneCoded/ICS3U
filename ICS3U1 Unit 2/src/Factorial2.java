/* Name: Dailiang Chen
 * Date: Mar 25, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to output a factorial
 * Major skills: Math, Algorithm, For Loops
 */

// import utilities
import java.util.*;

// class
public class Factorial2 {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// initial factorial of 1
		long factorial = 1;
		for(int i = 1; i <= 20; i++) {
			// factorial = oldFactorial * i
			System.out.printf("%d! = %d\n", i, factorial*=i);
			
		}
	}

}
