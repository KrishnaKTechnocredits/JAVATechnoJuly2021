package prajwal;

public class Assignment_8 {
	static int totalCreditCount, totalDebitCount, totalPrintBalCount;
	int debitCount, creditCount, printBalCount;
	int balance;
	String customerName;
	
	void setUserDetails(String custName, int initialBal) {
		customerName = custName;
		balance = initialBal;
	}
	
	void debitAmount(int debitAmt) {
		balance = balance - debitAmt; 
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
		Assignment_8 assignment_8_1 = new Assignment_8();
		Assignment_8 assignment_8_2 = new Assignment_8();
		assignment_8_1.setUserDetails("Prajwal", 1000);
		assignment_8_1.debitAmount(9000);
		assignment_8_1.creditAmount(30000);
		assignment_8_1.creditAmount(3000);
		assignment_8_1.printBalance();
		assignment_8_1.individualTransactionSummary();
		assignment_8_2.setUserDetails("Palash", 2000);
		assignment_8_2.creditAmount(9000);
		assignment_8_2.debitAmount(500);
		assignment_8_2.creditAmount(6000);
		assignment_8_2.creditAmount(2000);
		assignment_8_2.creditAmount(600);
		assignment_8_2.debitAmount(7000);
		assignment_8_2.creditAmount(1000);
		assignment_8_2.individualTransactionSummary();
		allTransactionSummary();
	}
}
