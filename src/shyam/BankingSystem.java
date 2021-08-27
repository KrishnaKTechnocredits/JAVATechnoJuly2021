package shyam;

public class BankingSystem {
	String userName;
	float balance;
	int individualCreditCount;
	int individualDebitCount;
	int individualPrintCount;
	static int total_credit_count;
	static int total_debit_count;
	static int total_printBalance_count;
	
	void setUserDetails(String tempUserName, float initialBalance) {
		userName=tempUserName;
		balance=initialBalance;
	}
	
	void processCredit(float tempCredit) {
		balance = balance + tempCredit;
		individualCreditCount++;
		total_credit_count ++;
	}
	
	void processDebit(float tempDebit) {
		balance = balance - tempDebit;
		individualDebitCount ++;
		total_debit_count ++;
	}
	
	void printBalance() {
		//System.out.println("Current Balance = "+ balance);
		individualPrintCount ++;
		total_printBalance_count ++;
	}
	
	void individualTransactionSummary() {
		//System.out.println("Transaction Summary:"); 
		System.out.println( "User Name= "+ userName);
		System.out.println( "Credit Transactions=  "+ individualCreditCount);
		System.out.println( "Debit Transactions= " + individualDebitCount);
		System.out.println( "Print Balance Statements = "+ individualPrintCount);
	}
	
	void totalTransactionSummary() {
		System.out.println( "Total Credit Transactions=  "+ total_credit_count);
		System.out.println( "Total Debit Transactions= " + total_debit_count);
		System.out.println( "Total Print Balance Statements = "+ total_printBalance_count);
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem_1 = new BankingSystem();

		bankingSystem_1.setUserDetails("Shyam", 30000f);
		bankingSystem_1.processCredit(12000f);
		bankingSystem_1.processDebit(10000f);
		bankingSystem_1.printBalance();
		bankingSystem_1.individualTransactionSummary();

		BankingSystem bankingSystem_2 = new BankingSystem();
		bankingSystem_2.setUserDetails("ABC", 45000f);
		bankingSystem_2.processCredit(12000f);
		bankingSystem_2.processDebit(5200f);
		bankingSystem_2.printBalance();
		bankingSystem_2.individualTransactionSummary();

		bankingSystem_2.totalTransactionSummary();
	}

}
