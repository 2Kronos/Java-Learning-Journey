// Write a Java program to find the factorial of a given number using a recursive function.
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is " + factorial);
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
