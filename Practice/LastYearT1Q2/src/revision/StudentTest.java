package revision;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter student details
        System.out.println("Enter student's first name:");
        String firstName = input.nextLine();

        System.out.println("Enter student's last name:");
        String lastName = input.nextLine();

        System.out.println("Enter student's student number:");
        String studentNumber = input.nextLine();

        System.out.println("Enter student's gender:");
        String gender = input.nextLine();

        System.out.println("Enter student's program of study:");
        String programOfStudy = input.nextLine();

        // Create a Student object and initialize it with the input data
        Student student = new Student(firstName, lastName, studentNumber, gender, programOfStudy);

        // Display the details of the student using the get-methods
        System.out.println("\nStudent Details:");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Student Number: " + student.getStudentNumber());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Program of Study: " + student.getProgramOfStudy());

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
