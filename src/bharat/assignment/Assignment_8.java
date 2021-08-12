package bharat.assignment;

public class Assignment_8 {
	int debit;
	int credit;
	int printAmount;
	static int debitTotle;
	static int creditTotle;
	static int printAmountTotal;
	String customerName;
	int accountBalance;
	
	void setUserDetails(String name, int initialAmt) {
		customerName = name;
		accountBalance = initialAmt;
		System.out.println("Account balance of " + customerName + " -" + initialAmt);
	}
	
	void debitAmount(int debitAmt) {
		accountBalance -= debitAmt;
		debit++;
		debitTotle++;
	}

	void creditAmount(int creditAmt) {
		accountBalance += creditAmt;
		credit++;
		creditTotle++;
	}
	void printBalance() {
		System.out.println("Current balance of " + customerName + " -" + accountBalance);
		printAmount++;
		printAmount++;
	}
	void individualTransactionSummary() {
		System.out.println("individual " + customerName + " transaction summary - Credited - " + credit + " times Debit -"
				+ debit + " times & printBalance - " + printAmount + " times");

	}
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + creditTotle + " times Debit -" + debitTotle
				+ " times printBalance - " + printAmount + " times");
	}
	public static void main(String[] args) {
		
		Assignment_8 Assignment8_1 = new Assignment_8();
		Assignment8_1.setUserDetails("Bharat", 250000);
		Assignment8_1.debitAmount(23454);
		Assignment8_1.printBalance();
		Assignment8_1.debitAmount(67000);
		Assignment8_1.creditAmount(130000);
		Assignment8_1.printBalance();
		Assignment8_1.individualTransactionSummary();
		Assignment8_1.allTransactionSummary();
	
		
		Assignment_8 Assignment8_2 = new Assignment_8();
		Assignment8_2.setUserDetails("mukesh", 127000);
		Assignment8_2.creditAmount(7000);
		Assignment8_2.printBalance();
		Assignment8_2.creditAmount(6000);
		Assignment8_2.debitAmount(3200);
		Assignment8_2.printBalance();
		Assignment8_2.debitAmount(200);
		Assignment8_2.printBalance();
		Assignment8_2.individualTransactionSummary();
		Assignment8_2.allTransactionSummary();
		
	}
	
}
