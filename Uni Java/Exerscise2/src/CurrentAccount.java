import java.util.Scanner;
public class CurrentAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		AccountTest bank = new AccountTest();
		
		System.out.println("Pick an option /n 1. Deposit /n 2. Withdraw");
		int option = input.nextInt();

		if (option == 1) {
			System.out.println("Enter the amount you want to deposit");
			int depositAmount = input.nextInt();
			bank.setBalance(depositAmount); 
		}
		else if (option == 2) {
			System.out.println("Enter the amount you want to withdraw");
			int withdrawAmount = input.nextInt();
		bank.debit(withdrawAmount);
		}
		
		else {
			System.out.println("Invalid option");
		}
	

		

		
	}

}
