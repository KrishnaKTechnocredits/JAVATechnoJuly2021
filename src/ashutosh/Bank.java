package ashutosh;

//Assignment no.2
//Program for Bank with modules Credit,Debit and Display Balance 

class Bank{
	int currentBalance = 10000;
	
	void debitBalance(int amount){
		currentBalance = currentBalance - amount;
		System.out.println("Balance after Debit " +amount);
	}
	
	
	void creditBalance (int amount){
		currentBalance = currentBalance + amount;
		System.out.println("Balance after Credit " +amount);
	}
	
	void displayBalance (){
		System.out.println("Current Balance is : " +currentBalance);
		
	}
	
	public static void main (String[] args){
		Bank bank = new Bank();
		
		bank.displayBalance();
		
		bank.creditBalance(3000);
		bank.displayBalance();
		
		bank.debitBalance(6000);
		bank.displayBalance();
		
		bank.creditBalance(1500);
		bank.displayBalance();
	}
}