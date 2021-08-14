package laxman;

public class Assignment8 {
	int debitAmt;
	int creditAmt;
	int currentBal=50000;
	String username;
	static int allDebitAmt;
	static int allCreditAmt;
	
	void setUserName(String name) {
		username=name;
		
	}
	
	void debitAmt(int amt) {
		currentBal=currentBal-amt;
		debitAmt=debitAmt+1;
		allDebitAmt++;
	}
	
	void creditAmt(int amt) {
		currentBal=currentBal+amt;
		creditAmt++;
		allCreditAmt++;
			
	}
	void printBal() {
		System.out.println("Customer name is " + username);
		System.out.println("Current Balance for Customer "+ username+" " + currentBal);
	}
	void debitAndCreditTransactions() {
		System.out.println("Transaction summary for Debit "+ debitAmt);
		System.out.println("Transaction summary for Credit "+ creditAmt);
		
	}
		
	void allTransactionSummary() {
		int transactionSummary=allDebitAmt+allCreditAmt;
		System.out.println("Total Transaction Summmary "+ transactionSummary);
	}
	
	public static void main(String[]args) {
		Assignment8 assignment8= new Assignment8();
		assignment8.setUserName("Vijay");
		assignment8.debitAmt(2000);
		assignment8.debitAmt(3000);
		assignment8.debitAmt(4000);
		assignment8.creditAmt(5000);
		assignment8.creditAmt(6000);
		assignment8.printBal();
		assignment8.debitAndCreditTransactions();
		assignment8.allTransactionSummary();
		
		
		Assignment8 assignment8_1= new Assignment8();
		assignment8_1.setUserName("Ajay");
		assignment8_1.debitAmt(1000);
		assignment8_1.debitAmt(2000);
		assignment8_1.creditAmt(3000);
		assignment8_1.creditAmt(4000);
		assignment8_1.creditAmt(5000);
		assignment8_1.printBal();
		assignment8_1.debitAndCreditTransactions();
		assignment8_1.allTransactionSummary();
		
	}

}
