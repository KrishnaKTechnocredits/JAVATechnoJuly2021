package chandni_B;

public class Assignment_8 {

	String username;
	int initialBalance = 0;
	int creditCount = 0;
	int debitCount = 0;
	int printBalCount = 0;
	static int totalCreditCount = 0;
	static int totalDebitCount = 0;
	static int totalPrintBalCount = 0;

	void setDetails(String uname, int currentBal) {
		username = uname;
		initialBalance = currentBal;
	}

	void credit (int creditAmt) {
		initialBalance = initialBalance + creditAmt;
		System.out.println("Balance after credit amount of " + creditAmt + "is " + initialBalance);
		creditCount++;
		totalCreditCount++;
	}

	void debit (int debitAmt) {
		initialBalance = initialBalance - debitAmt;
		System.out.println("Balance after credit amount of " + debitAmt + "is " + initialBalance);
		debitCount++;
		totalDebitCount++;
	}

	void printBalance () {
		System.out.println("Current Balance of" + username + "is " + initialBalance);
		printBalCount++;
		totalPrintBalCount++;
	}

	void individualTransactionSummary () {
		System.out.println("Credit Transaction for this user is been taken place" + creditCount + " times");
		System.out.println("Debit Transaction for this user is been taken place" + debitCount + " times");
		System.out.println("Balance printed for this user is " + printBalCount + " times");
	}

	static void overallSummary () {
		System.out.println("Credit Transaction executed overall is" + totalCreditCount + " times"); 
		System.out.println("Debit Transaction executed overall is" + totalDebitCount + " times"); 
		System.out.println("Balance printed overall is" + totalPrintBalCount + " times"); 
	}


	public static void main(String[] args) {
		Assignment_8 assignment_8 = new Assignment_8();
		assignment_8.setDetails("Soham Bhojwani", 45000);
		assignment_8.credit(10000);
		assignment_8.credit(20000);
		assignment_8.debit(15000);
		assignment_8.printBalance();
		assignment_8.individualTransactionSummary();
		System.out.println ("-------------------------------------------------------------");
		Assignment_8 assignment_8_1 = new Assignment_8 ();
		assignment_8_1.setDetails("Divya Bhojwani", 25000);
		assignment_8_1.credit(10000);
		assignment_8_1.credit(10000);
		assignment_8_1.credit(5000);
		assignment_8_1.credit(20000);
		assignment_8_1.credit(2000);
		assignment_8_1.debit(15000);
		assignment_8_1.debit(5500);
		assignment_8_1.individualTransactionSummary();
		System.out.println ("-------------------------------------------------------------");
		overallSummary ();


	}

}

