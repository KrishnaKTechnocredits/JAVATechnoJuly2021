package riten;

class BankingSystem {

	int debitCnt;
	int creditCnt;
	int printBalanceCnt;
	String customerName;
	int currentBalance;
	static int totalDebit;
	static int totalCredit;
	static int totalPrintBalance;

	void setUserDetails(String custName, int initialBalance) {
		customerName = custName;
		currentBalance = initialBalance;
	}

	void debitAmount(int debitTransaction) {
		currentBalance = currentBalance - debitTransaction;
		System.out.println(customerName + " currentbalance's balance after debit is: " + currentBalance);
		debitCnt++;
		totalDebit++;
	}

	void creditAmount(int creditTransaction) {
		currentBalance = currentBalance + creditTransaction;
		System.out.println(customerName + " currentbalance's balance after credit is: " + currentBalance);
		creditCnt++;
		totalCredit++;
	}

	void printBalance() {
		System.out.println(customerName + " currentbalance's current balance is: " + currentBalance);
		printBalanceCnt++;
		totalPrintBalance++;
	}

	void individualTransactionSummary() {
		System.out.println(customerName + " debit count is: " + debitCnt + " times");
		System.out.println(customerName + " credit count is: " + creditCnt + " times");
		System.out.println(customerName + " Print Balance count is: " + printBalanceCnt + " times");

	}

	static void allTransactionSummary() {
		System.out.println("\n Total credit count is " + totalCredit + " and Total debit count is " + totalDebit
				+ " and Total print balance count is " + totalPrintBalance);
	}

	public static void main(String[] args) {
		BankingSystem bankingsystem1 = new BankingSystem();

		System.out.println("\n 1st user count");
		bankingsystem1.setUserDetails("Riten", 500);
		bankingsystem1.debitAmount(100);
		bankingsystem1.creditAmount(1000);
		bankingsystem1.creditAmount(200);
		bankingsystem1.printBalance();
		bankingsystem1.individualTransactionSummary();

		System.out.println("\n 2nd user count");
		BankingSystem bankingsystem2 = new BankingSystem();
		bankingsystem2.setUserDetails("Bhagya", 1000);
		bankingsystem2.debitAmount(50);
		bankingsystem2.debitAmount(100);
		bankingsystem2.creditAmount(750);
		bankingsystem2.creditAmount(100);
		bankingsystem2.creditAmount(200);
		bankingsystem2.creditAmount(300);
		bankingsystem2.creditAmount(1900);
		bankingsystem2.individualTransactionSummary();

		allTransactionSummary();

	}

}
