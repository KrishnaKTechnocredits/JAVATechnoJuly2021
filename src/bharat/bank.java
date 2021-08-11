package bharat;
class Bank{
	int currentBal= 50000;
	
	void debit(int amt)
	{
		currentBal=currentBal-amt;
		System.out.println(" After dabiting Balance is " +currentBal);
	}
	void credit(int amt)
	{
		currentBal=currentBal+amt;
		System.out.println(" After crediting Balance is " + currentBal);
	}
	
	void displayBal()
	{
		System.out.println(" current Balance is " + currentBal);
	}
	
	public static void main(String[] args)
	{
		Bank bank=new Bank();
		bank.displayBal();
		bank.debit(2000);
		bank.credit(5000);
		bank.credit(4000);
		bank.debit(10000);
		bank.credit(30000);
		bank.displayBal();
	}
}
	