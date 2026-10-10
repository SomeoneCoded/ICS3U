package objects;

public class GradeBook {
	
	// instance variables
	private String courseName;
	private String courseInstructor;
	
	// constructor method
	public GradeBook(String courseName, String courseInstructor) {
		super();
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
	}
	
	// getters and setters
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	// to String method (for testing purposes)
	@Override
	public String toString() {
		return "GradeBook [courseName=" + courseName + ", courseInstructor=" + courseInstructor + "]";
	}

	// utility method
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for %s\n", getCourseName());
		System.out.printf("This course is presented by %s\n", getCourseInstructor());
	}

}