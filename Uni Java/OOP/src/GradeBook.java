
public class GradeBook {
	
	private String courseName;
	private String instructorName;
	
	// Constructor initilaizes courseName with string argument
	public GradeBook(String name, String name2) {
		courseName = name;
		instructorName = name2;
		
	}
	
	//Method to set name
	public void setCourseName(String name) {
		courseName = name;
		}
		
	
	//Method to retrieve the course name
	public String getCourseName() {
		return courseName;
		}
	
	public void setInstructorName(String name2) {
		instructorName = name2;
		}
	
	public String getInstructorName() {
		 return instructorName;
		}
	
	
	
	//Call getCourseName to get the name of the course this GradeBook represent
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for %s ", getCourseName());
		System.out.printf("Your instructor name %s ", getInstructorName());
		}
}
