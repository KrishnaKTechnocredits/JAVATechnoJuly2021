package himanshu;

public class Assignment_8 {

	String username;
	int totalbalance;
	int creditCount;
	int debitCount;
	int balanceCount;
	static int countCredit;
	static int countDebit;
	static int totalBalanceCount;

	void setUserDetails(String name, int initialBalance) {
		username = name;
		totalbalance = initialBalance;
		System.out.println("Customer name: " + name + "; Avaiable Balance: " + initialBalance);
	}

	void debitAmt(int debit) {
		totalbalance = totalbalance - debit;
		System.out.println("Debited amount: " + debit);
		countDebit++;
		debitCount++;
	}

	void creditAmt(int credit) {
		totalbalance = totalbalance + credit;
		System.out.println("Credited amount: " + credit);
		creditCount++;
		countCredit++;
	}

	void printBalance() {
		System.out.println("Available balance: " + totalbalance);
		balanceCount++;
		totalBalanceCount++;

	}

	void individualTransactionSummary() {
		System.out.println(username + " transaction Summary: Debit " + debitCount + " times, Credit: " + creditCount
				+ " times, Balance Checked:" + balanceCount + " times");

	}

	static void allTransactionSummary() {
		System.out.println("Total transaction Summary: Debit " + countDebit + "times, Credit: " + countCredit
				+ "times, Balance Checked:" + totalBalanceCount + " times");

	}

	public static void main(String[] args) {
		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8_1.setUserDetails("Karan", 15000);
		assignment_8_1.debitAmt(3000);
		assignment_8_1.creditAmt(1000);
		assignment_8_1.debitAmt(500);
		assignment_8_1.individualTransactionSummary();
		System.out.println("\n");
		Assignment_8 assignment_8_2 = new Assignment_8();
		assignment_8_2.setUserDetails("Arjun", 10000);
		assignment_8_2.debitAmt(7500);
		assignment_8_2.creditAmt(3000);
		assignment_8_2.creditAmt(2000);
		assignment_8_2.debitAmt(5000);
		assignment_8_2.individualTransactionSummary();
		System.out.println("\n");
		allTransactionSummary();

	}

}
