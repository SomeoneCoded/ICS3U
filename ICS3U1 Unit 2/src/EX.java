/* Name: Dailiang Chen
 * Date: Mar 20, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to output a factorial
 * Major skills: Math, Algorithm, Methods
 */

// import utilities
import java.util.*;

// class
public class EX {
	
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
	
	// ex method
	public static double ex(int N, int X) {
		double [] exTerm = new double[N+1];
		
		exTerm[0] = 1; // 1
		exTerm[1] = exTerm[0] + X; // 1 + X/1!
		
		for(int i = 2; i <= N; i++) {
			exTerm[i] = (double) Math.pow(X, i)/factorial(i) + exTerm[i-1]; 
		}
		
		// return output
		return exTerm[N];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt user input
		System.out.print("Enter the number of terms: ");
		int terms = input.nextInt();
		System.out.print("Enter the value of X: ");
		int power = input.nextInt();
		
		System.out.printf("With the approximation of %d terms and with the value of x = %d, e^x = %.12f", terms, power, ex(terms, power));
	}

}
