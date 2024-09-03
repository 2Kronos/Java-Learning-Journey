import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Request user input until a positive number is entered
        do {
            System.out.print("Enter a positive integer: ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (number <= 0);

        // Compute the sum of odd numbers using the recursive method
        int result = sumOfOddNumbers(number);

        // Output the result
        System.out.println("Sum of odd numbers between 0 and " + number + " = " + result);
    }

    // Recursive method to compute the sum of odd numbers up to n
    public static int sumOfOddNumbers(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 2 == 1) {
            return n + sumOfOddNumbers(n - 2);
        } else {
            return sumOfOddNumbers(n - 1);
        }
    }
}
