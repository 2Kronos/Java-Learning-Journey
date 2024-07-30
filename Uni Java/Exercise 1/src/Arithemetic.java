import java.util.Scanner;
public class Arithemetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		float num1;
		float num2;
		
		System.out.print("Enter first integer");
		num1 = input.nextFloat();
				
		System.out.print("Enter second integer");
		num2 = input.nextFloat();	
		
		float sum;
		sum = num1 + num2;
	    System.out.printf("Sum = %f\n", sum);
	    
		float difference;
		if (num1>num2){
			difference = num1 - num2;}
		else {
			difference = num2-num1;
			}
	    System.out.printf("Difference = %f\n", difference);
	    
		float product;
		product = num1 * num2;
	    System.out.printf("Product = %f\n", product);
	    
		float quotient;
		if(num1 != 0) {
			quotient = num1 / num2;
		    System.out.printf("Quotient = %f\n", quotient);	
		}else {
			System.out.println("Division by zero is not possible ");
		}
		
	}

}
