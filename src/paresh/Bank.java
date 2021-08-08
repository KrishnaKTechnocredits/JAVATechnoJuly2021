//Program to print current balance of bank 
package paresh;

class Bank{
	int currentBalance=10000;
	
	void debit(int amount){
		currentBalance=currentBalance-amount;
		
	}
	
	void credit(int amount){
		currentBalance=currentBalance+amount;
	}
	
	void displayBalance(){
		System.out.println("Current Amount is: " + currentBalance);
	}
	
	public static void main(String [] args){
		Bank bank= new Bank();
		bank.debit(5000);
		bank.credit(8000);
		bank.credit(2000);
		bank.displayBalance();
	}
}