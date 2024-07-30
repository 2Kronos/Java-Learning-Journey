import java.util.Scanner;
public class Arithmetic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		
		int numb1;
		int numb2;
		int numb3;
		
		 System.out.print("Enter first integer:"); //prompt message
	        numb1 = data.nextInt(); //read first number from user
	        
	   	 System.out.print("Enter second integer:"); //prompt message
	        numb2 = data.nextInt(); //read second number from user
	        
	   	 System.out.print("Enter third integer:"); //prompt message
	        numb3 = data.nextInt(); //read third number from user
	        
        if(numb1>numb2 && numb1>numb3) {
	        	System.out.printf("%d is the biggest\n", numb1);
	        	if (numb2<numb3)
	        	{
	        		System.out.printf("%d is the smallest\n", numb2);
	        	}else if(numb3<numb2) {
	        		System.out.printf("|%d is the smallest\n", numb3);
	        	}
	        		
	        }else if (numb2> numb1 && numb2>numb3){
	        	System.out.printf("%d is the biggest\n", numb2);
	        	
	        	if (numb1<numb3)
	        	{
	        		System.out.printf("%d is the smallest\n", numb1);
	        	}else if(numb3<numb1) {
	        		System.out.printf("%d is the smallest\n", numb3);
	        	}
	        }
	        else if
	        (numb3>numb1 && numb3>numb2) {
	        	System.out.printf("%d is the bigges\n", numb3);
	        	if (numb2<numb1)
	        	{
	        		System.out.printf("%d is the smallest\n", numb2);
	        	}else if(numb1<numb2) {
	        		System.out.printf("%d is the smallest\n", numb1);
	        	}
	        }
        int average;
        average = (numb1 + numb2 + numb3)/3;
        System.out.printf("the average is %d", average);
	}

}
