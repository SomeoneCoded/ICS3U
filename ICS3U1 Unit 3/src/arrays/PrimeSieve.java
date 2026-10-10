/* Name: Dailiang Chen
 * Date: April 12, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that gets the prime numbers (2-999) using the Sieve method
 * Major skills: Methods, Array
 */

// class
package arrays;

public class PrimeSieve {
	
	// static isPrimeArray
	static boolean [] isPrimeArray = new boolean[1000];
	
	// main method
	public static void main(String[] args) {
		// 1. create prime number array method
		setPrime(isPrimeArray);
		// 2. check and look for prime numbers
		filterPrime(isPrimeArray);
		// 3. display the prime numbers
		displayPrime(isPrimeArray);

	}
	
	// create prime number array (boolean)
	private static void setPrime(boolean[] isPrime2) {
		for(int idx = 0; idx < isPrimeArray.length; idx++)
			isPrimeArray[idx] = true; // set every index to be true
		
	}
	
	// check for prime numbers method
	private static void filterPrime(boolean[] isPrime2) {
		for(int idx = 2; idx < isPrimeArray.length / 2; idx++) {
			int division = idx;
			if(isPrimeArray[idx]) { // if element is a prime number
				for(int setElement = idx+1; setElement < isPrimeArray.length; setElement++) {
					if(setElement % division == 0) // if it isn't prime, set it as false
						isPrimeArray[setElement] = false;
				}
			}
		}
		
	}

	// display all prime numbers method
	private static void displayPrime(boolean[] isPrime2) {
		for(int idx = 2; idx < isPrimeArray.length; idx++) { // go through the array
			if(isPrimeArray[idx])
				System.out.println(idx + " "); // output results
		}
		
	}

}
