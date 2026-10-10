/*Name: Dailiang Chen
 *Date: Feb 20, 2024
 *Course: ICS3U1 - Mr. Fernandes
 *Description: Write a program that calculates soeone's target heart rate given their age and resting heart rate
 *Major skills: Math, Input-Process-Output
 */

//import Scanner
import java.util.Scanner;

//make class
public class HeartRate {
	
	//make main method
	public static void main(String[] args) {
		//implement scanner
		Scanner input  = new Scanner(System.in);
		
		//input age and resting heart rate
		System.out.print("What is your age: ");
		double age = input.nextDouble();
		System.out.print("\nWhat is your resting heart rate in bpm: ");
		double resting_heart_rate = input.nextDouble();
		
		//close scanner
		input.close();
		
		//process: calculate target heart rate
		double target_heart_rate = 0.7 * (double)(220 - age) + 0.3 * resting_heart_rate;
		
		//output target heart rate
		System.out.printf("\nYour target heart rate is %.1f bpm.", target_heart_rate);

	}

}
