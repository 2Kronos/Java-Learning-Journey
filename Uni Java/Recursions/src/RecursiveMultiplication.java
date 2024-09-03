import java.util.Scanner;

public class RecursiveMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request user input
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        // Compute the product using the recursive method
        int result = recursiveMultiply(a, b);

        // Display the result
        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }

    // Recursive method to multiply two integers using only addition and subtraction
    public static int recursiveMultiply(int a, int b) {
        // Base case
        if (b == 0) {
            return 0;
        }
        // If b is positive
        if (b > 0) {
            return a + recursiveMultiply(a, b - 1);
        }
        // If b is negative
        if (b < 0) {
            return -recursiveMultiply(a, -b);
        }
        return 0; // This line will never be reached
    }
}
