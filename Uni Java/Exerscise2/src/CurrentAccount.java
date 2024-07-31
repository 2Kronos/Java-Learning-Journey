import java.util.Scanner;
public class CurrentAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner withdraw = new Scanner(System.in);
		
		AccountTest bank = new AccountTest();
		bank.setBalance(100); // Set the initial balance
		
		System.out.println("Please enter the withdrawl amount");
		int withdrawAmount = withdraw.nextInt();
		
		bank.debit(withdrawAmount);
		
	}

}
