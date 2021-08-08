package parthav;

class Bank{
	int bankBalance = 10000;  // Initial bank balance
	
	void debitTransaction(int debitValue){
		bankBalance = bankBalance - debitValue;	 // Debits the passed value from current bank balance	
	}
	
	void creditTransaction(int creditValue){
		bankBalance = bankBalance + creditValue;  // Credits the passed value into current bank balance	
	}
	
	void displayBalance() {
		System.out.println("The current bank balance is: " + bankBalance);   
	}
	
	public static void main(String [] args) {
		Bank bank = new Bank();   // Instantiating bank class and assigning it to a reference variable
		bank.displayBalance();   // Printing the initial bank balance
		bank.debitTransaction(1000);   // First debit transaction
		bank.displayBalance();   // Printing the bank balance after debit transaction
		bank.creditTransaction(5000);  // First credit transaction
		bank.displayBalance();   // Printing the bank balance after credit transaction
		bank.debitTransaction(4000);   // Second debit transaction
		bank.displayBalance();   // Printing the bank balance after 2nd debit transaction	
	}
	
	

}