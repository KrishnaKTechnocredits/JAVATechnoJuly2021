package shantanu.Assignment8;

public class BankingSystem {
	String userName;
	float currentBalance;
	int debitCount, creditCount, printBalanceCount;
	static int allDebitCount, allCreditCount, allPrintBalanceCount;
	
	void setUserDetails(String name, float balance) {
		userName = name;
		currentBalance = balance;
	}
	
	void debitAmount(float debit) {
		currentBalance = currentBalance - debit;
		debitCount++;
		allDebitCount++;
	}
	
	void creditAmount(float credit) {
		currentBalance = currentBalance + credit;
		creditCount++;
		allCreditCount++;
	}
	
	void printBalance() {
		System.out.println("Current balance of "+ userName +": " + currentBalance);
		printBalanceCount++;
		allPrintBalanceCount++;
	}
	
	void printIndividualTransactionSummary() {
		System.out.println("Transaction summary for "+ userName);
		System.out.print("Debit: "+ debitCount + " time(s)");
		System.out.print("	Credit: "+ creditCount + " time(s)");
		System.out.println("	Balance Enquiry: "+ printBalanceCount + " time(s)");	
	}
	
	void printAllTransactionSummary() {
		System.out.println("Total debit: "+ allDebitCount);
		System.out.println("Total credit: "+ allCreditCount);
		System.out.println("Total balance enquiry: "+ allPrintBalanceCount);	
	}
	
	public static void main(String args[]) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setUserDetails("Shantanu", 15000.00f);
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setUserDetails("Sanjay", 30000.00f);
		
		bankingSystem1.debitAmount(4500.00f);
		bankingSystem1.creditAmount(1500.50f);
		bankingSystem1.printBalance();
		bankingSystem1.debitAmount(2000.00f);
		bankingSystem1.debitAmount(2500.00f);
		bankingSystem2.printBalance();
		bankingSystem1.printIndividualTransactionSummary();
				
		bankingSystem2.debitAmount(5500.00f);
		bankingSystem2.creditAmount(7500.50f);
		bankingSystem2.creditAmount(3500.50f);
		bankingSystem1.printBalance();
		bankingSystem2.debitAmount(2000.00f);
		bankingSystem2.debitAmount(2500.00f);
		bankingSystem2.creditAmount(1500.50f);
		bankingSystem2.printBalance();
		bankingSystem2.printIndividualTransactionSummary();
		
		bankingSystem1.printAllTransactionSummary();
	}	
}
