import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		
		int p =1000;

		float r = 0.5f;

		float a = p*(1+r);

		for(int i = 0; i<10; ++i){

		  double sum = Math.pow(i, a);
		     System.out.printf("\nYear %d = %.3f", i, sum);
		}
	}

}
