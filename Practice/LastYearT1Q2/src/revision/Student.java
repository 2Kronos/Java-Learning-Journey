package revision;

public class Student {
    // Declare private instance variables
    private String firstName;
    private String lastName;
    private String studentNumber;
    private String gender;
    private String programOfStudy;

    // Constructor to initialize the instance variables
    public Student(String firstName, String lastName, String studentNumber, String gender, String programOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.gender = gender;
        this.programOfStudy = programOfStudy;
    }

    // Set-methods (setters)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setProgramOfStudy(String programOfStudy) {
        this.programOfStudy = programOfStudy;
    }

    // Get-methods (getters)
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getProgramOfStudy() {
        return programOfStudy;
    }
}

