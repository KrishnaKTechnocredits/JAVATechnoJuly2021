// create a class Bank using debit credit and display method
package shalaka.assignment1to5;
class Bank{
	 
	int currentBalance = 10000;
	 
	void debit(int amount){
		currentBalance = currentBalance - amount;
		System.out.println("Balance after debit "+amount+ " is " +currentBalance);
		
	}
	 
	void credit(int amount){
		currentBalance = currentBalance + amount;
		System.out.println("Balance after credit "+amount+ " is " +currentBalance);
	 
	}
		
	void displayBalance(){
		System.out.println("Current balance is " +currentBalance);
			
	}
	public static void main (String [] args){
		Bank bank = new Bank();
		bank.debit(1000);
		bank.debit(3000);
		bank.credit(2000);
		bank.displayBalance();
		
	}
}