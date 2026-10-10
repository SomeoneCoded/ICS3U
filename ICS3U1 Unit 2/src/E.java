/* Name: Dailiang Chen
 * Date: Mar 20, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to output a factorial
 * Major skills: Math, Algorithm, Methods
 */

// import utilities
import java.util.*;

public class E {

	// factorial method
	public static long factorial(int N) {
		// dynamic programming
		long[] factorialTerm = new long[N + 1];

		factorialTerm[0] = 1; // 0! = 1
		factorialTerm[1] = 1; // 1! = 1
		for (int i = 2; i <= N; i++) {
			factorialTerm[i] = i * factorialTerm[i - 1]; // i! = i * (i-1)!
		}

		return factorialTerm[N]; // return i!
	}
	
	// e method
	public static double e(int N) {
		double[] eTerm = new double[N + 1];

		eTerm[0] = 1; // 1
		eTerm[1] = 2; // 1 + 1/1!
		for (int i = 2; i <= N; i++) {
			eTerm[i] = (double) 1 / factorial(i) + eTerm[i - 1]; // 1 + 1/1! + 1/2! + 1/3! + ... + 1/(i-1)! + 1/i!
		}

		return eTerm[N]; // output
	}
	
	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		// prompt user input
		System.out.print("Enter the number of terms for approximation of e: ");
		int term = input.nextInt();
		
		// output
		System.out.printf("With the approximation of %d term(s), e = %.12f", term, e(term));
	}

}
