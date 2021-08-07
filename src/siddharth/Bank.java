package siddharth;

class Bank{
	double currentBalance = 40000.64;
	
	void DebitAmount(int debit){
		currentBalance = currentBalance-debit;
		System.out.println("Debit Amount:    Rs." + debit);
	}	
	
	void CreditAmount(int credit){
		currentBalance = currentBalance+credit;
		System.out.println("Credit Amount:   Rs." + credit);
	}
	
	void displayBalance(){
		System.out.println("Current Balance: Rs." + currentBalance);
	}

	public static void main(String[] args){
		Bank bank = new Bank();
			bank.displayBalance();
			bank.DebitAmount(500);
			bank.displayBalance();
			bank.DebitAmount(200);
			bank.displayBalance();
			bank.CreditAmount(1000);
			bank.displayBalance();
	
	}
	
}