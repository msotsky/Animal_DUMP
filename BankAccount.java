/** Maxime Sotsky 0270251
 * 
 * @author Duane Bailey
 * @date   10 September 2020
 * @version 1.0
 * 
 * @implNote This code is incomplete and will not compile
 * Members: Crystal Sharpe, Alexia Bierlaire, Erika Hill
 */

public class BankAccount {
	
	// Where are those instance variables?
	private String acc; // <- my instance vars
	private double bal;
	// Constructor
	public BankAccount(String account, double balance) {
		acc = account; // <-setting instance vars to constructor param
		bal = balance;
		// pre: account is a string identifying the bank account
		//      balance is the starting balance
		// post: constructs a bank account with the desired balance
	}
	
	// Methods	
	
	public void deposit(double amount) {
		//bank.getAccount();
		bal += amount;
		// post: deposit money in the bank account
	}
   	
	public void withdraw(double amount) {
		bal -= amount; //can go into negatives

		// pre: there are sufficient funds in the account
		// post: withdraw money from the bank account
	}
	
	// Getters and Setters and Equals
	
	public String getAccount() {
		return  acc;
		// post: returns the bank account number of this account
	}
	
	public double getBalance() {
		return bal;
		// post: returns the bank account number of this account
	}
	
	public boolean equals(Object other) {
	
		if (other instanceof BankAccount){
			System.out.println("VALID OBJECT");
			//return true;
		}
		if (!(other instanceof BankAccount)){
			System.out.println("INVALID OBJECT");
			//return false;
		}
		
		//if (this.equals(other)){
		BankAccount acc = (BankAccount) other;
		if (this.getAccount().equals(acc.getAccount())&& this.getBalance() == acc.getBalance()){
			System.out.println("These accounts are the same");
			return true;
		}
		else{
			System.out.println("These accounts are different");
			return false;
		}
		
		//if ((this.bal == other.bal && (this.acc == other.acc)){
			//return true;
		//}
		//else{
				//return false;
		//}
		// pre: other is a valid bank account
		// post: returns true if this bank account is the same as other
	}
	public static void main(String[] args){
		BankAccount bank = new BankAccount("my account name", 100.00);
		System.out.println("Testing getBalance method");
		System.out.println(bank.getBalance());
		System.out.println("Testing getAccount method");
		System.out.println(bank.getAccount());
		System.out.println("Testing deposit method");
		bank.deposit(1.00);
		System.out.println(bank.getBalance());
		System.out.println("Testing withdraw method");
		bank.withdraw(95.00);
		System.out.println(bank.getBalance());
		System.out.println("Testing equals method");
		BankAccount bank2 = new BankAccount("your account name",200.00);
		System.out.println(bank.equals(bank2));
		BankAccount bank3 = new BankAccount("my account name", 6.00);
		System.out.println(bank.equals(bank3));
	}
	
}
