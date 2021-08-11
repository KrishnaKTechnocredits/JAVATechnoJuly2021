package shraddha;

public class BankingTransaction {
	int creditAmt;
	int debitAmt;
	int balance;
	int debitCount;
	int creditCount;
	int balanceCount;
	static int debitCounter;
	static int creditCounter;
	static int printCounter;
	
	String username;
	
	void debitTransaction(int amount) {
		debitAmt = balance - amount;
		debitCount++;
		debitCounter++;
	}
	
	void creditTransaction(int amount) {
		creditAmt = balance + amount;
		creditCount++;
		creditCounter++;
	}
	
	 void printBalance() {
		 balance = creditAmt - debitAmt;
		 System.out.println("Hello "+username+"!! Your current balance is :- Rs."+balance);
		 balanceCount++;
		 printCounter++;
	 }
	 
	 void setUserDetails(String name, int amount) {
		username = name;
		balance = amount;
	 } 
	 
	  void individualTransactionSummary(String username) {
		System.out.println(username + " transaction summary : Credit :- " + creditCount + " times Debit :- "
				+ debitCount + " times printBalance :- " + balanceCount + " time");
	 }
	  
	  static void allTransactionSummary() {
		  System.out.println("--------------------------------------------------------");
		  System.out.println("All transaction summary : Credit :- " + creditCounter + " times Debit :- "
					+ debitCounter + " times printBalance :- " + printCounter + " time");
		  System.out.println("--------------------------------------------------------");
	  }
	  
	  
	public static void main(String[] args) {
		BankingTransaction bankTransaction1 = new BankingTransaction();
		BankingTransaction bankTransaction2 = new BankingTransaction();
		BankingTransaction bankTransaction3 = new BankingTransaction();
		bankTransaction1.setUserDetails("Miracle Foundations", 30000);
		bankTransaction1.printBalance();
		bankTransaction1.creditTransaction(400);
		bankTransaction1.creditTransaction(1200);
		bankTransaction1.creditTransaction(5000);
		bankTransaction1.printBalance();
		bankTransaction1.debitTransaction(100);
		bankTransaction1.debitTransaction(50);
		bankTransaction1.debitTransaction(1200);
		bankTransaction1.debitTransaction(10);
		bankTransaction1.printBalance();
		bankTransaction1.individualTransactionSummary(bankTransaction1.username);
		bankTransaction2.setUserDetails("Atlantis", 5500);
		bankTransaction2.printBalance();
		bankTransaction2.creditTransaction(400);
		bankTransaction2.creditTransaction(6000);
		bankTransaction2.printBalance();
		bankTransaction2.debitTransaction(1000);
		bankTransaction2.printBalance();
		bankTransaction2.individualTransactionSummary(bankTransaction2.username);
		bankTransaction3.printBalance();
		bankTransaction3.setUserDetails("ABC firm", 15000);
		bankTransaction3.printBalance();
		bankTransaction3.creditTransaction(1400);
		bankTransaction3.creditTransaction(460);
		bankTransaction3.creditTransaction(200);
		bankTransaction3.printBalance();
		bankTransaction3.creditTransaction(8000);
		bankTransaction3.printBalance();
		bankTransaction3.creditTransaction(90000);
		bankTransaction3.creditTransaction(5700);
		bankTransaction3.printBalance();
		bankTransaction3.debitTransaction(10220);
		bankTransaction3.debitTransaction(8050);
		bankTransaction3.printBalance();
		bankTransaction3.debitTransaction(1420);
		bankTransaction3.printBalance();
		bankTransaction3.debitTransaction(56340);
		bankTransaction3.printBalance();
		bankTransaction3.individualTransactionSummary(bankTransaction3.username);
		allTransactionSummary();

	}

}
