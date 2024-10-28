package practice;
//2. Write a Java recursive method to calculate the sum of all numbers from 1 to n
public class Sum {
 public static void main (String[]args) {
	 
	 int num = 5;
	 int sum = total(num);
	 System.out.printf("SUM = %d", sum);
 }
 
 public static int total(int n){
	 
	 if(n==1) {
		 return 1;}
	 else {
		 return n + total(n - 1);
	 }
 }
}

//correction return n +=total(n-1);
//better to write return n + total(n - 1);