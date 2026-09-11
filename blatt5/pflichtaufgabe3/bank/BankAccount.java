package bank;

public class BankAccount {
	private String owner;
	private double balance;
	
	public BankAccount(String owner, double initialBalance) {
		this.owner   = owner;
		this.balance = initialBalance;
	}
	
	public double getBalance() { 
	    return balance; 
	}
	
	public String getOwner() { 
	    return owner;   
	}
	
	// TODO: Teilaufgabe a)
	public void deposit(double amount) {

	}
	
	// TODO: Teilaufgabe b)
	public void withdraw(double amount) throws InsufficientFundsException {

	}
	
	public String toString() {
		return String.format("Konto von %s: %.2f Euro", 
		owner, balance);
	}
}