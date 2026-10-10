/* Name: Dailiang Chen
 * Date: Mar 20, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to output a factorial
 * Major skills: Math, Algorithm, Methods
 */

// import utilities
import java.util.*;

// class
public class Factorial {
	
	// factorial method
	public static long factorial(int N) {
		// dynamic programming
		long [] factorialTerm = new long[N+1];
		
		factorialTerm[0] = 1; // 0! = 1
		factorialTerm[1] = 1; // 1! = 1
		for(int i = 2; i <= N; i++) {
			factorialTerm[i] = i * factorialTerm[i-1]; //i! = i * (i-1)!
		}
		
		return factorialTerm[N]; // return i!
	}
	
	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompt user input
		System.out.print("Input the number of terms: ");
		int term = input.nextInt();
		
		// get output
		System.out.printf("%d! = %d", term, factorial(term)); // get result from method
	}

}
