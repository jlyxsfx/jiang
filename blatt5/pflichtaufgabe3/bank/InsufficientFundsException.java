package bank;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(double amount) {
		super("Nicht genuegend Guthaben. Fehlend: " + amount 
		+ " Euro.");
	}
}