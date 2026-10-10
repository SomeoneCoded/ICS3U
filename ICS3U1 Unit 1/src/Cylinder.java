/* Name: Dailiang Chen
 * Date: Feb 22, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that gets the surface area and volume of a cylinder
 * Major skills: Math, IPO
 */

// import scanner
import java.util.Scanner;

// make class
public class Cylinder {

	// make main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);

		// input radius, height
		System.out.print("Enter the radius of the cylinder in units: ");
		double radius = input.nextDouble();
		System.out.print("Enter the height of the cylinder in units: ");
		double height = input.nextDouble();
		
		// calculate surface area and volume
		double surfacearea = 2 * Math.pow(radius, 2) * Math.PI + height * 2 * radius * Math.PI;
		double volume = Math.pow(radius, 2) * Math.PI * height;
		
		// output surface area and volume
		System.out.printf("The surface are of the cylnder is %.2f units squared." + "\nThe volume of the cylinder is %.2f units cubed.",
				surfacearea, volume);

	}

}
