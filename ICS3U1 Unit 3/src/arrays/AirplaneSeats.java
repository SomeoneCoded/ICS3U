/* Name: Dailiang Chen
 * Date: April 16, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that simulates an airplane seating system
 * Major skills: Methods, Arrays
 */

// import arrays, scanner
package arrays;

import java.util.Arrays;
import java.util.Scanner;

// class
public class AirplaneSeats {

	// airplane seat
	static boolean[] seats = new boolean[11];

	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		Arrays.fill(seats, false); // false = empty seat

		// seating capacity variables
		int seatCapacity = 10;
		int firstClassCapacity = 5;
		int economyClassCapacity = 5;
		int seatingOption = 0;

		// while the airplane is not full
		while (seatCapacity > 0) {
			// 1. ask for the seat type
			System.out.print("Enter 1) First Class, 2) Economy 3) Take Off: ");
			seatingOption = input.nextInt();

			// if it is first class
			if (seatingOption == 1) {
				if (firstClassCapacity == 0) { // first class is full
					System.out.print("\nDo you want to sit in another class? (Y/N): ");

					if (input.next().toUpperCase().equals("Y")) { // switch to other class
						assignEconomyClass(economyClassCapacity);
						economyClassCapacity--;
						seatCapacity--;
					} else {
						System.out.println("\nYour next flight will leave in 3 hours.\n");
					}

				} else { // assign the seat
					assignFirstClass(firstClassCapacity);
					firstClassCapacity--;
					seatCapacity--;
				}

			}

			// if it is economy
			else if (seatingOption == 2) {
				if (economyClassCapacity == 0) { // economy is full
					System.out.print("\nDo you want to sit in another class? (Y/N): ");

					if (input.next().toUpperCase().equals("Y")) { // switch to other class
						assignFirstClass(firstClassCapacity);
						firstClassCapacity--;
						seatCapacity--;
					} else {
						System.out.println("\nYour next flight will leave in 3 hours.\n");
					}

				} else { // assign the seat
					assignEconomyClass(economyClassCapacity);
					economyClassCapacity--;
					seatCapacity--;
				}

			}

			// take off
			else
				break;

		}

		// take off message
		System.out.println("\nBon Voyage!");
	}

	// assign first class method
	private static void assignFirstClass(int firstClassCapacity) {
		seats[firstClassCapacity] = true; // set one of the seats to be full
		displayAirplaneSeat(seats);

	}

	// assign economy class method
	private static void assignEconomyClass(int economyClassCapacity) {
		seats[seats.length - economyClassCapacity] = true;
		displayAirplaneSeat(seats);

	}

	// display airplane seats method
	private static void displayAirplaneSeat(boolean[] seatingPlan) {
		System.out.print("\nAirplane Seat Status: ");
		for (int idx = 1; idx < seatingPlan.length; idx++)
			System.out.print(seatingPlan[idx] + " "); // print the status of each seat
		System.out.println("\n");
	}

}
