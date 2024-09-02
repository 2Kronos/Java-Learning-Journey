//import java.util.Scanner;
public class GradeBookTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
		
		//grade book object created and assigned to myBb
//		GradeBook myGb = new GradeBook();
		
		
//		System.out.printf("Initil course name is: %s\n", myGb.getCourseName());
		
//		System.out.println("Please enter the course name:");
//		String nameOfCourse = input.nextLine();
//		myGb.setCourseName(nameOfCourse);
//		System.out.println();
		
		
		GradeBook myGb1 = new GradeBook("CS101 Intro to java programming","Danny");
		GradeBook myGb2 = new GradeBook("MATH51 Intro to Maths","Tshinge");
		
		
		System.out.printf("gradeBook1 course name is: %s and the instructor is %s\n", myGb1.getCourseName(), myGb1.getInstructorName());
		myGb1.getCourseName();
		
		System.out.printf("gradeBook2 course name iS: %s and the instructor is %s", myGb2.getCourseName(), myGb2.getInstructorName());
		myGb2.getCourseName();
		
		
	}

}
