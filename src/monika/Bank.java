package monika;
class Bank{
	int currentBalance=20000;

		void debit(int amount)
		{
			currentBalance=currentBalance-amount;
		}
		
		void credit(int amount)
		{
			currentBalance=currentBalance+amount;
		}
		
		void displayBalance()
		{
			System.out.println("Current Balance is="+currentBalance);
		}
		public static void main(String[] a)
		{
			Bank bank=new Bank();
			bank.debit(1000);
			bank.credit(5000);
			bank.debit(2000);
			bank.credit(3000);
			bank.credit(1000);
			bank.displayBalance();
		}
}