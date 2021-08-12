package bhakti;

class Assignment_8{
	int debitAmtCount;
	int creditAmtCount;
	float userBalance;
	String username;
	static int totaltimesCountDebitAmt;
	static int totaltimesCountCreditAmt;
	static float totalbalance =0.0f;
	
	void setUserDetails(String Uname, float balance){
		username= Uname;
		userBalance=balance;
		totalbalance= totalbalance+balance;
	}	
	
	void debitAmt(float debAmt){
		debitAmtCount ++;
		userBalance= userBalance - debAmt;
		totaltimesCountDebitAmt++;
		totalbalance= totalbalance- debAmt;
	}	
	
	void creditAmt(float creditAmt){
		creditAmtCount ++;
		userBalance= userBalance + creditAmt;
		totaltimesCountCreditAmt++;
		totalbalance= totalbalance + creditAmt;
	}	
	
	void displayIndividualTransactionSummary() {
		System.out.println("======================================================================");
		System.out.println(username+" Transaction summary:  Credits: "+creditAmtCount+ " times, Debit: " +debitAmtCount+ ", Balance: " +userBalance);
		System.out.println("======================================================================");
	}	
	
	static void displayAllTransactionSummary() {
		System.out.println("======================================================================");
		System.out.println("All transaction summary: Credit: " +totaltimesCountCreditAmt+ " times, Debit: "+totaltimesCountDebitAmt+ ", Total Balance: "+totalbalance);
		System.out.println("======================================================================");
		
	}
	
	public static void main (String [] df){
		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8_1.setUserDetails("Bhakti Kakade", 10f);
		assignment_8_1.debitAmt(1f);
		assignment_8_1.creditAmt(1f);
		assignment_8_1.displayIndividualTransactionSummary();
		
		Assignment_8 assignment_8_2= new Assignment_8();
		assignment_8_2.setUserDetails("Mr. Mohit more", 10f);
		assignment_8_2.debitAmt(1f);
		assignment_8_2.debitAmt(1f);
		assignment_8_2.debitAmt(1f);
		assignment_8_2.creditAmt(2f);
		assignment_8_2.displayIndividualTransactionSummary();
		
		displayAllTransactionSummary();
					
	}	
	
}	