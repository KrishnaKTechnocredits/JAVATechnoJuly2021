package husain;

class Bank {

	double currentBal = 15000.75;

	void debitAmount(double amount) {

		currentBal = currentBal - amount;

	}

	void creditAmount(double amount) {

		currentBal = currentBal + amount;

	}

	void displayAmount() {
		System.out.println("The current account balance is Rs." + currentBal);
	}

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.debitAmount(550.80);
		bank.debitAmount(1057.25);
		bank.creditAmount(350.75);
		bank.creditAmount(443.33);
		bank.displayAmount();
	}
}