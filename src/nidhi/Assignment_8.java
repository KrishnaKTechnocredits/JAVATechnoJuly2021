package nidhi;

class Assignment_8{
	
	int balance;
	String userName;
	static int sdebit;
	static int scredit;
	static int sprintBal;
	int debit;
	int credit;
	int printBal;
	
	void setUserDetails(String name, int bal){
		userName = name;
		balance = bal;
	}
	
	void debitAmount(int deb){
		balance = balance - deb;
		sdebit++;
		debit++;
	}
	
	void creditAmount(int cre){
		balance = balance + cre;
		scredit++;
		credit++;
	}
	
	void printCurrentBalance(){
		System.out.println(balance);
		sprintBal++;
		printBal++;
	}
	
	void individualTransactionSummary(){
		System.out.println(userName + " transaction summary: Credit - " + credit + "times , Debit - " + debit + "times , print balance - " + printBal + "times");

	
	}
	
	void allTransactionSummary(){	
		System.out.println("All transaction summary: Credit - " + scredit + "times , Debit - " + sdebit + "times , print balance - " + sprintBal + "times");
	}
	
	public static void main(String[] arg){
		Assignment_8 assignment8 = new Assignment_8();
		assignment8.setUserDetails("User-1",10000);
		assignment8.debitAmount(2000);
		assignment8.creditAmount(5000);
		assignment8.debitAmount(1000);
		assignment8.printCurrentBalance();
		assignment8.individualTransactionSummary();
		
		Assignment_8 assignment81 = new Assignment_8();
		assignment81.setUserDetails("User-2",20000);
		assignment81.debitAmount(2000);
		assignment81.creditAmount(5000);
		assignment81.creditAmount(5000);
		assignment81.debitAmount(1000);
		assignment81.printCurrentBalance();
		assignment81.individualTransactionSummary();
		
		assignment8.allTransactionSummary();
	
	}
	
	
	
}
