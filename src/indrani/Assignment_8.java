package indrani;

public class Assignment_8{
	
	int timesCredited,timesDebited,timesPrinted;
	static int totalNoOfCredits,totalNoOfDebits,totalTimesPrinted;
	String userName="";
	double balance=0.0;
	
	void setUserDetails(double Amount,String Name){
		balance=Amount;
		userName=Name;
	}
	void credit(double amount){
		balance+=amount;
		timesCredited++;
		totalNoOfCredits++;
	}
	void debit(double amount){
		balance-=amount;
		timesDebited++;
		totalNoOfDebits++;
	}
	void printBalance(){
		System.out.println("\n Current account balance for " + userName+"is"+balance);
		timesPrinted++;
		totalTimesPrinted++;
	}
	void individualTransactionSummary(){
		System.out.println("Times money has been credited by individual : "+timesCredited + 
		 "\nTimes money has been debited  : "+timesDebited+ "\nTotal times user has printed :"+timesPrinted);
	}
	void allTransactionSummary(){
	    System.out.println("Total no. of credits: "+totalNoOfCredits+ 
		 "\nTotal no. of debits : "+totalNoOfDebits+ "\nTotal times printed :"+totalTimesPrinted);
	}
    public static void main(String[] args){
		Assignment_8 user1 = new Assignment_8();
		user1.setUserDetails(12346.89,"Indrani Banerjee");
		user1.credit(678.89);
		user1.debit(500.80);
		user1.credit(1200.50);
		user1.debit(300.90);
		user1.printBalance();
		user1.individualTransactionSummary();
		
		Assignment_8 user2 = new Assignment_8();
		user2.setUserDetails(12346.89,"Indrani Banerjee");
		user2.credit(400.50);
		user2.debit(600.80);
		user2.debit(500.70);
		user2.printBalance();
		user2.individualTransactionSummary();
		
		user2.allTransactionSummary();
	}
}

		
	
		
	
		