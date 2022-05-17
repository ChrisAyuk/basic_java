package bank;
import java.util.*;

public class testSavingsAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount save1 = new SavingsAccount ();
		save1.setBalance(200000.00);
		save1.setInterestRate(0.4);
		save1.calculateMonthlyInterest();
		
		SavingsAccount save2 = new SavingsAccount();
		save2.setBalance(300000.00);
		save2.setInterestRate(0.4);
		save2.calculateMonthlyInterest();
		
		System.out.printf("Your Saving balance for save1 is %.2f\n", save1.getBalance());
		System.out.printf("Your Saving balance for save2 is %.2f\n", save2.getBalance());
		
		System.out.printf("Do you wish to deposite(D) or withdraw(W): " );
		Scanner scan = new Scanner(System.in);
		char choice = scan.next().charAt(0);
				
		switch(choice) {
		case 'D' | 'd':
			System.out.println("Input your amount: ");
			Scanner in = new Scanner(System.in);
			double amt = in.nextDouble();
			save2.deposit(amt);
			System.out.printf("Your Saving balance for save2 is now %.2f\n", save2.getBalance());
			break;
		}
	}

}
