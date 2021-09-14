import java.text.NumberFormat;

public class Account {
	
	NumberFormat money = NumberFormat.getCurrencyInstance();

	// Define the Properties 
	private long id;
	private double balance;
	private double interestRate; 
	
	// Constructors 
	public Account()
	{
		id = -1;
		balance = 5;
		interestRate = 0;
	}
	
	public Account(long id, double balance)
	{
		this.id = id;
		this.balance = balance; 
		interestRate = 0;
	}
	
	// Define the methods
	
	// Id methods 
	public long idAccessor()
	{
		return id; 
	}
	
	public void idMutator(long idT)
	{
		id = idT; 
	}
	
	// Balance methods
	public double balanceAccessor()
	{
		return balance; 
	}
	
	public void balanceMutator(double balanceT)
	{
		balance = balanceT; 
	}
	
	// InterestRate methods 
	public double interestRateAccessor()
	{
		return interestRate; 
	}
	
	public void interestRateMutator(double interestRateT)
	{
		interestRate = interestRateT; 
	}
	
	// Withdraw method
	public void withdraw(double amount)
	{
	if (balance > 0) 
		if (balance > amount)
			balance = balance - amount; 
		else 
			System.out.println("The amount exceeds the balance.");
	else 
		System.out.println("There is no balance.");
	}
	
	// Deposit method
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	// toString method
	public String toString()
	{
		String text = "The id is " + id + " and the balance is " + money.format(balance);
		return text; 
	}
	
}
