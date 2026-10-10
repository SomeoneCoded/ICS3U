/* Name: Dailiang Chen
 * Date: April 6, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that finds a perfect value
 * Major skills: Methods
 */

// class
package methods;

public class Perfect {

	// main method
	public static void main(String[] args) {
		// perfect number method
		perfect();

	}
	
	// perfect number method
	private static void perfect() {
		int number = 2; // number we will check
		int tempNumber = 0; // sum of all factors
		while(number <= 10000) { // check numbers all under 10000 (inclusive)
			for(int factor = 1; factor <= (int) Math.sqrt(number); factor++) {
				if(number % factor == 0) { // check if the number is factorable
					if(factor == 1) // if the factor is 1
						tempNumber++;
					else if(number % factor == factor) // square roots
						tempNumber+= factor;
					else // two different factors
						tempNumber+= number / factor + factor;
				}
			}
			if(number == tempNumber) // print the number if it is perfect
				System.out.printf("%d is a perfect number!\n", number);
			
			
			number++; // new number
			tempNumber = 0; // reset
			
		}
		
	}

}
