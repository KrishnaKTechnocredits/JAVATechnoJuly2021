package prerana;

public class Assignment8 {
	int dcnt;
	int ccnt;
	String name;
	int printBal;
	static int totalDcnt;
	static int totalCcnt;
	static int totalPrintBalcnt;
	
	void setUsername(String n) {
		name=n;
		System.out.println("customer name is: " +name);
	}
			
	void debitAmt() {
		dcnt++;
		totalDcnt++;
	}
	
	void creditAmt() {
		ccnt++;
		totalCcnt++;
	}
	
	void printBal() {
		printBal++;
		totalPrintBalcnt++;
	}
	
	void transactionSummary() {
		System.out.println("Transaction summary:customer name is " +name);
		System.out.println("credit count is :" +ccnt);
		System.out.println("Debit count is: " +dcnt);
		System.out.println("print balance is: " +printBal);
		
	}
	void totalTransactionSummary() {
		System.out.println("total Transaction summary:customer name is " +name);
		System.out.println("total credit count is :" +totalCcnt);
		System.out.println("total Debit count is: " +totalDcnt);
		System.out.println("total print balance is: " +totalPrintBalcnt);
		
	}
	
	
	public static void main(String[] args) {
		Assignment8 a=new Assignment8();
		a.setUsername("Prerana");
		a.debitAmt();
		a.creditAmt();
		a.debitAmt();
		a.creditAmt();
		a.creditAmt();
		a.printBal();
		a.printBal();
		a.transactionSummary();
		a.totalTransactionSummary();
		
		Assignment8 a1=new Assignment8();
		a1.setUsername("Pooja");
		a1.debitAmt();
		a1.creditAmt();
		a1.debitAmt();
		a1.debitAmt();
		a1.printBal();
		a1.transactionSummary();
		a1.totalTransactionSummary();
		
		
		
	}
}

