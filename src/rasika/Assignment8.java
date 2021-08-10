package rasika;

public class Assignment8 {
	static int totalCreditCount, totalDebitCount, totalPrintBalCount;
	int debitCount, creditCount, printBalCount;
	int balance;
	String customerName;

	void setUserDetails(String custName, int iniBal) {
		customerName = custName;
		balance = iniBal;
	}

	void debitAmount(int debAmt) {
		balance = balance - debAmt; 
		totalDebitCount ++;
		debitCount ++;
	}

	void creditAmount(int creditAmt) {
		balance = balance + creditAmt;
		totalCreditCount ++;
		creditCount ++;
	}

	void printBalance() {
		totalPrintBalCount ++;
		printBalCount ++;
		System.out.println(customerName + "'s Current balance is: " + balance);
	}

	void individualTransactionSummary() {
		System.out.println(customerName + " transaction summary: Credit - " + creditCount + " times, Debit - " + debitCount + " times, print Balance - " + printBalCount + " time");
	}

	static void allTransactionSummary() {
		System.out.println("All transaction summary: Credit - " + totalCreditCount + " times, Debit - " + totalDebitCount + " times, print Balance - " + totalPrintBalCount + " time");
	}

	public static void main(String[] args) {
		Assignment8 assignment8_1 = new Assignment8();
		Assignment8 assignment8_2 = new Assignment8();
		assignment8_1.setUserDetails("Rasika",65000);
		assignment8_1.debitAmount(5000);
		assignment8_1.creditAmount(3000);
		assignment8_1.creditAmount(7000);
		assignment8_1.printBalance();
		assignment8_1.individualTransactionSummary();
		assignment8_2.setUserDetails("Yash", 66000);
		assignment8_2.creditAmount(8000);
		assignment8_2.debitAmount(3000);
		assignment8_2.creditAmount(7000);
		assignment8_2.creditAmount(1000);
		assignment8_2.creditAmount(700);
		assignment8_2.debitAmount(7700);
		assignment8_2.creditAmount(1900);
		assignment8_2.individualTransactionSummary();
		allTransactionSummary();
	}
}