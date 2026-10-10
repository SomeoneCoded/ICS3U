package objects;

// import scanner
import java.util.Scanner;

// class
public class GradeBookTest {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		
		// course code
		System.out.print("Enter your course code: ");
		String courseCode = input.next();
		// instructor's name
		System.out.print("Enter your instructor's name: ");
		String courseInstructor = input.next();
		
		// object
		GradeBook course1 = new GradeBook(courseCode, courseInstructor);
		course1.displayMessage();

	}

}
