package paresh.assignemnt_8;

public class Assignment_8 {
	
	int creditCount;
	int debitCount;
	int printBalance;
	static int allCredit;
	static int allDebit;
	static int allPrintBalance;
	String user;
	int totalBalance;
	
	void debitAmount(int debit) {
		totalBalance= totalBalance-debit;
		debitCount++;
		allDebit++;
	}
	
	void creditAmount(int credit) {
		totalBalance= totalBalance+credit;
		creditCount++;
		allCredit++;
	}
	
	void printBalance() {
		System.out.println(user + " Current balance " + totalBalance);
		printBalance++;
		allPrintBalance++;
		
		
	}
	
	void individualTransactionSummary(){
		System.out.println(user + " transaction summary Credit:" + creditCount + " times, Debit: " + debitCount+ " printBalance: " + printBalance + " times");
	}
	
	public static void allTransactionSummary() {
		System.out.println("Overall transaction summary: Credit " + allCredit +" times, Debit " + allDebit
				+ " printBalance: " + allPrintBalance + " times");
	}
	
	void setUserDetails(String username ,int balance) {
		user=username;
		totalBalance=balance;
	}
	
	public static void main(String[] args) {
		Assignment_8 assignment_8= new Assignment_8();
		assignment_8.setUserDetails("Paresh", 50000);
		assignment_8.debitAmount(28000);
		assignment_8.creditAmount(4500);
		assignment_8.printBalance();
		assignment_8.individualTransactionSummary();
		
		Assignment_8 assignment_8_2= new Assignment_8();
		assignment_8_2.setUserDetails("Raj", 65000);
		assignment_8_2.debitAmount(8000);
		assignment_8_2.creditAmount(3000);
		assignment_8_2.creditAmount(2500);
		assignment_8_2.printBalance();
		assignment_8_2.individualTransactionSummary();
		allTransactionSummary();
	}
	
}
