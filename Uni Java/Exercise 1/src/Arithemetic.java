import java.util.Scanner;
public class Arithemetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter first integer");
		num1 = input.nextInt();
				
		System.out.print("Enter second integer");
		num2 = input.nextInt();	
		
		int sum;
		sum = num1 + num2;
	    System.out.printf("Sum = %d\n", sum);
	    
		int difference;
		difference = num1 - num2;
	    System.out.printf("Difference = %d\n", difference);
	    
		int product;
		product = num1 * num2;
	    System.out.printf("Product = %d\n", product);
	    
		int quotient;
		quotient = num1 / num2;
	    System.out.printf("Quotient = %d\n", quotient);
	}

}
