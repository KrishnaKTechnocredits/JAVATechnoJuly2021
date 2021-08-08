package aniket;
class Bank{
	int currentBalance=20000;
	
	void debitAmount(int amount){
		currentBalance=currentBalance-amount;
		System.out.println("Amount debited from account is "+amount);
			
	}
	
	void creditAmount(int amount){
		currentBalance=currentBalance+amount;
		System.out.println("Amount credited in the account is "+amount);		
	}
	
	void displayBalance(){
		System.out.println("New balance in the account is "+ currentBalance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.creditAmount(1000);
		bank.displayBalance();
		bank.debitAmount(2000);
		bank.displayBalance();
		
		
		
	}
}