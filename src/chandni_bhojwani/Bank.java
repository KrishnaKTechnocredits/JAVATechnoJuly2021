package chandni_bhojwani;

class Bank {
    int currentBalance = 50000;
	
	void debitValue (int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Your Current Balance after debit is" + currentBalance);
	}
	
	void creditValue (int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Your Current Balance after credit is" + currentBalance);
	}
	
	void displayBalance() {
		System.out.println("Your Current Balance is" + currentBalance);
	}
	
	public static void main (String [] args){
		Bank bank = new Bank ();
		bank.debitValue(15000);
		bank.creditValue(10000);
		bank.displayBalance();
	}
	
}