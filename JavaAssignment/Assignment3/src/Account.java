
public class Account {
	private int id;
	private int accountCount;
	private double balance;
	private static int idCounter = 0;
	
	public Account() {
		
	}
	
	public Account(double b) {
		this.id = ++idCounter;
		this.balance = b;
		this.accountCount++;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean withdraw(double amount) {
		if(balance < amount) return false;
		else {
			balance -= amount;
			return true;
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
