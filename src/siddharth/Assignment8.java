package siddharth;

public class Assignment8 {

	int debitCnt;
	int creditCnt;
	String customerName;
	int printBalance;

	void setCustomerName(String custname) {
		customerName = custname;
	}

	void debitAmt() {
		debitCnt++;
	}

	void creditAmt() {
		creditCnt++;
	}

	void printBalance() {
		printBalance++;

	}

	void TransactionSummary() {
		System.out.println("\n" + customerName + " Transaction summary:" + "\n" + "Credit " + creditCnt + " Times");
		System.out.println("Debit " + debitCnt + " Times");
		System.out.println("Print Balance " + printBalance + " Times");

	}

	public static void main(String[] a) {
		Assignment8 ref1 = new Assignment8();
		ref1.setCustomerName("Siddharth");
		ref1.debitAmt();
		ref1.creditAmt();
		ref1.debitAmt();
		ref1.creditAmt();
		ref1.creditAmt();
		ref1.printBalance();
		ref1.printBalance();
		ref1.TransactionSummary();

		Assignment8 ref2 = new Assignment8();
		ref2.setCustomerName("Himanshu");
		ref2.creditAmt();
		ref2.debitAmt();
		ref2.debitAmt();
		ref2.printBalance();
		ref2.TransactionSummary();

	}
}
