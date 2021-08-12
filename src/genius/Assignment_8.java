package genius;

public class Assignment_8 {
	
	int currentBalance;
	int debitCount;
	int creditCount;
	int printBalanceCnt;
	static int debitCountAll;
	static int creditCountAll;
	static int printBalanceCntAll;
	String Name;
	
	void debitAmount(int debit) {
		currentBalance = currentBalance - debit;
		debitCount = debitCount + 1;
		debitCountAll = debitCountAll +1;
	}
	
	void creditAmount(int credit) {
		currentBalance = currentBalance + credit;
		creditCount++;
		creditCountAll++;
	}
	
	void printBalance() {
		System.out.println(Name +" Currentbalance is "+currentBalance);
		printBalanceCnt++;
		printBalanceCntAll++;
		
	}
	
	void setUserDetails(String name) {
		Name = name;
	}
	
	void individualTransactionSummary() {
		System.out.println(Name +" Debit count is " + debitCount);
		System.out.println(Name +" Credit count is " + creditCount);
		System.out.println(Name +" PrintBalance count is " + printBalanceCnt);
	}
	
	void printTransactionSummary() {
		System.out.println("Total Debit count is " + debitCountAll);
		System.out.println("Total Credit count is " + creditCountAll);
		System.out.println("Total PrintBalance count is " + printBalanceCntAll);
	}
	
	public static void main(String[] args) {
		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8_1.setUserDetails("Genius");
		assignment_8_1.creditAmount(10000);
		assignment_8_1.debitAmount(5000);
		assignment_8_1.creditAmount(5000);
		assignment_8_1.printBalance();
		
		Assignment_8 assignment_8_2 = new Assignment_8();
		assignment_8_2.setUserDetails("Viha");
		assignment_8_2.creditAmount(5000);
		assignment_8_2.printBalance();
		assignment_8_2.creditAmount(4000);
		assignment_8_2.creditAmount(3000);
		assignment_8_2.debitAmount(10000);
		assignment_8_2.creditAmount(5000);
		assignment_8_2.creditAmount(4000);
		assignment_8_2.debitAmount(5000);
		
		assignment_8_1.individualTransactionSummary();
		assignment_8_2.individualTransactionSummary();
		
		assignment_8_2.printTransactionSummary();
	}
}
