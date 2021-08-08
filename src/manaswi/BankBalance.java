package manaswi;

class BankBalance
{
	double currentBalance=5000;
	
	void currentBalance(double currentBalance)
	{
		currentBalance=currentBalance;
		System.out.println(" Current Balance In Acount : "+currentBalance);
	}
	
	void debitAmount(double amount)
	{
		currentBalance=currentBalance-amount;
		System.out.println(" Balance after debit Amount : "+currentBalance);
	}
	
	void creditAmount(double amount)
	{
		currentBalance=currentBalance+amount;
		System.out.println(" Balance after credit Amount : "+currentBalance);
	}
	
	void displayAmount()
	{
		System.out.println(" Current Balance In Acount : "+currentBalance);
	}
	public static void main ( String[] args)
	{
		BankBalance bankBalance =new BankBalance();
		bankBalance.debitAmount(2000);
		bankBalance.creditAmount(5000);
		bankBalance.displayAmount();
	}
}