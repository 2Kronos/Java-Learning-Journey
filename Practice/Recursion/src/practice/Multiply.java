package practice;

public class Multiply {
	
	// Recursive method to multiply two integers
    public static int multiply(int a, int b) {
        // Base case: if multiplier b is 0, return 0
        if (b == 0) {
            return 0;
        }
        
        // If multiplier b is positive, recursively add a to the result of multiplying a and b-1
        if (b > 0) {
            return a + multiply(a, b - 1);
        }
        
        // If multiplier b is negative, convert it to positive and negate the result
        return -multiply(a, -b);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        
        // Test the multiply function with positive numbers
        System.out.println(num1 + " multiplied by " + num2 + " is " + multiply(num1, num2));
        
        // Test the multiply function with negative multiplier
        num2 = -3;
        System.out.println(num1 + " multiplied by " + num2 + " is " + multiply(num1, num2));
    }
}
