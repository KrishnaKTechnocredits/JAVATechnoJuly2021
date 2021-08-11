package suchita;

class Assignment8{
	
	
	static int debitAll;
	static int creditAll;
	static int printBalanceAll;
	int debitCnt;
	int creditCnt;
	int printBalanceCnt;
	String customerName;
	int currentBal;
	
	void setUserDetails(String custName,int bal) {
		customerName = custName;
		currentBal = bal;
	
	}
	
	void debit() {
		//currentBal = currentBal - debitAmt;
		debitCnt++;
		debitAll++;
	}
	
	void credit() {
		//currentBal = currentBal + creditAmt;
		creditCnt++;
		creditAll++;
	}
	
	void printBalance() {
		System.out.println(customerName + " current balance :: " + currentBal);
		printBalanceCnt++;
		printBalanceAll++;
	}
	
	void individualTransactionSummary() {
		
		System.out.println( "   total debit transaction :: " + debitCnt);
		System.out.println( "   total credit transaction :: " + creditCnt);
		System.out.println( "   total print balance :: " + printBalanceCnt);
		System.out.println("\n");
		
	}
	
	void allTransactionSummary() {
		System.out.println( " All debit transaction :: " + debitAll);
		System.out.println( " All credit transaction :: " + creditAll);
		System.out.println( " All print balance :: " + printBalanceAll);
	}
	
	public static void main(String[] args) {
		Assignment8 assignment1 = new Assignment8();
		assignment1.setUserDetails("Rashmika ", 35000);
		assignment1.debit();
		assignment1.credit();
		assignment1.credit();
		assignment1.credit();
		assignment1.printBalance();
		assignment1.individualTransactionSummary();
		
		Assignment8 assignment2 = new Assignment8();
		assignment2.setUserDetails(" Mandana " , 45000);
		assignment2.debit();
		assignment2.credit();
		assignment2.printBalance();
		assignment2.debit();
		assignment2.individualTransactionSummary();
		
		assignment1.allTransactionSummary();
		
	}
}