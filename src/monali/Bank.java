package monali;

	//Assignment 2:create Bank class ,variable Current balance , 3 methods DebitValue,Credit value and DisplayBalance

	class Bank{
		int currentBalance=10000;
		
		void debitValue(int amount)
		{
			currentBalance=currentBalance-amount;
			System.out.println("After debit the trasaction available balance is : "+currentBalance);
		}
		
		void creditValue(int amount)
		{
			currentBalance=currentBalance+amount;
			System.out.println("After credit the trasaction available balance is : "+currentBalance);
		}
		
		void displayBalance()
		{
			System.out.println("Available Balance is : " + currentBalance);
		}
		
		public static void main(String [] args)
		{
			Bank bank=new Bank();
			bank.debitValue(5000);
			bank.debitValue(1000);
			bank.creditValue(4000);
			bank.creditValue(3000);
			bank.displayBalance();
		}
		
	}





