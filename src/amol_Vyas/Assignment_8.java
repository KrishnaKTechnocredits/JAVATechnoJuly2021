package amol_Vyas;

public class Assignment_8 {

	String customerName;
	int currentBalance;
	int cntDebit;
	int cntCredit;
	int cntPrintBalance;
	static int cntDebitAll;
	static int cntCreditAll;
	static int cntPrintBalanceAll;

	void setCustomername(String name) {
		customerName = name;
	}

	void debitAmount(int debitAmount) {
		currentBalance -= debitAmount;
		cntDebit++;
		cntDebitAll++;
	}

	void creditAmount(int creditAmount) {
		currentBalance = currentBalance + creditAmount;
		cntCredit++;
		cntCreditAll++;
	}

	void printBalance() {
		System.out.println(customerName + " Current Balance is " + currentBalance);
		cntPrintBalance++;
		cntPrintBalanceAll++;
	}

	void printIndividualTransactionSummary() {
		System.out.println(customerName + " Debit count is " + cntDebit);
		System.out.println(customerName + " Credit count is " + cntCredit);
		System.out.println(customerName + " Print Balance count is " + cntPrintBalance);
	}

	void printTransactionSummary() {
		System.out.println("Total Debit count is " + cntDebitAll);
		System.out.println("Total Credit count is " + cntCreditAll);
		System.out.println("Total Print Balance count is " + cntPrintBalanceAll);
	}

	public static void main(String[] args) {
		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8_1.setCustomername("Amol");
		assignment_8_1.creditAmount(10000);
		assignment_8_1.printBalance();
		assignment_8_1.debitAmount(5000);
		assignment_8_1.printBalance();
		assignment_8_1.debitAmount(5000);
		Assignment_8 assignment_8_2 = new Assignment_8();
		assignment_8_2.setCustomername("Vyas");
		assignment_8_2.creditAmount(13000);
		assignment_8_2.creditAmount(200);
		assignment_8_2.debitAmount(800);
		assignment_8_2.printBalance();
		assignment_8_2.creditAmount(1000);
		assignment_8_2.printBalance();
		assignment_8_1.printIndividualTransactionSummary();
		assignment_8_2.printIndividualTransactionSummary();
		assignment_8_1.printTransactionSummary();

	}
}
