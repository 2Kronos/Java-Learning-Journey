import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		
	      Scanner input = new Scanner(System.in);
	        
	        int number1; //First number to add
	        int number2; //second number to add
	        int sum;
	        
	        System.out.print("Enter first integer:"); //prompt message
	        number1 = input.nextInt(); //read first number from user
	        
	        System.out.print("Enter second integer:"); //prompt message
	        number2 = input.nextInt(); //read second number from user
	        
	        sum = number1 + number2;
	        
	        System.out.printf("Sum is %d\n", sum);
	}

}
