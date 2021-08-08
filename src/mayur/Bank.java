package mayur;

class Bank{
	double currentBalance = 10000;
	
	void debitValue(double amount){
		currentBalance = currentBalance - amount;
		System.out.println("After debit amount is :"+currentBalance);
	}
	
	void creditValue(double amount){
		currentBalance = currentBalance + amount;
		System.out.println("After credit amount is :"+currentBalance);
		
	}
	
	void displayBalance(){
		System.out.println("Current balance in Account :"+currentBalance);
	}
	
	public static void main (String[] args){
		
		Bank bank = new Bank();
		bank.debitValue(2000);
		bank.debitValue(3000);
		bank.creditValue(4000);
		bank.debitValue(7000);
		bank.creditValue(2000);
		bank.displayBalance();
	}
}