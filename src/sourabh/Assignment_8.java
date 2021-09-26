package sourabh;

public class Assignment_8 {
	static double totalCreditCount, totalDebitCount, totalPrintBalCount;
	double debitCount, creditCount, printBalCount;
	double balance;
	String customerName;

	void setUserDetails(String custName, double iniBal) {
		customerName = custName;
		balance = iniBal;
	}

	void debitAmount(double debAmt) {
		balance = balance - debAmt; 
		totalDebitCount ++;
		debitCount ++;
		System.out.println(debAmt + " Debited from your Account, Your Availabe Balance =  " + balance );
	}

	void creditAmount(double creditAmt) {
		balance = balance + creditAmt;
		totalCreditCount ++;
		creditCount ++;
		System.out.println(creditAmt + " Credited to your Account, Your Availabe Balance =  " + balance );
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
		assignment_8_1.setUserDetails("Sourabh", 20000);
		assignment_8_1.printBalance();
		assignment_8_1.debitAmount(10000);
		assignment_8_1.printBalance();
		System.out.println("");
		assignment_8_1.creditAmount(2000);
		assignment_8_1.creditAmount(3000);
		assignment_8_1.printBalance();
		System.out.println("");
		assignment_8_1.individualTransactionSummary();
		System.out.println("");
		System.out.println("*********************************************************************************************");
		System.out.println("");
		assignment_8_2.setUserDetails("Rutuja", 10000);
		assignment_8_2.printBalance();
		assignment_8_2.creditAmount(50000);
		assignment_8_2.printBalance();
		assignment_8_2.debitAmount(3000);
		assignment_8_2.printBalance();
		assignment_8_2.creditAmount(2000);
		assignment_8_2.creditAmount(1000);
		assignment_8_2.creditAmount(700);
		assignment_8_2.debitAmount(7785);
		assignment_8_2.creditAmount(1548);
		System.out.println("");
		assignment_8_2.printBalance();
		System.out.println("");
		assignment_8_2.individualTransactionSummary();
		System.out.println("");
		System.out.println("*********************************************************************************************");
		System.out.println("");
		allTransactionSummary();
	}
}