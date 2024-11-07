package practice;

public class EvenOddSum {
	
	public static void main(String[] args) {
        int n = 10;

        // Test the sumEven method
        System.out.println("Sum of even integers from 0 to " + n + ": " + sumEven(n));
        
        // Test the sumOdd method
        System.out.println("Sum of odd integers from 0 to " + n + ": " + sumOdd(n));
    }
	
	
	
	// Recursive method to add even integers from 0 to n
    public static int sumEven(int n) {
        // Base case: If n is less than 0, return 0 (no more even numbers to add)
        if (n < 0) {
            return 0;
        }
        
        // If n is even, add it to the result of sumEven(n - 2)
        if (n % 2 == 0) {
            return n + sumEven(n - 2);
        }
        
        // Otherwise, call sumEven(n - 1) to check the next even number
        return sumEven(n - 1);
    }

    // Recursive method to add odd integers from 0 to n
    public static int sumOdd(int n) {
        // Base case: If n is less than 1, return 0 (no more odd numbers to add)
        if (n < 1) {
            return 0;
        }
        
        // If n is odd, add it to the result of sumOdd(n - 2)
        if (n % 2 != 0) {
            return n + sumOdd(n - 2);
        }
        
        // Otherwise, call sumOdd(n - 1) to check the next odd number
        return sumOdd(n - 1);
    }
	
}
