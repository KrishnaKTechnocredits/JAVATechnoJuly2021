package manaswi;

class Bank
{
	double currentBalance=5000;
	
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
		Bank bank =new Bank();
		bank.debitAmount(2000);
		bank.creditAmount(5000);
		bank.displayAmount();
		
		bank.debitAmount(4000);
		bank.creditAmount(3000);
		bank.displayAmount();
	}
}
		
		