package sagar_Anasane;

class Bank{
	int currentBalance = 10000;
	
	void debitValue(int amount){
	currentBalance = currentBalance - amount ;
	System.out.println("Amount to be debited =  " + amount);
	}
	
	void creditValue(int amount){
	currentBalance = currentBalance + amount ;
	System.out.println("Amount to be credited =  " + amount);
	}
	
	void displayBalance(){
		System.out.println("Available Balance is " + currentBalance);
	}
	
	public static void main(String[] args){
	Bank bank = new Bank();
	bank.debitValue(2000);
	bank.displayBalance();
	bank.creditValue(3000);
	bank.displayBalance();
	bank.debitValue(7500);
	bank.displayBalance();
	bank.creditValue(8000);
	bank.displayBalance();
	}
}