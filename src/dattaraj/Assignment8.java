package dattaraj;

public class Assignment8 {

	static int totalCreditCnt, totalDebitCnt, totalPrintBalCnt;
	int debitCnt, creditCnt, printBalCnt;
	int balance;
	String custName;
	
	void setUser(String cName, int initBal) {
		custName = cName;
		balance = initBal;
	}
	
	void debitAmt(int debtAmt) {
		balance = balance - debtAmt; 
		totalDebitCnt ++;
		debitCnt ++;
	}
	
	void creditAmt(int creditAmt) {
		balance = balance + creditAmt;
		totalCreditCnt ++;
		creditCnt ++;
	}
	
	void printBal() {
		totalPrintBalCnt ++;
		printBalCnt ++;
		System.out.println("Current balance of "+custName+" is: " + balance);
	}

	void individualTranscSummary() {
		System.out.println(custName + " transaction summary: Credit - " + creditCnt + " times, Debit - " + debitCnt + " times, print Balance - " + printBalCnt + " times");
	}
	
	static void allTranscSummary() {
		System.out.println("All transaction summary: Credit - " + totalCreditCnt + " times, Debit - " + totalDebitCnt + " times, print Balance - " + totalPrintBalCnt + " time");
	}
	
	public static void main(String[] args) {
		Assignment8 assign_1 = new Assignment8();
		Assignment8 assign_2 = new Assignment8();
		
		assign_1.setUser("Dattaraj", 35000);
		assign_1.debitAmt(2500);
		assign_1.creditAmt(4000);
		assign_1.creditAmt(1000);
		assign_1.printBal();
		assign_1.individualTranscSummary();
		
		assign_2.setUser("Aniket", 50000);
		assign_2.creditAmt(10000);
		assign_2.debitAmt(15000);
		assign_2.creditAmt(1000);
		assign_2.creditAmt(7000);
		assign_2.creditAmt(2000);
		assign_2.debitAmt(25000);
		assign_2.creditAmt(1500);
		assign_2.individualTranscSummary();
		allTranscSummary();
	}
}
