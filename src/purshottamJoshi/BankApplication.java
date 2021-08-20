package purshottamJoshi;

public class BankApplication {
	String customerName;
	int balance;
	int balanceCount;
	int debitCount;
	int creditCount;
	static int overallBal;
	static int overallDebitCount;
	static int overallCreditCount;
	void setCustomerDetails(String custname,int custBalance) {
		customerName = custname;
		balance = custBalance;
		
	}
	void debitAmount(int debAmt) {
		debitCount++;
		overallDebitCount++;
		balance = balance - debAmt;
	}
	void creditAmount(int credAmt) {
		creditCount++;
		overallCreditCount++;
		balance = balance + credAmt;
	}
	void displayBalance() {
		System.out.println(customerName+" Current Balance is " +balance);
		balanceCount++;
		overallBal++;
	}
	void individualTransactionSummary() {
		System.out.println(customerName+ " Transaction summary:"+"Debit -"+debitCount+" times,"+" Credit -"+creditCount+" times,"+"Display Balance - " +balanceCount+" times");
	}
	static void overAllTransactionSummary() {
		System.out.println("OverAll Transaction Summary:"+"Debit - "+overallDebitCount+" times,"+" Credit - "+overallCreditCount+" times,"+" Display Balance - " +overallBal+" times");
	}
	public static void main(String[] args) {
		BankApplication bankapplication1 = new BankApplication();
		bankapplication1.setCustomerDetails("Purshottam",10000);
		bankapplication1.debitAmount(2000);
		bankapplication1.creditAmount(5000);
		bankapplication1.displayBalance();
		bankapplication1.individualTransactionSummary();
		BankApplication bankapplication2 = new BankApplication();
		bankapplication2.setCustomerDetails("Rohit",20000);
		bankapplication2.debitAmount(4000);
		bankapplication2.debitAmount(1000);
		bankapplication2.displayBalance();
		bankapplication2.creditAmount(4000);
		bankapplication2.displayBalance();
		bankapplication2.individualTransactionSummary();
		overAllTransactionSummary();
	}
}