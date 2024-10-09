// Write a Java program that reads an integer from the user and prints the Fibonacci series up to that number.
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int numTerms = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}
