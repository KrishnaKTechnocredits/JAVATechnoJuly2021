package neha;

//Banking system program with static and non-static variables
public class BankAssignment8 {
	int debit;
	int credit;
	int printAmount;
	static int debitAll;
	static int creditAll;
	static int printAmountAll;
	String customerName;
	int accountBalance;

	// method to set user name and initial Balance
	void setUserDetails(String name, int initialAmt) {
		customerName = name;
		accountBalance = initialAmt;
		System.out.println("\r\nInitial balance for customer " + customerName + " :" + initialAmt);
	}

	void debitAmount(int debitAmt) {
		accountBalance -= debitAmt;
		debit++;
		debitAll++;
	}

	void creditAmount(int creditAmt) {
		accountBalance += creditAmt;
		credit++;
		creditAll++;
	}

	// method to print current balance
	void printBalance() {
		System.out.println("\r\nCurrent balance for customer " + customerName + " :" + accountBalance);
		printAmount++;
		printAmountAll++;
	}

	// method to show individual debit, credit & printBalance
	void individualTransactionSummary() {
		System.out.println("\r\n" + customerName + " transaction summary : Credit - " + credit + " times, Debit -"
				+ debit + " times, printBalance - " + printAmount + " times");
	}

	// method to show overall transactions done by multiple users
	void allTransactionSummary() {
		System.out.println("\r\nAll transaction summary : Credit - " + creditAll + " times, Debit -" + debitAll
				+ " times, printBalance - " + printAmountAll + " times");
	}

	public static void main(String[] args) {
		// customer 1
		BankAssignment8 bankAssignment8_1 = new BankAssignment8();
		bankAssignment8_1.setUserDetails("Parth", 45000);
		bankAssignment8_1.debitAmount(5000);
		bankAssignment8_1.printBalance();
		bankAssignment8_1.debitAmount(7000);
		bankAssignment8_1.creditAmount(15000);
		bankAssignment8_1.printBalance();
		bankAssignment8_1.individualTransactionSummary();
		bankAssignment8_1.allTransactionSummary();
		// customer 2
		BankAssignment8 bankAssignment8_2 = new BankAssignment8();
		bankAssignment8_2.setUserDetails("Aarchi", 56000);
		bankAssignment8_2.creditAmount(1000);
		bankAssignment8_2.printBalance();
		bankAssignment8_2.creditAmount(8000);
		bankAssignment8_2.debitAmount(3000);
		bankAssignment8_2.printBalance();
		bankAssignment8_2.debitAmount(2000);
		bankAssignment8_2.printBalance();
		bankAssignment8_2.individualTransactionSummary();
		bankAssignment8_2.allTransactionSummary();
	}

}
