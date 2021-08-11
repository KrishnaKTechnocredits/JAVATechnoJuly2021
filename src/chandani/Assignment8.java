class Assignment8{
	
	String username;
	int debitAmt;
	int  credAmt;
	int currBalance;
	int initialBal;
	static int totalDebitAmt;
    static int totalCreditAmt;
    static int totalPrintBalCnt;
	
	void setDetails(String uname, int amount){
		username = uname;
		amount = initialBal;
	}
	
	void debitAmount(){
		debitAmt++;
		totalDebitAmt++;
	}
	
	void creditAmount(	){
		credAmt++;
		totalCreditAmt++;
	}
	
	void printBalance(){
		currBalance++;
		totalPrintBalCnt++;
	}

	void individualTransactionSummary(){
		System.out.println( username +" transaction summary : Debit : - :"+debitAmt +" times, Credit : - :"+credAmt +" times, printBalance : - :" +currBalance +" times");	
	}
	
	static void allTransactionSummary(){
		System.out.println("All Transaction Summary : - : Debit : - :" +totalDebitAmt +" times, Credit : - : " +totalCreditAmt +" times, printBalance : - : " +totalPrintBalCnt +" times");

	}
	
	public static void main (String[] args){
		Assignment8 assignment8user1 = new Assignment8();
		Assignment8 assignment8user2 = new Assignment8();
		assignment8user1.setDetails("Maulik", 300000);
		assignment8user2.setDetails("Kishna", 400000);
		assignment8user1.debitAmount();
		assignment8user1.creditAmount();
		assignment8user1.printBalance();
		assignment8user2.debitAmount();
		assignment8user2.creditAmount();
		assignment8user2.printBalance();
		assignment8user1.individualTransactionSummary();
		assignment8user2.individualTransactionSummary();
		allTransactionSummary();
	}
	
}
