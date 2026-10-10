package objects;

// class
public class Account {
	
	// instance variables
	private double balance;
	
	public Account(double initialBalance) {
		super(); // constructs new object
		if(initialBalance > 0.00) {
			balance = initialBalance;
		} else
			balance = 0.00;
		
	
	}
	
	// getters and setters
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	// to string method
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	// utility methods
	public void debit(double amount){
		balance-=amount;
	}
	
	public void credit(double amount) {
		balance += amount;
	}
}

