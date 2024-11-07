package practice;

public class powerOf {

	 // Recursive method to calculate base raised to the power of exponent
    public static double power(double base, int exponent) {
        // Base case: If the exponent is 0, return 1
        if (exponent == 0) {
            return 1;
        }
        
        // If the exponent is positive
        if (exponent > 0) {
            return base * power(base, exponent - 1);
        }
        
        // If the exponent is negative, we use the reciprocal rule
        return 1 / power(base, -exponent);
    }

    public static void main(String[] args) {
        double base = 2.0;
        int exponent = 3;
        
        // Test the power function with positive exponent
        System.out.println(base + " raised to the power of " + exponent + " is " + power(base, exponent));
        
        exponent = -3;
        base = 3.0;
        // Test the power function with negative exponent
        System.out.println(base + " raised to the power of " + exponent + " is " + power(base, exponent));
    }
}
