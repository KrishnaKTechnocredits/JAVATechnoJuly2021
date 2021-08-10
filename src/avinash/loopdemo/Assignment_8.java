package avinash.loopdemo;

/* static and non static*/
public class Assignment_8 {


	int debitAmt;
	int creditAmt;
	int currentBal;
	String userName;
	int initialBal;
	static int totalDebitAmt;
	static int totalCreditAmt;
	static int totalPrintBalCnt;

	void debitAmount() {
		debitAmt++;
		totalDebitAmt++;
	}

	void creditAmount() {
		creditAmt++;
		totalCreditAmt++;
	}

	void printBalance() {
		currentBal++;
		totalPrintBalCnt++;
	}

	void individualTransactionSummary() {
		System.out.println("The debit Amount method for " + userName + " was called " + debitAmt + " times");
		System.out.println("The credit Amount method for " + userName + " was called " + creditAmt + " times");
		System.out.println("The print balance method for " + userName + " was called " + currentBal + " times");
	}

	static void allTransactionSummary() {
		System.out.println("The debit Amount method was called in Total for " + totalDebitAmt + " times");
		System.out.println("The credit Amount method was called in Total for " + totalCreditAmt + " times");
		System.out.println("The print balance method for was called in Total for " + totalPrintBalCnt + " times");

	}

	void setUserDetails(String uName, int amount) {
		initialBal = amount;
		userName = uName;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_8 user1 = new Assignment_8();
		Assignment_8 user2 = new Assignment_8();
		user1.setUserDetails("User1", 10000);
		user2.setUserDetails("User2", 15000);
		user1.debitAmount();
		user1.creditAmount();
		user1.creditAmount();
		user1.printBalance();
		user2.debitAmount();
		user2.debitAmount();
		user2.creditAmount();
		user2.creditAmount();
		user2.creditAmount();
		user2.creditAmount();
		user2.creditAmount();
		user1.individualTransactionSummary();
		user2.individualTransactionSummary();
		allTransactionSummary();
	}
			
		}


