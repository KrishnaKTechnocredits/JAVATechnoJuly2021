package rushikesh.staticdemo;

public class Assignment_8 {
	String username;
	int balance;
	int creditCount;
	int debitCount;
	static int creditCountForAll;
	static int debitCountForAll;
	static int printBalanceCountForAll;
	int printBalanceCount;
	
	void setUserDetails(String userName,int initialBalance) {
		username=userName;
		balance=initialBalance;
		System.out.println(username+" Your Initial Balance is "+balance);
	}
	
	void creditAcc(int creditAmt) {
		balance=balance +creditAmt;
		creditCount++;
		creditCountForAll++;
	}
	
	void debitAcc(int debitAmt) {
		balance=balance - debitAmt;
		debitCount++;
		debitCountForAll++;
	}
	
	void printCurrentBalance() {
		System.out.println(username+" Your Current Balance is "+balance);
		printBalanceCount++;
		 printBalanceCountForAll++;
	}
	
	void individualTransactionsummary() {
		System.out.println(username+" Your Transaction Summary:");
		System.out.println("Credit count is "+creditCount+","+
		"Debit count is "+debitCount+","+"Print balance count is "+printBalanceCount);
		System.out.println("-----------------------------------------");
	}
	 
	static void allTransactionsummary() {
		System.out.println("-----------------------------------------");
		System.out.println("All Transaction Summary:");
		System.out.println("Credit count is "+creditCountForAll+","+
		" Debit count is "+debitCountForAll+","+"Print balance count is "+printBalanceCountForAll);
		
	}
	
	public static void main(String[] args) {
		Assignment_8 assignment_8_1=new Assignment_8();
		assignment_8_1.setUserDetails("Rushikesh", 10000);
		assignment_8_1.creditAcc(1000);
		assignment_8_1.creditAcc(2000);
		assignment_8_1.debitAcc(2000);
		assignment_8_1.printCurrentBalance();
		assignment_8_1.individualTransactionsummary();
		
		Assignment_8 assignment_8_2=new Assignment_8();
		assignment_8_2.setUserDetails("Sachit",30000);
		assignment_8_2.creditAcc(2000);
		assignment_8_2.debitAcc(2000);
		assignment_8_2.creditAcc(500);
		assignment_8_2.debitAcc(5000);
		assignment_8_2.printCurrentBalance();
		assignment_8_2.individualTransactionsummary();
		
		allTransactionsummary();
	
	}
}
