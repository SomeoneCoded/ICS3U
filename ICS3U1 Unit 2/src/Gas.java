/* Name: Dailiang Chen
 * Date: Mar 6, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to calculate gas mileage
 * Major skills: Math, Algorithm, While Loops
 */

// import scanner
import java.util.Scanner;

// make class
public class Gas {
	// make main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Have variable to track kilometers
		double totalKilometers = 0, totalLitres = 0;
		// track which gas tank we are on
		int gasTankNumber = 1;
		
		// Have a while-loop to track the amount of gas tanks
		while(true) {
			System.out.printf("Gas tank #%d\n".formatted(gasTankNumber));
			// Input kilometers
			System.out.print("Enter the amount of kilometers driven: ");
			double kilometers = input.nextDouble();
			// Input gas used
			System.out.print("Enter the amount of litres of gas consumed: ");
			double gasAmount = input.nextDouble();
			
			// Calculate total kilometers, litres, kilometers/litre up to this point
			totalKilometers+= kilometers;
			totalLitres+=gasAmount;
			System.out.printf("The kilometers per litre of this gas tank is %.2f km/L\n", kilometers/gasAmount);
			
			// Ask for another input
			System.out.print("Do you want to enter in another gas tank? Type 'Yes' or 'No': ");
			String prompt = input.next();
			if(prompt.equals("Yes")) {
			// Repeat processing
				gasTankNumber++;
				continue;
			} else if(prompt.equals("No")){
				// Output total gas tanks
				System.out.printf("The total amount of gas tanks you inputted is %d\n", gasTankNumber);
				// Exit while loop
				break;
			} else {
				// Invalid answer will result in program exiting
				System.out.println("Invalid input. Exiting process...");
				break;
			}
			
		}

		// Calculate total average
		double averageKilometersPerLitre = (double) totalKilometers/totalLitres;

		// Output total kilometers per litre
		System.out.printf("The average kilometers per litre is %.2f km/L", averageKilometersPerLitre);
	}

}
