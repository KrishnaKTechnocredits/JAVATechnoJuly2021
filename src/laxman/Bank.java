package laxman;

class Bank{
	int currentBalance = 10000;
	
	void debit(int debit) {
		currentBalance = currentBalance - debit;
		System.out.println("The Debit balance is  "+ debit);
	}
	
	void credit(int credit) {
		currentBalance = currentBalance + credit;
		System.out.println("The Credit balance is "+ credit);	
	}
	
	void displayBalance() {
		System.out.println("Current Balance is "  + currentBalance);	
	}
	
	public static void main(String[]args){
		Bank bank = new Bank();
		bank.debit(1000);
		bank.displayBalance();
		bank.credit(2000);
		bank.displayBalance();
		bank.credit(5000);
		bank.displayBalance();
	
	
	}
	
}