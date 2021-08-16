package madhavi;

public class Assignment_8 {
	int debtCount;
	int creditCount;
	int printBalance;
	String username;
	int intialBalance;
	static int totalCreditCount;
	static int totalDebtCount;
	static int totalPrintBalance;

	void setUserDetails(String uname, int mainBalance) {
		username = uname;
		intialBalance = mainBalance;

	}

	void debitAmount() {
		debtCount = debtCount + 1;
		totalDebtCount++;
	}

	void creditAmount() {
		creditCount = creditCount + 1;
		totalCreditCount++;

	}

	void printBalance() {
		printBalance = printBalance + 1;
		totalPrintBalance++;
	}

	void individualTransactionSummary() {
		System.out.println(username + " transaction summary : Credit - " + creditCount + " times," + "Debit - "
				+ debtCount + " times, printBalance - " + printBalance + " time");

	}

	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + totalCreditCount + " times," + "Debit - "
				+ totalDebtCount + " times, printBalance - " + totalPrintBalance + " time");

	}

	public static void main(String[] args) {
		Assignment_8 assignment_8 = new Assignment_8();
		assignment_8.setUserDetails("Joe", 5000);
		assignment_8.debitAmount();
		for (int i = 0; i < 2; i++) {
			assignment_8.creditAmount();
		}
		assignment_8.printBalance();
		assignment_8.individualTransactionSummary();

		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8_1.setUserDetails("Mark", 1000);
		for (int i = 0; i < 2; i++) {
			assignment_8_1.debitAmount();
		}
		for (int i = 0; i < 5; i++) {
			assignment_8_1.creditAmount();
		}

		assignment_8_1.individualTransactionSummary();
		assignment_8_1.allTransactionSummary();
	}

}
