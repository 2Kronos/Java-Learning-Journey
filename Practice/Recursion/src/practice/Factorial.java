package practice;
//1. Write a Java recursive method to calculate the factorial of a given positive integer.
public class Factorial {

	public static void main(String[] args) {
		
		
		int num = 5;
		int result = factorialCal(num);
		System.out.printf("Factorial of %d is: %d\n", num, result);
	}

	public static int factorialCal(int n) {
		if (n == 1) {
			return 1; // Base case: factorial of 1 is 1
		} else {
			return n * factorialCal(n - 1); // Recursive case
		}
		
		//basically the equation will expan like a tree root 
		//from the first iteration and work its way down
		//to the base case and from their once we get a definite value 
		// we work our way back the root via substitution
		
		
		
//		// TODO Auto-generated method stub
//		int num =5;
//		factorialCal(num);
//	}
//    public static void factorialCal(int n) {
//    	int fac=n*(n-1);
//    	int sum=0;
//    	sum += fac; 
//    	System.out.printf("\n %d",sum);
//    	
//    	if(n==1) {
//    		return;
//    	}else {
//    		factorialCal(n-1);
//    	}
    }
}
