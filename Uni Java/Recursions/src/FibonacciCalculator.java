
public class FibonacciCalculator {
	
//	private static int number;
	
	public static int fibonacci(int number)
	{
		if(number == 0 || number == 1)
			return number;
		else
			return fibonacci(number -1) + fibonacci(number -2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int counter = 0; counter <40; counter++) {
			
			System.out.printf("Fibonacci of %d is :%d\n", counter,fibonacci(counter));
		}
	}

}
