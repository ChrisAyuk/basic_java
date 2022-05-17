package bank;

public class SavingsAccount {

	static double annualInterestRate = 0.0;
	private double savingsBalance = 0.0;
	
	public double getInterestRate() {
		return annualInterestRate;
	}
	public void setInterestRate(double rate) {
		annualInterestRate = rate;
	}
	
	public void setBalance(double balance) {
		savingsBalance = balance;
	}
	public double getBalance() {
		return savingsBalance;
	}
	
	public void calculateMonthlyInterest() {
		
		double interest =  (savingsBalance*annualInterestRate)/12;
		
		savingsBalance = interest + savingsBalance;
	}
	public static void modifyInterestRate(double newrate) {
		 annualInterestRate = newrate;
	}
	
	public double deposit(double amt) {
		savingsBalance = savingsBalance + amt;
		return savingsBalance;
	}
	
	public double withdraw(double amt) {
		savingsBalance = savingsBalance - amt;
		amt = amt - (amt*0.1);
		return savingsBalance;
	}
	
	public void SavingsInterestMonthly(int m) {
		for (int i=0; i<m; i++){
			calculateMonthlyInterest();
		}
	}
}
