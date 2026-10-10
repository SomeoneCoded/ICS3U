/* Name: Dailiang Chen
 * Date: April 6, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that converts celsius to fahrenheit (and vice versa)
 * Major skills: Methods
 */

// import scanner
package methods;

import java.util.Scanner;

// class
public class Temperature {
	
	// global scanner
	static Scanner input = new Scanner(System.in);
	
	// main method
	public static void main(String[] args) {
		// get temperature
		double temperatureValue = getValue();
		// temperature type
		String temperatureType = getType();
		if(temperatureType.toUpperCase().equals("F"))
			convertToCelsius(temperatureValue); // convert to celsius
		else if(temperatureType.toUpperCase().equals("C"))
			convertToFahrenheit(temperatureValue); // convert to fahrenheit

	}
	
	// get value method
	private static Double getValue() {
		System.out.print("Enter the temperature value: ");
		return input.nextDouble();
	}
	
	// get temperature type method
	private static String getType() {
		System.out.print("Is this temperature in Celsius (C) or Fahrenheit (F)? ");
		return input.next();
	}
	
	// celsius --> fahrenheit method
	private static void convertToFahrenheit(double celsius) {
		double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
		System.out.printf("%.1fC is %.1fF", celsius, fahrenheit);
		
	}
	
	// fahrenheit --> celsius method
	private static void convertToCelsius(double fahrenheit) {
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		System.out.printf("%.1fF is %.1fC", fahrenheit, celsius);
		
	}

}
