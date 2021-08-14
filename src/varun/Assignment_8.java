package varun;

public class Assignment_8 {

	static int countCredit;
	static int countDebit;
	static int totalBalanceCount;
	int balance;
	int creditCount;
	int debitCount;
	int balanceCount;
	String name;

	void setUserDetails(String userName, int initialBalance) {
		name = userName;
		balance = initialBalance;
		System.out.println("User name: " + userName + "; Balance: " + initialBalance);
	}

	void debitAmmount(int debit) {
		if (balance >= debit) {
			balance = balance - debit;
			System.out.println("Debited amount: " + debit);
			countDebit++;
			debitCount++;
		} else
			System.out.println("Fund insufficient, enter valid amount");
	}

	void creditAmmount(int credit) {
		balance = balance + credit;
		System.out.println("Credited amount: " + credit);
		creditCount++;
		countCredit++;
	}

	void printBalance() {
		System.out.println("Available balance: " + balance);
		balanceCount++;
		totalBalanceCount++;

	}

	void individualTransactionSummary() {
		System.out.println(name + "'s transaction Summary: Debit " + debitCount + " times, Credit: " + creditCount
				+ " times, Balance checked: " + balanceCount + " times");

	}

	static void allTransactionSummary() {
		System.out.println("Total transaction Summary: Debit " + countDebit + "times, Credit: " + countCredit
				+ "times, Balance Checked: " + totalBalanceCount + "times");

	}

	public static void main(String[] args) {
		Assignment_8 assignment_8 = new Assignment_8();
		System.out.println("Transaction details for Customer1:");
		assignment_8.setUserDetails("Joshi", 10000);
		assignment_8.debitAmmount(50000);
		assignment_8.printBalance();
		assignment_8.creditAmmount(20000);
		assignment_8.debitAmmount(10000);
		assignment_8.printBalance();
		assignment_8.individualTransactionSummary();
		System.out.println("---------------------------------------");

		Assignment_8 assignment_8_1 = new Assignment_8();
		System.out.println("Transaction details for Customer2:");
		assignment_8_1.setUserDetails("Varun", 5500);
		assignment_8_1.debitAmmount(50000);
		assignment_8_1.printBalance();
		assignment_8_1.creditAmmount(20000);
		assignment_8_1.creditAmmount(10000);
		assignment_8_1.printBalance();
		assignment_8_1.creditAmmount(25520);
		assignment_8_1.creditAmmount(7500);
		assignment_8_1.printBalance();
		assignment_8_1.debitAmmount(10000);
		assignment_8_1.printBalance();
		assignment_8_1.individualTransactionSummary();
		System.out.println("***********************************");
		allTransactionSummary();

	}

}
