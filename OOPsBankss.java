
class BankAccount
{
	double balance;
	double amount;
	
	public BankAccount(double balance, double amount)
	{
		this.balance = balance;
		this.amount = amount;
	}
	
	public void deposit(double amount)
	{
		if (amount > balance)
		{
			balance += amount;
		}
	}
	
	public void withdraw(double amount)
	{
		if (amount > 0 && )
	}
}

class SavingsAccount
{
	double balance;
	
	 SavingsAccount(double balance)
	{
		this.balance = balance;
	}
	@Override
	void withdraw()
	{
		if (balance < 100)
		{
           System.out.println("Insuffient Balnce.");
		}
	}
}


public class OOPsBankss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj = new BankAccount(0, 0);
		SavingsAccount obj1 = new SavingsAccount(0);
		
		obj.
		
		
		
		
		

	}

}
