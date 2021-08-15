package arti_G.Assignment_9;
//Assignment 8

public class BankingSystem {

	String User;
	int debitCount;
	int creditCount;
	int printBalanceCount;
	int totalBalance;
	int individualCreditCount;
	int individualDebitCount;
	int individualPrintCount;

	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintBalanceCount;

	void setUserDetails(String userName, int initialBalance) {
		User = userName;
		totalBalance = initialBalance;
		System.out.println("User name is " + User);
		System.out.println("Total Balance is " + totalBalance);
	}

	void debitAmount(int debitValue) {
		totalBalance = totalBalance - debitValue;
		debitCount++;
		totalDebitCount++;
	}

	void creditAmount(int creditValue) {
		totalBalance = totalBalance + creditValue;
		creditCount++;
		totalCreditCount++;

	}

	void printBalance() {
		System.out.println("Current Balance is " + totalBalance);
		printBalanceCount++;
		totalPrintBalanceCount++;
	}

	void individualTransactionSummary() {

		System.out.println("Debit Transactions=  " + debitCount);
		System.out.println("Credit Transactions= " + creditCount);
		System.out.println("Print Balance Statements = " + printBalanceCount + "\n");
	}

	static void allTransactionSummary() {
		System.out.println("Total Debit Transactions=  " + totalDebitCount);
		System.out.println("Total Credit Transactions= " + totalCreditCount);
		System.out.println("Total Print Balance Statements = " + totalPrintBalanceCount);
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setUserDetails("Arti", 50000);
		bankingSystem1.debitAmount(5000);
		bankingSystem1.creditAmount(1000);
		bankingSystem1.creditAmount(1000);
		bankingSystem1.printBalance();
		allTransactionSummary();

		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setUserDetails("Gahlot", 30000);
		bankingSystem2.debitAmount(4000);
		bankingSystem2.debitAmount(4000);
		bankingSystem2.creditAmount(3000);
		bankingSystem2.creditAmount(3000);
		bankingSystem2.creditAmount(3000);
		bankingSystem2.creditAmount(3000);
		bankingSystem2.creditAmount(3000);
		allTransactionSummary();

	}
}
