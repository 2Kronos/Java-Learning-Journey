import java.util.Scanner;
public class Multiplier {
	
public static int calcu(Integer numba, Integer numbb) {
		return numba + numbb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		   System.out.printf("Enter first integer:"); //prompt message
	        numb = input.nextInt(); //read first number from user
	        
	        System.out.printf("Enter second integer:"); //prompt message
	        terms = input.nextInt(); //read second number from user
	        
	        
		for(int j = 0 ; j<terms ; j++) {
			
		System.out.printf("Total = %d/n ", calcu(numb1, terms));

	}

}
