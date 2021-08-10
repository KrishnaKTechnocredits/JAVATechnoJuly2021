package jagrati;

class Assignment8 {
	
	String custName;
	int creditCount;
	int debitCount;
	int printBalance;
	static int creditCount2;
	static int debitCount2;
	static int printBalance2;
	int currentBalance;
	
	void setUserDetails(String name, int initialBal) {
		custName= name;
		currentBalance = initialBal;
	}	
	void creditAmountBal(int creditAmount) {
		
		currentBalance = currentBalance + creditAmount;
		creditCount = creditCount + 1 ;
		creditCount2 = creditCount2 + 2;
	}void debitAmountBal(int debitAmount){
		
		currentBalance = currentBalance - debitAmount;
		debitCount++;
		debitCount2++;
		
	}void printCurrentBal() {
		System.out.println(custName +" Your current balance "+ currentBalance );
		printBalance = printBalance + 1;
		printBalance2++;
		
	}void individualTransactionSummary(){
		System.out.println("Credit count is "+creditCount);
		System.out.println("Debit count is " + debitCount);
		System.out.println("Print bal count " + printBalance );
		
	}static void allTransactionSummary() {
		System.out.println("Credit count is "+creditCount2);
		System.out.println("Debit count is " + debitCount2);
		System.out.println("Print bal count " + printBalance2);
		
	}public static void main(String []aa) {
		Assignment8 assignment8 = new Assignment8();
		System.out.println("------First User------");
		assignment8.setUserDetails("Ramesh", 70000);
		assignment8.creditAmountBal(20000);
		assignment8.creditAmountBal(20000);
		assignment8.debitAmountBal(40000);
		assignment8.debitAmountBal(30000);
		assignment8.printCurrentBal();
		System.out.println("------individualTransactionSummary------");
		assignment8.individualTransactionSummary();
		
		Assignment8 assignment81 = new Assignment8();
		System.out.println("------Second  User------");
		assignment81.setUserDetails("Suresh", 50000);
		assignment81.creditAmountBal(20000);
		assignment81.creditAmountBal(20000);
		assignment81.debitAmountBal(40000);
		assignment81.debitAmountBal(30000);
		assignment81.printCurrentBal();
		System.out.println("------individualTransactionSummary------");
		assignment81.individualTransactionSummary();
		System.out.println("------AllTransactionSummary------");
		allTransactionSummary();
		
		
		
	} 
		
	}
		
	
	

