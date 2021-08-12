package kalpesh;

public class BankingSystem {
	static int totalCreditCount, totalDebitCount, totalPrintBalCount;
	int debitCnt, creditCnt, printBal;
	int balance;
	String customerName;

	void setUserDetails(String custName, int iniBal) {
		customerName = custName;
		balance = iniBal;
	}

	void debitAmount(int debAmt) {
		balance = balance - debAmt;
		totalDebitCount++;
		debitCnt++;
	}

	void creditAmount(int creditAmt) {
		balance = balance + creditAmt;
		totalCreditCount++;
		creditCnt++;
	}

	void printBalance() {
		totalPrintBalCount++;
		printBal++;
		System.out.println(customerName + "'s Current balance is: " + balance);
	}

	void individualTransactionSummary() {
		System.out.println(customerName + "'s transaction summary: Credit - " + creditCnt + " times, Debit - "
				+ debitCnt + " times, print Balance - " + printBal + " time");
	}

	static void allTransactionSummary() {
		System.out.println("All transaction summary: Credit - " + totalCreditCount + " times, Debit - "
				+ totalDebitCount + " times, print Balance - " + totalPrintBalCount + " time");
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem_1 = new BankingSystem();
		BankingSystem bankingSystem_2 = new BankingSystem();
		bankingSystem_1.setUserDetails("Kalpesh", 30000);
		bankingSystem_1.debitAmount(8000);
		bankingSystem_1.creditAmount(1500);
		bankingSystem_1.creditAmount(2000);
		bankingSystem_1.printBalance();
		bankingSystem_1.individualTransactionSummary();
		bankingSystem_2.setUserDetails("Ramesh", 20000);
		bankingSystem_2.creditAmount(4000);
		bankingSystem_2.debitAmount(3000);
		bankingSystem_2.creditAmount(2000);
		bankingSystem_2.creditAmount(1000);
		bankingSystem_2.creditAmount(700);
		bankingSystem_2.debitAmount(7700);
		bankingSystem_2.creditAmount(1500);
		bankingSystem_2.printBalance();
		bankingSystem_2.individualTransactionSummary();
		allTransactionSummary();
	}
}
