package trupti;

class Bank2 {
	int currentBalance = 20000;

	void debiAmount(int dAmt) {
		currentBalance = currentBalance - dAmt;
		System.out.println("After debit currentamount is " + currentBalance);
	}

	void creditAmount(int cAmt) {
		currentBalance = currentBalance + cAmt;
		System.out.println("After credit currentamount is " + currentBalance);
	}

	void displayBalance() {
		System.out.println("current balance is " + currentBalance);
	}

	public static void main(String[] args) {
		Bank2 bank2 = new Bank2();
		bank2.displayBalance();
		bank2.debiAmount(3000);
		bank2.creditAmount(1000);
		bank2.displayBalance();

		bank2.debiAmount(5000);
		bank2.creditAmount(10000);
		bank2.displayBalance();
	}

}
