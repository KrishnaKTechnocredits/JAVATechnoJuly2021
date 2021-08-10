//Assignment No 8 - 10-08-2021 

package harshada;

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
		System.out.println( "\n # User Name= "+ userName);
		System.out.println("Current Balance = "+ balance);
		individualPrintCount ++;
		total_printBalance_count ++;
	}
	
	void individualTransactionSummary() {
		//System.out.println("Transaction Summary:"); 
		//System.out.println( "\n User Name= "+ userName);
		System.out.println( "Credit Transactions=  "+ individualCreditCount + "times");
		System.out.println( "Debit Transactions= " + individualDebitCount + "times");
		System.out.println( "Viewed Print Balance Statements = "+ individualPrintCount+ "times");
	}
	
	void totalTransactionSummary() {
		System.out.println("\n *** Total Transaction Summary: *** "); 
		
		System.out.println( "Total Credit Transactions=  "+ total_credit_count+ " times");
		System.out.println( "Total Debit Transactions= " + total_debit_count+ " times");
		System.out.println( "Viewed Total Print Balance Statements = "+ total_printBalance_count+ " times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingSystem bankingSystem_1 = new BankingSystem();
		
		bankingSystem_1.setUserDetails("Joy", 30000f);
		bankingSystem_1.processCredit(12000f);
		bankingSystem_1.processCredit(8000f);
		bankingSystem_1.processCredit(52000f);
		bankingSystem_1.processDebit(10000f);
		bankingSystem_1.printBalance();
		bankingSystem_1.individualTransactionSummary();
		
		
		BankingSystem bankingSystem_2 = new BankingSystem();
		bankingSystem_2.setUserDetails("John", 45000f);
		bankingSystem_2.processCredit(12000f);
		bankingSystem_2.processCredit(8000f);
		bankingSystem_2.processCredit(52000f);
		bankingSystem_2.processDebit(10000f);
		bankingSystem_2.processDebit(5200f);
		bankingSystem_2.printBalance();
		bankingSystem_2.individualTransactionSummary();
		
		
		bankingSystem_2.totalTransactionSummary();
	}

}
