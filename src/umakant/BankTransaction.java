package umakant;

public class BankTransaction {
	
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	static int totalPrintCount = 0;
	int debitCount = 0;
	int creditCount = 0;
	int printCount = 0;
	int currentBalance;
	String userName;
	
	void setUserDetails(String name,int initialBalance) {
		userName=name;
		currentBalance=initialBalance;
	}
	
	void creditAmount(int balance) {
		currentBalance+=balance;
		creditCount++;
		totalCreditCount++;
		System.out.println(userName +" has credited "+balance);
	}
	
	void debitAmount(int balance) {
		currentBalance-=balance;
		debitCount++;
		totalDebitCount++;
		System.out.println(userName +" has debited "+balance);
	}
	
	void printBalance() {
		System.out.println(userName +"'s current account balance is "+currentBalance);
		printCount++;
		totalPrintCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println(userName +"'s transaction summary: Credit-"+creditCount+" times Debit-"+debitCount+" times printBalance-"+printCount+" times");
	}
	
	static void allTransactionSummary() {
		System.out.println("All transaction summary: Credit-"+totalCreditCount+" times Debit-"+totalDebitCount+" times printBalance-"+totalPrintCount+" times");
	}
	
	public static void main(String[] args) {
		BankTransaction bankTransaction1 = new BankTransaction();
		bankTransaction1.setUserDetails("Umakant", 5000);
		bankTransaction1.printBalance();
		bankTransaction1.debitAmount(1000);
		bankTransaction1.printBalance();
		bankTransaction1.creditAmount(2000);
		bankTransaction1.printBalance();
		bankTransaction1.debitAmount(5000);
		bankTransaction1.printBalance();
		BankTransaction bankTransaction2 = new BankTransaction();
		bankTransaction2.setUserDetails("Kartik", 1000);
		bankTransaction2.printBalance();
		bankTransaction2.creditAmount(5000);
		bankTransaction2.printBalance();
		bankTransaction2.creditAmount(2000);
		bankTransaction2.printBalance();
		bankTransaction2.debitAmount(1000);
		bankTransaction2.printBalance();
		bankTransaction2.debitAmount(1000);
		bankTransaction2.printBalance();
		bankTransaction2.debitAmount(1000);
		bankTransaction2.printBalance();
		bankTransaction1.individualTransactionSummary();
		bankTransaction2.individualTransactionSummary();
		allTransactionSummary();
	}

}
