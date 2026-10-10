//Name: Dailiang Chen
//Date: February 12, 2024
//Course: ICS3U1-04 - Mr.Fernandes
//Description: Write an application that inputs from the user the radius of a circle and prints the circle’s diameter, circumference and area.  (Use the predefined constant Math.PI which is defined in the java.lang package so you do not need to import it) (Circle)


//import scanner
import java.util.Scanner;

//class - same name as the .java file
public class Circle {

	// create main method
	public static void main(String[] args) {
		
		// state the variables
		double radius, diameter, circumference, area;
		
		// name the scanner
		Scanner sc = new Scanner(System.in);

		// input radius
		System.out.print("Enter Radius: ");
		radius = sc.nextDouble();
		sc.close(); // closes scanner

		// area of circle = pi*r^2
		area = Math.PI * Math.pow(radius, 2);

		// diameter of a circle
		diameter = 2 * radius;

		// circumference of a circle
		circumference = 2 * Math.PI * radius;

		// output the results
		System.out.printf("The radius is %.1f\nThe diameter is %.1f\nThe circumference is %.2f\nThe area is %.2f", radius, diameter, circumference, area);
	}
}
