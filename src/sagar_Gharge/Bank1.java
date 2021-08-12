package sagar_Gharge;



class Bank1{
	int currentBalance = 100000;
	
	void debitValue(int amount){
	int debitValue = currentBalance - amount;
	
	}
	
	void creditValue(int amount){
	int creditValue = currentBalance + amount;
	
	}
	
	void displayBalance(){
	System.out.println (" CurrentBalance is " + currentBalance );
	
	}
	public static void main(String []args){
	Bank1 bank = new Bank1();
	bank.debitValue(25000);
	bank.creditValue(20000);
	bank.debitValue(50000);
	bank.creditValue(200000);
	bank.displayBalance();
	}
}