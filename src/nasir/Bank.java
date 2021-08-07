package nasir;

class Bank{

	double currentBalance= 10000;

	void debitAmount(double amount){

		 currentBalance = currentBalance-amount;

	}

	void creditAmount(double amount){
		 currentBalance = currentBalance+amount;
		
	}
	
	void displayBalance(){
	
		System.out.println("current balance is " +currentBalance);
		
	}

	public static void main (String[] args){
		Bank bank = new Bank();
		bank.debitAmount(2000);
		bank.displayBalance();
		bank.creditAmount(5000);
		bank.displayBalance();
		
	
	}
}
