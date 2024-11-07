package revision;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects with initial details
        Employee employee1 = new Employee("John", "Doe", 101, 3000.00);
        Employee employee2 = new Employee("Jane", "Smith", 102, 3500.00);

        // Display details of the employees before the raise
        System.out.println("Before 10% Raise:");
        employee1.displayDetails();
        employee2.displayDetails();

        // Apply a 10% raise to both employees
        employee1.applyRaise();
        employee2.applyRaise();

        // Display details of the employees after the raise
        System.out.println("After 10% Raise:");
        employee1.displayDetails();
        employee2.displayDetails();
    }
}
