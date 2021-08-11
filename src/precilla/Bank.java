package precilla;

//create  a class called bank
//-variable currentBalance=10000
// 3 methods Debit,Credit and displayBalance
class Bank{
	int currentBalance = 10000;
	
	void debitValue(int amount)
	{
		currentBalance=currentBalance-amount;
		System.out.println("After debiting "+currentBalance);
	}
	
	void creditValue(int amount)
	{
		currentBalance=currentBalance+amount;
		System.out.println("After crediting "+currentBalance);
	}
	
	void displayBalance()
	{
		System.out.println("Current balance is "+currentBalance);
	}
	
	public static void main(String[] args)
	{
		Bank bank=new Bank();
		bank.displayBalance();//10000
		bank.debitValue(2000); //8000
		bank.creditValue(3000);//11000
		bank.debitValue(5000);//6000
		bank.debitValue(2000);//4000
		bank.creditValue(8000);//12000
		bank.creditValue(3000);//15000
		bank.displayBalance();//15000
	}
}