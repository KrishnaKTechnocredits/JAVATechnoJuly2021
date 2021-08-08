package sushant;

class Bank{
	int currentBalance = 20000;
	
	void debit(int amount){
		currentBalance = currentBalance - amount;
	}
	
	void credit(int amount){
		currentBalance = currentBalance + amount;
	}
	
	void displayBalance(){
		System.out.println("Current balance is: "+currentBalance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debit(1000);
		bank.credit(500);
		bank.debit(2000);
		bank.credit(1000);
		bank.debit(3000);
		bank.displayBalance();
	}
}