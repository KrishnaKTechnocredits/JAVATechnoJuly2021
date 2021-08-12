package chirag;

public class Assignment_8 {
	String customerName;
	int creditCount;
	int debitCount;
	int printBalanceCount;
	int currentBalance;
	static int TotalCreditCount;
	static int totalDebitCount;
	static int totalPrintBalanceCount;
	
	void setUserDetail(String custname,int initialBalance) {
		customerName=custname;
		currentBalance=initialBalance;
	}
	void debitAmount(int debAmt) {
		currentBalance=currentBalance - debAmt;
		totalDebitCount++;
		debitCount++;
	}
	void creditAmount(int credAmt) {
		currentBalance=currentBalance + credAmt;
		TotalCreditCount++;
		creditCount++;
	}
	void printCurrentBalance() {
		totalPrintBalanceCount++;
		printBalanceCount++;
		System.out.println(customerName+" current balance is : "+ currentBalance);
	}
	void individualTransactionSummary() {
		System.out.println(customerName+" transaction summary :-"+"\n"+ "Credit :"+creditCount+" times"+"\n"+"Debit :"+debitCount+" times"+"\n"+"Print balance :"+printBalanceCount);
	}
	static void allTransactionSummary() {
		System.out.println("All transaction summary :- "+"\n"+"Credit: "+TotalCreditCount+" times"+"\n"+"Debit: "+totalDebitCount+" times"+"\n"+"Print Balance: "+totalPrintBalanceCount+" times");
		
	}
	public static void main(String[] args) {
		Assignment_8 assignment_8 = new Assignment_8();
		assignment_8.setUserDetail("Chirag Prajapati",150000);
		assignment_8.debitAmount(5000);
		assignment_8.creditAmount(7000);
		assignment_8.debitAmount(2000);
		assignment_8.creditAmount(8000);
		assignment_8.printCurrentBalance();
		assignment_8.individualTransactionSummary();
		
		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8_1.setUserDetail("Mihir Prajapati",125000);
		assignment_8_1.debitAmount(3000);
		assignment_8_1.creditAmount(6000);
		assignment_8_1.creditAmount(4000);
		assignment_8_1.debitAmount(2000);
		assignment_8_1.printCurrentBalance();
		assignment_8_1.individualTransactionSummary();
		
		Assignment_8.allTransactionSummary();
	}
}
