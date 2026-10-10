/* Name: Dailiang Chen
 * Date: April 6, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that converts celsius to fahrenheit (and vice versa)
 * Major skills: Methods
 */

// class
package arrays;

public class Prime {
	
	// main method
	public static void main(String[] args) {
		// prime number method
		isPrime();

	}
	
	// prime number method
	private static void isPrime() {
		boolean isPrime = true;
		for(int number = 2; number <= 10000; number++) { // numbers under 10000
			for(int factors = 2; factors <= (int) Math.sqrt(number); factors++) { // check factors less than square root of the number
				if(number % factors == 0) { // not a prime number
					isPrime = false;
					break;
				}
					
			}
			if(isPrime)
				System.out.printf("%d is a prime number\n", number); // is a prime number
			
			isPrime = true;
		}
		
	}

}
