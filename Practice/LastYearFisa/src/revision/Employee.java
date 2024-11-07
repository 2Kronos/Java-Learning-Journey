package revision;
public class Employee {
    // Private instance variables
    private String firstName;
    private String lastName;
    private int employeeId;
    private double monthlySalary;

    // Constructor to initialize instance variables
    public Employee(String firstName, String lastName, int employeeId, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;

        // Set the monthly salary, ensuring it's not negative
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0; // If salary is not positive, set it to zero
        }
    }

    // Set-methods (setters)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    // Get-methods (getters)
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to apply a 10% raise to the monthly salary
    public void applyRaise() {
        monthlySalary += monthlySalary * 0.10; // Apply 10% raise
    }

    // Method to display the employee's details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Yearly Salary: " + getYearlySalary());
        System.out.println();
    }
}
