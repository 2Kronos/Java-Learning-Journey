package fisa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		int num = 0; // Initialize num

		Scanner input = new Scanner(System.in);

		// Repeatedly prompt the user until a valid integer is entered
		boolean validInput = false;
		//Essentially, !validInput means "while validInput is not true.
		//" In other words, the loop will continue executing as long as validInput is false.
		while (!validInput) {
			System.out.println("Enter the upper limit (positive or negative integer): ");
			try {
				num = input.nextInt(); // Try to read an integer
				validInput = true; // Valid input, exit loop
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
				input.next(); // Clear the invalid input
			}
		}

		if (num > 0) {
			// For positive numbers, ensure 'start' is the largest even number <= num
			int posstart = num;
			if (num % 2 != 0) {
				posstart = num - 1; // Make it even
			}
			System.out.printf("Sum of even numbers between 0 and %d = %d%n", num, evenTotal(posstart));
		} else if (num < 0) {
			// For negative numbers, ensure 'start' is the smallest even number >= num
			int negstart = num;
			if (num % 2 != 0) {
				negstart = num + 1; // Make it even
			}
			System.out.printf("Sum of even numbers between %d and 0 = %d%n", num, evenNegTotal(negstart));
		} else {
			System.out.println("No even numbers to sum for input 0.");
		}

		input.close();
	}

	public static int evenTotal(int a) {
		// Base case: if a is less than or equal to zero, return 0
		if (a <= 0) {
			return 0;
		}
		// Recursive step: add current even number 'a' and call with the next even number (a - 2)
		return a + evenTotal(a - 2);
	}

	public static int evenNegTotal(int a) {
		// Base case: if a is greater than or equal to zero, return 0
		if (a >= 0) {
			return 0;
		}
		// Recursive step: add current even number 'a' and call with the next even number (a + 2)
		return a + evenNegTotal(a + 2);
	}
}


// iterave method to get sum of evn numbers

// public static int evenTotal(int a) {
// int sum=0;
// for(int i=0; i<a; i= i +2) {
// sum = sum + i;
// }
// return sum;
// }



//If the user enters something that is not a valid integer
//(e.g., a string or a floating-point number), 
//the InputMismatchException is thrown.
//In the catch block, the program prints an error message and 
//calls input.next() to consume the 
//invalid input so that the scanner is 
//ready for the next attempt.
//The value of validInput remains 
//false, causing the loop to repeat and prompt the user again