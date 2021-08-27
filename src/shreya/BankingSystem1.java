package shreya;

public class BankingSystem1 {
	int debitCnt,creditCnt,printBalance,balance;
	String customerName;
	static int totalDebitCnt,totalCreditCnt,totalPrintBalance;
	
	
	void setUserDetails(String custName,int initialBalance) {
		balance=initialBalance;
		customerName=custName;
		System.out.println("Username: "+customerName);
		System.out.println("Initial balance of "+customerName+" "+balance);
	}
	
	void debitAmt(int debitAmount) {
		balance=balance-debitAmount;
		debitCnt++;
		totalDebitCnt++;
	}
	void creditAmt(int creditAmount) {
		balance=balance+creditAmount;
		creditCnt++;
		totalCreditCnt++;
	}
	void printBalanceCount() {
		totalPrintBalance++;
		printBalance++;
		System.out.println("Current balance of "+customerName+" is "+balance);
	}
	void individualTransactionSummary() {
		System.out.println(customerName+"'s"+" transaction summary: "+"credit- "+creditCnt+" times"+","+"debit- "+debitCnt+" times"+","+"printBalance- "+printBalance+" times");
	}
	static void allTransactionSummary() {
		System.out.println("All transaction summary: Credit - " + totalCreditCnt + " times, Debit - " + totalDebitCnt + " times, print Balance - " + totalPrintBalance + " time");
	}
	public static void main(String[] args) {
		BankingSystem1 bankingSystem=new BankingSystem1();
		bankingSystem.setUserDetails("Rashmi",20000);
		bankingSystem.creditAmt(2000);
		bankingSystem.debitAmt(1000);
		bankingSystem.creditAmt(500);
		bankingSystem.individualTransactionSummary();
		bankingSystem.printBalanceCount();
		
		BankingSystem1 bankingSystem2=new BankingSystem1();
		bankingSystem2.setUserDetails("Unnati",25000);
		bankingSystem2.creditAmt(500);
		bankingSystem2.creditAmt(2000);
		bankingSystem2.creditAmt(1000);
		bankingSystem2.creditAmt(3500);
		bankingSystem2.creditAmt(100);
		bankingSystem2.debitAmt(500);
		bankingSystem2.debitAmt(5000);
		bankingSystem2.individualTransactionSummary();
		
		allTransactionSummary();
		
    }

}