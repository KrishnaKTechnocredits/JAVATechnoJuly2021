package suruchi;

public class Assignment_8 {

	double currentBalance;
	String userName;
	double initialBalance;
	int debitCall;
	int creditCall;
	int balanceCount;

	static int debitCount;
	static int creditCount;
	static int allBalanceCount;

	void setUserDetails(String name, double initialBalance) {
		userName = name;
		currentBalance = initialBalance;
	}

	void debitAmount(double debit) {

		if (currentBalance > debit)
			currentBalance = currentBalance - debit;
		debitCall++;
		debitCount++;
	}

	void creditAmount(double credit) {
		currentBalance = currentBalance + credit;
		creditCall++;
		creditCount++;
	}

	void printBalance() {
		System.out.println(userName + "'s Current Balance is: " + currentBalance);
		balanceCount++;
		allBalanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println();
		System.out.println(userName + "'s Transaction Summary: ");
		System.out.println("Credit - " + creditCall + " times");
		System.out.println("Debit - " + debitCall + " times");
		System.out.println("Balance printed - " + balanceCount + " times");
	}

	void allTransactionSummary() {
		System.out.println();
		System.out.println("Overall transaction summary is: ");
		System.out.println("Credit - " + creditCount + " times");
		System.out.println("Debit - " + debitCount + " times");
		System.out.println("Balance printed - " + allBalanceCount + " times");
	}

	public static void main(String[] a) {
		Assignment_8 assignment_8 = new Assignment_8();
		assignment_8.setUserDetails("Suruchi", 150000);
		assignment_8.debitAmount(30000);
		assignment_8.debitAmount(40000);
		assignment_8.creditAmount(50000);
		assignment_8.debitAmount(20000);
		assignment_8.printBalance();
		assignment_8.creditAmount(10000);
		assignment_8.printBalance();

		Assignment_8 assignment_8_2 = new Assignment_8();
		assignment_8_2.setUserDetails("Sarthak", 100000);
		assignment_8_2.debitAmount(30000);
		assignment_8_2.creditAmount(50000);
		assignment_8_2.debitAmount(40000);
		assignment_8_2.debitAmount(20000);
		assignment_8_2.creditAmount(70000);
		assignment_8_2.creditAmount(10000);
		assignment_8_2.printBalance();

		assignment_8.individualTransactionSummary();
		assignment_8_2.individualTransactionSummary();

		assignment_8_2.allTransactionSummary();
	}
}