package mayur;
class Assignment8 {
	static int totalCreditCount, totalDebitCount, totalPrintBalCount;
	int debitCnt;
	int creditCnt;
	String customerName;
	int printBalance;
	int balance;


	void setUserDetails(String custname, int iniBal){
		customerName = custname;
		balance = iniBal;
	}

	void debitAmt() {
		balance = balance - debitCnt; 
		totalDebitCount ++;
		debitCnt++;   
	}

	void creditAmt() {
	    balance = balance + creditCnt; 
		totalCreditCount ++;
		creditCnt++;  
	}

	void printBalance() {
		totalPrintBalCount ++;
		printBalance++;
		System.out.println(customerName + "'s Current balance is: " + balance);

	}

	void individualTransactionSummary() {
		System.out.println("\n" + customerName + " Transaction summary:" + "\n" + "Credit " + creditCnt + " Times");
		System.out.println("Debit " + debitCnt + " Times");
		System.out.println("Print Balance " + printBalance + " Times");

	}
	static void allTransactionSummary() {
		System.out.println("All transaction summary: Credit - " + totalCreditCount + " times, Debit - " + totalDebitCount + " times, print Balance - " + totalPrintBalCount + " time");
	}

	public static void main(String[] a) {
		Assignment8 assignment8_1 = new Assignment8();
		assignment8_1.setUserDetails("Mayur",30000);
		assignment8_1.debitAmt();
		assignment8_1.creditAmt();
		assignment8_1.creditAmt();
		assignment8_1.printBalance();
		assignment8_1.individualTransactionSummary();
		System.out.println("--------------");
		Assignment8 assignment8_2 =new Assignment8();
		assignment8_2.setUserDetails("Damini",35000);
		assignment8_2.creditAmt();
		assignment8_2.debitAmt();
		assignment8_2.creditAmt();
		assignment8_2.creditAmt();
		assignment8_2.creditAmt();
		assignment8_2.debitAmt();
		assignment8_2.creditAmt();
		assignment8_2.individualTransactionSummary();
		assignment8_2.allTransactionSummary();

	}
}