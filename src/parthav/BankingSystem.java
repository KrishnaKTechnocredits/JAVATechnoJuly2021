//Assignment 8
package parthav;

public class BankingSystem {
	int localDebitCount;
	int localCreditCount;
	int localPrintBalanceCount;
	static int globalDebitCount;
	static int globalCreditCount;
	static int globalPrintBalanceCount;
	String userName;
	double currentBalance;

	void setUserDetails(String passedUserName, double passedCurrentBalance) {
		userName = passedUserName;
		currentBalance = passedCurrentBalance;

	}

	void debitAmount(double amount) {
		if (amount > currentBalance)
			System.out.println("Insufficient Balance");
		else {
			currentBalance = currentBalance - amount;
			localDebitCount++;
			globalDebitCount++;
		}

	}

	void creditAmount(double amount) {
		currentBalance += amount;
		localCreditCount++;
		globalCreditCount++;
	}

	void printBalance() {
		System.out.println("Current balance of " + userName + " is " + currentBalance);
		localPrintBalanceCount++;
		globalPrintBalanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println("The number of credit transactions by " + userName + " are " + localCreditCount);
		System.out.println("The number of debit transactions by " + userName + " are " + localDebitCount);
		System.out
				.println("The number of Print balance transactions by " + userName + " are " + localPrintBalanceCount);
	}

	static void allTransactionSummary() {
		System.out.println("The total number of credit transactions by all users are " + globalCreditCount);
		System.out.println("The total number of debit transactions by all users are " + globalDebitCount);
		System.out.println("The total number of print transactions by all users are " + globalPrintBalanceCount);
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem1.setUserDetails("Parthav Dani", 8000);
		bankingSystem2.setUserDetails("Karna Dani", 9000);
		bankingSystem1.creditAmount(1000);
		bankingSystem1.debitAmount(2000);
		bankingSystem1.printBalance();
		bankingSystem2.creditAmount(1000);
		bankingSystem2.debitAmount(2000);
		bankingSystem2.printBalance();
		bankingSystem1.individualTransactionSummary();
		bankingSystem2.individualTransactionSummary();
		allTransactionSummary();

	}

}
