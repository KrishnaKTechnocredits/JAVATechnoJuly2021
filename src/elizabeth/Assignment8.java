package elizabeth;

class Assignment8{
	
	String user;
	int balance;
	int debitCount;
	int creditCount;
	int printBalanceCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintBalanceCount;
	
	void setUserDetails(String username, int initialbalance){
		user=username;
		balance=initialbalance;
	}
	
	void debit(int debitAmount){
		balance=balance-debitAmount;
		debitCount++;
		totalDebitCount++;
	}
	
	void credit(int creditAmount){
		balance=balance+creditAmount;
		creditCount++;
		totalCreditCount++;
	}
	
	void printBalance(){
		System.out.println(user + " current balance is " +balance);
		printBalanceCount++;
		totalPrintBalanceCount++;
		
	}
	
	void individualTransactionSummary(){
		System.out.println(user +" transaction summary: debit- " +debitCount+ " credit- " +creditCount+ " printBalance- "+printBalanceCount);
	}
	
	static void overAllTransactionSummary(){
		System.out.println("Overall transaction summary: debit- " +totalDebitCount+ " credit- " +totalCreditCount+ " printBalance- "+totalPrintBalanceCount);
	}
	
	public static void main(String[] args){
		
		Assignment8 assignment8=new Assignment8();
		assignment8.setUserDetails("Eliza", 60000);
		assignment8.debit(15000);
		assignment8.credit(4000);
		assignment8.credit(4000);
		assignment8.printBalance();
		assignment8.individualTransactionSummary();
	
		Assignment8 assignment8_1=new Assignment8();
		assignment8_1.setUserDetails("Mary", 50000);
		assignment8_1.debit(8000);
		assignment8_1.debit(8000);
		assignment8_1.credit(6000);
		assignment8_1.credit(6000);
		assignment8_1.credit(6000);
		assignment8_1.credit(6000);
		assignment8_1.credit(6000);
		assignment8_1.individualTransactionSummary();
		overAllTransactionSummary();
	}
	
}