package ashit;

public class Assignment_8 {

	int debitAmt;
	int creditAmt;
	int currentBal;
	String userName;
	int initialBal;
	static int totalDebitAmt;
	static int totalCreditAmt;
	static int totalPrintBalCnt;

	void debitAmount() {
		debitAmt++;
		totalDebitAmt++;
	}

	void creditAmount() {
		creditAmt++;
		totalCreditAmt++;
	}

	void printBalance() {
		currentBal++;
		totalPrintBalCnt++;
	}

	void individualTransactionSummary() {
		System.out.println("Amount debited for " + userName + " is" + debitAmt + " times");
		System.out.println("Amount credited for " + userName + " is " + creditAmt + " times");
		System.out.println("Balance  printed for " + userName + "and which is " + currentBal + " shows this time");
	}

	static void allTransactionSummary() {
		System.out.println("Total amount debited " + totalDebitAmt + " times");
		System.out.println("Total amount credited" + totalCreditAmt + " times");
		System.out.println("Total balance " + totalPrintBalCnt + " times");

	}

	void setUserDetails(String uName, int amount) {
		initialBal = amount;
		userName = uName;

	}

	public static void main(String[] args) {
		
		Assignment_8 assignment_8 = new Assignment_8();
		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8.setUserDetails("Ashit", 10000);
		assignment_8_1.setUserDetails("Samdur", 15000);
		assignment_8.debitAmount();
		assignment_8.creditAmount();
		assignment_8.creditAmount();
		assignment_8.printBalance();
		assignment_8_1.debitAmount();
		assignment_8_1.debitAmount();
		assignment_8_1.creditAmount();
		assignment_8_1.creditAmount();
		assignment_8_1.creditAmount();
		assignment_8_1.creditAmount();
		assignment_8_1.creditAmount();
		assignment_8.individualTransactionSummary();
		assignment_8_1.individualTransactionSummary();
		allTransactionSummary();
	}

}